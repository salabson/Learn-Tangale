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
    public static void insertData(SQLiteDatabase db) {
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
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_TANGALE,"Bai");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_ENGLISH, "Dog");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_HAUSA,"Kare");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IMAGEID, R.drawable.animals);
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IS_ADDED_TO_FAVORITE, false);
        list.add(cv);

         cv = new ContentValues();
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_TANGALE,"Babba");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_ENGLISH, "Monkey");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_HAUSA,"Jaki");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IMAGEID, R.drawable.donkey);
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IS_ADDED_TO_FAVORITE, true);
        list.add(cv);

         cv = new ContentValues();
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_TANGALE,"Ankilin");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_ENGLISH, "Lizard");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_HAUSA,"Kadangare");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IMAGEID, R.drawable.lizard);
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IS_ADDED_TO_FAVORITE, false);
        list.add(cv);


         cv = new ContentValues();
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_TANGALE,"Tuje");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_ENGLISH, "Horse");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_HAUSA,"Doki");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IMAGEID, R.drawable.horse);
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IS_ADDED_TO_FAVORITE, true);
        list.add(cv);


         cv = new ContentValues();
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_TANGALE,"Tanga");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_ENGLISH, "Cow");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_HAUSA,"Shanu");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IMAGEID, R.drawable.cow);
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IS_ADDED_TO_FAVORITE, false);
        list.add(cv);


         cv = new ContentValues();
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_TANGALE,"Andokko");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_ENGLISH, "Grasshopper");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_HAUSA,"Fara");
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IMAGEID, R.drawable.grassphopper);
        cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IS_ADDED_TO_FAVORITE, true);
        list.add(cv);

        try {
            db.beginTransaction();
            // clear db
            db.delete(LearnTangaleContract.LearnTangaleEntry.TABLE_NAME,null,null);
            // loop to insert data in the list
            for (ContentValues c : list) {
                db.insert(LearnTangaleContract.LearnTangaleEntry.TABLE_NAME,null,c);
            }
            db.setTransactionSuccessful();

        } catch (SQLException e) {
        }finally {
            db.endTransaction();
        }



    }
}
