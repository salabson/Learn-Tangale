package com.digitaltouchlab.learntangale;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.preference.PreferenceManager;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FavoriteActivity extends AppCompatActivity {
    ExpandableListView expLV;
    List<Word> parentData ;
    HashMap<String,List<Word>> childData;
    List<Word> words;
    //hold each list for child data
    List<Word> wordList;
    // no item selected for the parent list view for the first time
    private int lastSelectedItem = -1;
    // database  access variables
    DatabaseUtils mDbUtils;
    SQLiteDatabase db;
    LearnTangaleDbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        ActionBar actionBar = this.getSupportActionBar();
        // Set the action bar back button to look like an up button
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        dbHelper = new LearnTangaleDbHelper(this);
        db = dbHelper.getWritableDatabase();
        mDbUtils = new DatabaseUtils(this);


        // make reference to expandable listview
        expLV = new ExpandableListView(this);
        expLV = (ExpandableListView)findViewById(R.id.exp_lv);
        expLV.setGroupIndicator(null);
        expLV.setDivider(getResources().getDrawable(R.color.black));
        expLV.setDividerHeight(1);

        // call method that populate parent and child data
        mDbUtils.Open();
        Cursor cursor = mDbUtils.getFavoriteWords();
        fillData(cursor);

        // create custom adapter object and set expandable list view to it
        FavoriteCustomAdapter customAdapater = new FavoriteCustomAdapter(this,childData,parentData);
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
            int id = cursor.getInt(cursor.getColumnIndex(LearnTangaleContract.WordEntry._ID));
            String tangale = cursor.getString(cursor.getColumnIndex(LearnTangaleContract.WordEntry.COLUMN_TANGALE));
            String english = cursor.getString(cursor.getColumnIndex(LearnTangaleContract.WordEntry.COLUMN_ENGLISH));
            String hausa = cursor.getString(cursor.getColumnIndex(LearnTangaleContract.WordEntry.COLUMN_HAUSA));
            int imageId = cursor.getInt(cursor.getColumnIndex(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID));
            String isAddedToFavorite = cursor.getString(cursor.getColumnIndex(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE));
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

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(this.getClass().getName(),"onPause call");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Cursor cursor = mDbUtils.getFavoriteWords();
        fillData(cursor);
        // create custom adapter object and set expandable list view to it
        FavoriteCustomAdapter customAdapater = new FavoriteCustomAdapter(this,childData,parentData);
        expLV.setAdapter(customAdapater);
        Log.v(this.getClass().getName(),"Onresume call");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        // When the home button is pressed, take the user back to the VisualizerActivity
        if (id == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
        }
        return super.onOptionsItemSelected(item);
    }

}
