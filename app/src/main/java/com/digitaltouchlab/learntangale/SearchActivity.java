package com.digitaltouchlab.learntangale;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.NavUtils;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.preference.PreferenceManager;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    ExpandableListView expLV;
    List<Word> parentData;
    HashMap<String, List<Word>> childData;
    List<Word> words;
    //hold each list for child data
    List<Word> wordList;
    // no item selected for the parent list view for the first time
    private int lastSelectedItem = -1;
    // database  access variables
    SQLiteDatabase db;
    LearnTangaleDbHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);
        handleIntent(getIntent());
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        dbHelper = new LearnTangaleDbHelper(this);
        db = dbHelper.getWritableDatabase();


        // make reference to expandable listview
        expLV = new ExpandableListView(this);
        expLV = (ExpandableListView) findViewById(R.id.exp_lv);
        expLV.setGroupIndicator(null);
        expLV.setDivider(getResources().getDrawable(R.color.black));
        expLV.setDividerHeight(1);

        // call method that populate parent and child data
        Cursor mCursor = getAllWords();
        fillData(mCursor);

        // create custom adapter object and set expandable list view to it
        WordCustomAdapater customAdapater = new WordCustomAdapater(this, childData, parentData);
        expLV.setAdapter(customAdapater);

        // collapse one parent list view item when another is expanded
        expLV.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {

                if (lastSelectedItem != -1 && groupPosition != lastSelectedItem) {
                    expLV.collapseGroup(lastSelectedItem);
                }
                lastSelectedItem = groupPosition;
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    // this method retrieve search query
    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);

            Cursor cursor = getWordsByQueryString(query);
            fillData(cursor);
            WordCustomAdapater customAdapater = new WordCustomAdapater(this, childData, parentData);
            expLV.setAdapter(customAdapater);
            Log.v("QUERY", query);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second_tangale_menu, menu);
        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        MenuItem searchViewItem = menu.findItem(R.id.action_search_2);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchViewItem);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setIconified(false);
        searchView.setSubmitButtonEnabled(true);
        searchView.setMaxWidth(Integer.MAX_VALUE);
        MenuItemCompat.expandActionView(searchViewItem);

        // set searchview hint depending value translation language in sharedprefs
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String transLanguage = prefs.getString(getString(R.string.pref_translation_key),getString(R.string.pref_english_translation_value));
        if (transLanguage.equals(getString(R.string.pref_english_translation_value))) {
            searchView.setQueryHint(getString(R.string.search_hint_english));
        } else if (transLanguage.equals(getString(R.string.pref_hausa_translation_value))) {
            searchView.setQueryHint(getString(R.string.search_hint_hausa));
        }


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (TextUtils.isEmpty(newText) || newText.length() == 0) {
                    Cursor cursor = getAllWords();
                    fillData(cursor);
                    WordCustomAdapater customAdapater = new WordCustomAdapater(SearchActivity.this, childData, parentData);
                    expLV.setAdapter(customAdapater);
                } else {
                    Cursor cursor = getWordsByQueryString(newText);
                    fillData(cursor);
                    WordCustomAdapater customAdapater = new WordCustomAdapater(SearchActivity.this, childData, parentData);
                    expLV.setAdapter(customAdapater);
                }

                return true;
            }
        });

        MenuItemCompat.setOnActionExpandListener(searchViewItem, new MenuItemCompat.OnActionExpandListener() {
            @Override
            public boolean onMenuItemActionExpand(MenuItem item) {
                return true;
            }

            @Override
            public boolean onMenuItemActionCollapse(MenuItem item) {
                finish();
                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    // method that populate parent and child data
    private void fillData(Cursor cursor) {
        parentData = new ArrayList<>();
        childData = new HashMap<>();
        words = new ArrayList<>();
        // call to method that return all words the db

        //iterate through the cursor to initialize the arraylist of words
        for (int y = 0; y < cursor.getCount(); y++) {
            // move cursor to specific row for reading
            cursor.moveToPosition(y);
            // retrieve each column value of the cursor and store it in a variable
            int id = cursor.getInt(cursor.getColumnIndex(LearnTangaleContract.LearnTangaleEntry._ID));
            String tangale = cursor.getString(cursor.getColumnIndex(LearnTangaleContract.LearnTangaleEntry.COLUMN_TANGALE));
            String english = cursor.getString(cursor.getColumnIndex(LearnTangaleContract.LearnTangaleEntry.COLUMN_ENGLISH));
            String hausa = cursor.getString(cursor.getColumnIndex(LearnTangaleContract.LearnTangaleEntry.COLUMN_HAUSA));
            int imageId = cursor.getInt(cursor.getColumnIndex(LearnTangaleContract.LearnTangaleEntry.COLUMN_IMAGEID));
            String isAddedToFavorite = cursor.getString(cursor.getColumnIndex(LearnTangaleContract.LearnTangaleEntry.COLUMN_IS_ADDED_TO_FAVORITE));
            // create word object correspond to each row of cursor and add it word list
            words.add(new Word(id,tangale, english, hausa, imageId, isAddedToFavorite));
        }

        // create variable that hold each word
        Word word = new Word();

        // iterate through list of words and extract parent and child data
        for (int i = 0; i < words.size(); i++) {
            // get word at specific location
            word = words.get(i);
            //Add the word to parent list
            parentData.add(word);
            // create new list and add it to the child list
            wordList = new ArrayList<>();
            wordList.add(word);
            childData.put(word.getEnglishTranlation(), wordList);
        }

    }


    // get all data from the db as cursor
    public Cursor getAllWords() {

        Cursor cursor = db.query(LearnTangaleContract.LearnTangaleEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null,
                null);

        return cursor;
    }

    public Cursor getWordsByQueryString(String query) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String transLanguage = prefs.getString(getString(R.string.pref_translation_key),getString(R.string.pref_english_translation_value));
         Cursor cursor = null;
        if (transLanguage.equals(getString(R.string.pref_english_translation_value))) {
            //String[] selectionArgs = new String[]{"'%" + query + "%'"};
            String selectionByEnglish = LearnTangaleContract.LearnTangaleEntry.COLUMN_ENGLISH + " LIKE " + "'%" + query + "%'" ;
             cursor = db.query(true,LearnTangaleContract.LearnTangaleEntry.TABLE_NAME,
                    null,
                    selectionByEnglish,
                    null,
                    null,
                    null,
                    null,
                    null);

        } else if (transLanguage.equals(getString(R.string.pref_hausa_translation_value))) {
             String selectionByHausa = LearnTangaleContract.LearnTangaleEntry.COLUMN_HAUSA + " LIKE " + "'%" + query + "%'" ;
             cursor = db.query(true,LearnTangaleContract.LearnTangaleEntry.TABLE_NAME,
                    null,
                    selectionByHausa,
                    null,
                    null,
                    null,
                    null,
                    null);
        }
        return cursor;
    }


}