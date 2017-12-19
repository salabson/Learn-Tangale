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
    private final static int  DATABASE_VERSION = 9;

    public LearnTangaleDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String SQL_CREATE_CATEGORY_TABLE = "CREATE TABLE " + LearnTangaleContract.CategoryEntry.TABLE_NAME + " ("
                + LearnTangaleContract.CategoryEntry._ID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + LearnTangaleContract.CategoryEntry.COLUMN_NAME+ " TEXT NOT NULL, "
                + LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID+ " TEXT NOT NULL"
                + "); ";

        // create table to hold words data
        final String SQL_CREATE_WORD_TABLE = "CREATE TABLE " + LearnTangaleContract.WordEntry.TABLE_NAME + " ("
                 + LearnTangaleContract.WordEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                 + LearnTangaleContract.WordEntry.COLUMN_TANGALE + " TEXT NOT NULL, "
                 + LearnTangaleContract.WordEntry.COLUMN_ENGLISH + " TEXT NOT NULL, "
                 + LearnTangaleContract.WordEntry.COLUMN_HAUSA + " TEXT NOT NULL, "
                 + LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID + " INT NOT NULL, "
                 + LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE + " TEXT NOT NULL, "
                 + LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID + " INT NOT NULL, "
                 + "FOREIGN KEY"+"("+LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID+") "
                 + "REFERENCES "+ LearnTangaleContract.CategoryEntry.TABLE_NAME
                 + "("+ LearnTangaleContract.CategoryEntry._ID+")); ";
        // execute  the query against Db
        sqLiteDatabase.execSQL(SQL_CREATE_CATEGORY_TABLE);
        sqLiteDatabase.execSQL(SQL_CREATE_WORD_TABLE);



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // For now simply drop the table and create a new one. This means if you change the
        // DATABASE_VERSION the table will be dropped.
        // In a production app, this method might be modified to ALTER the table
        // instead of dropping it, so that existing data is not deleted.
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + LearnTangaleContract.CategoryEntry.TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + LearnTangaleContract.WordEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);


    }
}
