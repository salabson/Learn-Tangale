package com.digitaltouchlab.learntangale;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnimalsActivity extends AppCompatActivity {
    ExpandableListView expLV;
    List<Word> parentData ;
    HashMap<String,List<Word>> childData;
     List<Word> words;
    //hold each list for child data
    List<Word> wordList;
   private int lastSelectedItem = -1;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        InsertData.insertData(db);

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
        Cursor mCursor = getAllWords();
        //initialize arraylist of words
        for (int y = 0; y < mCursor.getCount(); y++) {
            String tangale = mCursor.getString(mCursor.getColumnIndex(LearnTangaleContract.LearnTangaleEntry.COLUMN_TANGALE));
            String english = mCursor.getString(mCursor.getColumnIndex(LearnTangaleContract.LearnTangaleEntry.COLUMN_ENGLISH));
            String hausa = mCursor.getString(mCursor.getColumnIndex(LearnTangaleContract.LearnTangaleEntry.COLUMN_HAUSA));
            int imageId = mCursor.getInt(mCursor.getColumnIndex(LearnTangaleContract.LearnTangaleEntry.COLUMN_IMAGEID));
            boolean isAddedToFavorite = Boolean.parseBoolean(mCursor.getString(mCursor.getColumnIndex(LearnTangaleContract.LearnTangaleEntry.COLUMN_IS_ADDED_TO_FAVORITE)));
            words.add( new Word(tangale, english, hausa, imageId, isAddedToFavorite));

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


    public Cursor getAllWords() {
        return db.query(LearnTangaleContract.LearnTangaleEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null,
                null);
    }
}
