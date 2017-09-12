package com.digitaltouchlab.learntangale;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.preference.PreferenceManager;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnimalsActivity extends AppCompatActivity implements SharedPreferences.OnSharedPreferenceChangeListener{
    ExpandableListView expLV;
    List<Word> parentData ;
    HashMap<String,List<Word>> childData;
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

        dbHelper = new LearnTangaleDbHelper(this);
        db = dbHelper.getWritableDatabase();


        // make reference to expandable listview
        expLV = new ExpandableListView(this);
        expLV = (ExpandableListView)findViewById(R.id.exp_lv);
        expLV.setGroupIndicator(null);
        expLV.setDivider(getResources().getDrawable(R.color.black));
        expLV.setDividerHeight(1);

        // call method that populate parent and child data
        fillData();

        // create custom adapter object and set expandable list view to it
        WordCustomAdapater customAdapater = new WordCustomAdapater(this,childData,parentData);
        expLV.setAdapter(customAdapater);
                // collapse one parent list view item when another is expanded
               expLV.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    @Override
                    public void onGroupExpand(int groupPosition) {

                        if (lastSelectedItem != -1 &&  groupPosition != lastSelectedItem  ) {
                            expLV.collapseGroup(lastSelectedItem);
                        }
                        lastSelectedItem = groupPosition;
                    }
                });



    }

    // method that populate parent and child data
    private void fillData() {
        parentData = new ArrayList<>();
        childData = new HashMap<>();
        words = new ArrayList<>();
        // call to method that return all words the db
        Cursor mCursor = getAllWords();

        //iterate through the cursor to initialize the arraylist of words
        for (int y = 0; y < mCursor.getCount(); y++) {
                // move cursor to specific row for reading
                mCursor.moveToPosition(y);
                // retrieve each column value of the cursor and store it in a variable
                int id = mCursor.getInt(mCursor.getColumnIndex(LearnTangaleContract.WordEntry._ID));
                String tangale = mCursor.getString(mCursor.getColumnIndex(LearnTangaleContract.WordEntry.COLUMN_TANGALE));
                String english = mCursor.getString(mCursor.getColumnIndex(LearnTangaleContract.WordEntry.COLUMN_ENGLISH));
                String hausa = mCursor.getString(mCursor.getColumnIndex(LearnTangaleContract.WordEntry.COLUMN_HAUSA));
                int imageId = mCursor.getInt(mCursor.getColumnIndex(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID));
                String isAddedToFavorite = mCursor.getString(mCursor.getColumnIndex(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE));
                int categoryId = mCursor.getInt(mCursor.getColumnIndex(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID));

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
            childData.put(word.getEnglishTranlation(),wordList);
        }







    }

    // get all data from the db as cursor
    public Cursor getAllWords() {

         Cursor cursor = db.query(LearnTangaleContract.WordEntry.TABLE_NAME,
                null,
                 LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID+ "=" + 1,
                null,
                null,
                null,
                null,
                null);

        return cursor;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.learn_tangale_menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Intent settingIntent = new Intent(this,SettingsActivity.class);
            startActivity(settingIntent);
            return true;
        } else if (id == R.id.action_search) {
            Intent searchIntent = new Intent(this,SearchActivity.class);
            startActivity(searchIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




    @Override
    protected void onResume() {
        super.onResume();
         PreferenceManager.getDefaultSharedPreferences(this)
                 .registerOnSharedPreferenceChangeListener(this);

        fillData();
        WordCustomAdapater customAdapater = new WordCustomAdapater(this,childData,parentData);
        expLV.setAdapter(customAdapater);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        PreferenceManager.getDefaultSharedPreferences(this)
                .unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String Key) {

        // call method that populate parent and child data
        fillData();

        // create custom adapter object and set expandable list view to it
        WordCustomAdapater customAdapater = new WordCustomAdapater(this,childData,parentData);

    }
}
