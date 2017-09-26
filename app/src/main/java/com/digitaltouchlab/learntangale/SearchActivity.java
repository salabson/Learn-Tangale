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
import android.support.v7.widget.Toolbar;
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
    DatabaseUtils mDbUtils;
    SQLiteDatabase db;
    LearnTangaleDbHelper dbHelper;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        handleIntent(getIntent());


        dbHelper = new LearnTangaleDbHelper(this);
        db = dbHelper.getWritableDatabase();
         mDbUtils = new DatabaseUtils(this);


        // make reference to expandable listview
        expLV = new ExpandableListView(this);
        expLV = (ExpandableListView) findViewById(R.id.exp_lv);
        expLV.setGroupIndicator(null);
        expLV.setDivider(getResources().getDrawable(R.color.black));
        expLV.setDividerHeight(1);

        // call method that populate parent and child data
        // initialize parent and child data viriables
        parentData = new ArrayList<>();
        childData = new HashMap<>();

        // call method that populate parent and child data
        mDbUtils.Open();
        Cursor cursor = mDbUtils.getAllword();
        LoadData.fillData(parentData, childData, cursor);

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

            Cursor cursor = mDbUtils.getWordsByQueryString(query);
            LoadData.fillData(parentData, childData, cursor);
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
                // load all data from the Db if searchview is empty
                if (TextUtils.isEmpty(newText) || newText.length() == 0) {
                    Cursor cursor = mDbUtils.getAllword();
                    LoadData.fillData(parentData, childData, cursor);
                    WordCustomAdapater customAdapater = new WordCustomAdapater(SearchActivity.this, childData, parentData);
                    expLV.setAdapter(customAdapater);
                    // load all data from the Db based on searchview string
                } else {
                    Cursor cursor = mDbUtils.getWordsByQueryString(newText);
                    LoadData.fillData(parentData, childData, cursor);
                    WordCustomAdapater customAdapater = new WordCustomAdapater(SearchActivity.this, childData, parentData);
                    expLV.setAdapter(customAdapater);
                }

                return true;
            }
        });

        MenuItemCompat.setOnActionExpandListener(searchViewItem, new MenuItemCompat.OnActionExpandListener() {
            @Override
            // this expand the search view as it return true
            public boolean onMenuItemActionExpand(MenuItem item) {
                return true;
            }

            @Override
            //this close the search activity as search view collapse
            public boolean onMenuItemActionCollapse(MenuItem item) {
               finish();
                return true;
            }
        });

        return true;
    }
    @Override
    protected void onPause() {
        super.onPause();
        mDbUtils.Close();

    }
    @Override
    protected void onResume() {
        super.onResume();
        mDbUtils.Open();
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

}