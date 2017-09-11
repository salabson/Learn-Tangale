package com.digitaltouchlab.learntangale;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import com.digitaltouchlab.learntangale.LearnTangaleContract;

/**
 * Created by salabs on 23/07/2017.
 */

public class InsertData {
    public static void insertCategpryData(SQLiteDatabase db) {
        if(db == null) return;

       /* //initialize arraylist of words
        words.add( new Word("Bai", "Dog", "Kare",R.drawable.animals, false));
        words.add( new Word("Babba", "Donkey", "Jaki", R.drawable.donkey, true));
        words.add( new Word("Ankilin", "Lizard", "Kadangare", R.drawable.lizard,false));
        words.add( new Word("Tuje", "Horse", "Doki", R.drawable.horse,true));
        words.add( new Word("Tanga", "Cow", "Shanu", R.drawable.cow, false));
        words.add( new Word("Andokko", "Grasshopper", "Fara", R.drawable.grassphopper, true));*/

        // list of data to be insert to db
        List<ContentValues> list = new ArrayList<ContentValues>();

        ContentValues cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Animals");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.animals);

        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Family");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.family);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Counting");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.numbers);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Enquiries");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.question);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Phrases");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.phrases);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Time and Seasons");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.time);
        list.add(cv);

        try {
            db.beginTransaction();
            // clear db
            db.delete(LearnTangaleContract.CategoryEntry.TABLE_NAME,null,null);
            // loop to insert data in the list
            for (ContentValues c : list) {
                db.insert(LearnTangaleContract.CategoryEntry.TABLE_NAME,null,c);
            }
            db.setTransactionSuccessful();
            db.endTransaction();

        } catch (SQLException e) {
        }finally {
        }



    }

    public static void insertWordData(SQLiteDatabase db) {
        if(db == null) return;

       /* //initialize arraylist of words
        words.add( new Word("Bai", "Dog", "Kare",R.drawable.animals, false));
        words.add( new Word("Babba", "Donkey", "Jaki", R.drawable.donkey, true));
        words.add( new Word("Ankilin", "Lizard", "Kadangare", R.drawable.lizard,false));
        words.add( new Word("Tuje", "Horse", "Doki", R.drawable.horse,true));
        words.add( new Word("Tanga", "Cow", "Shanu", R.drawable.cow, false));
        words.add( new Word("Andokko", "Grasshopper", "Fara", R.drawable.grassphopper, true));*/

        // list of data to be insert to db
        List<ContentValues> list = new ArrayList<ContentValues>();

        ContentValues cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Bai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Dog");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kare");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.animals);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,1);
        list.add(cv);

         cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Babba");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Monkey");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Jaki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.donkey);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "true");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,1);
        list.add(cv);

         cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ankilin");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Lizard");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kadangare");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.lizard);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,1);
        list.add(cv);


         cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tuje");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Horse");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Doki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.horse);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "true");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,1);
        list.add(cv);


         cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tanga");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Cow");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shanu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.cow);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,1);
        list.add(cv);


         cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Andokko");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Grasshopper");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Fara");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.grassphopper);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "true");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,1);
        list.add(cv);

        try {
            db.beginTransaction();
            // clear db
            db.delete(LearnTangaleContract.WordEntry.TABLE_NAME,null,null);
            // loop to insert data in the list
            for (ContentValues c : list) {
                db.insert(LearnTangaleContract.WordEntry.TABLE_NAME,null,c);
            }
            db.setTransactionSuccessful();
            db.endTransaction();

        } catch (SQLException e) {
        }finally {
        }



    }
}
