package com.digitaltouchlab.learntangale;

import android.database.Cursor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by salabs on 26/09/2017.
 */

public class LoadData {


    // method that populate parent and child data
    public static void fillData(List<Word> parentData, HashMap<String, List<Word>> childData, Cursor mCursor) {


        ArrayList<Word> words = new ArrayList<>();
        ArrayList<Word> ChildwordList ;

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
            words.add(new Word(id, tangale, english, hausa, imageId, isAddedToFavorite, categoryId));
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
            ChildwordList = new ArrayList<>();
            ChildwordList.add(word);
            childData.put(word.getEnglishTranlation(), ChildwordList);
        }


    }
}
