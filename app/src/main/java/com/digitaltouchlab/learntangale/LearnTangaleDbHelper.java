package com.digitaltouchlab.learntangale;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static android.R.attr.version;

/**
 * Created by salabs on 23/07/2017.
 */

public class LearnTangaleDbHelper extends SQLiteOpenHelper{

        // the database name
    private static final String DATABASE_NAME = "learntangale.db";

    // If you change the database schema, you must increment the database version
    private final static int  DATABASE_VERSION = 1;

    public LearnTangaleDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // create table to hold learn tangale data
        final String SQL_CREATE_LEARN_TANGALE_TABLE = "CREATE TABLE " + LearnTangaleContract.LearnTangaleEntry.TABLE_NAME + " ("
                 + LearnTangaleContract.LearnTangaleEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                 + LearnTangaleContract.LearnTangaleEntry.COLUMN_TANGALE + " TEXT NOT NULL"
                 + LearnTangaleContract.LearnTangaleEntry.COLUMN_ENGLISH + " TEXT NOT NULL, "
                 + LearnTangaleContract.LearnTangaleEntry.COLUMN_HAUSA + " TEXT NOT NULL, "
                 + LearnTangaleContract.LearnTangaleEntry.COLUMN_IMAGEID + " INT NOT NULL"
                 + LearnTangaleContract.LearnTangaleEntry.COLUMN_IS_ADDED_TO_FAVORITE + " BOOLEAN NOT NULL"
                 + "); ";
        // execute  the query against Db
        sqLiteDatabase.execSQL(SQL_CREATE_LEARN_TANGALE_TABLE);



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // For now simply drop the table and create a new one. This means if you change the
        // DATABASE_VERSION the table will be dropped.
        // In a production app, this method might be modified to ALTER the table
        // instead of dropping it, so that existing data is not deleted.
        sqLiteDatabase.execSQL("DROP TABLE IF EXIST " + LearnTangaleContract.LearnTangaleEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);


    }
}
