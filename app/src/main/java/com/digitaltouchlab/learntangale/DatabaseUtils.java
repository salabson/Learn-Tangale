package com.digitaltouchlab.learntangale;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.preference.PreferenceManager;

/**
 * Created by salabs on 13/09/2017.
 */

public class DatabaseUtils {
    private LearnTangaleDbHelper mDbHelper;
    private SQLiteDatabase mDb;
    private Context mContext;

    private DatabaseUtils(Context mContext) {
        this.mContext = mContext;
    }


    public DatabaseUtils Open() {
        mDbHelper = new LearnTangaleDbHelper(mContext);
        mDb = mDbHelper.getReadableDatabase();
        return this;
    }

    public void Close() {
        mDbHelper.close();
    }

    // get all data from the db as cursor
    public Cursor getAllword() {
        Cursor cursor = mDb.query(LearnTangaleContract.WordEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null,
                null);

        return cursor;
    }

    // get selected data from db based on searchView query string
    public Cursor getWordsByQueryString(String query) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(mContext);
        String transLanguage = prefs.getString(mContext.getString(R.string.pref_translation_key),mContext.getString(R.string.pref_english_translation_value));
        Cursor cursor = null;
        // query db by english column
        if (transLanguage.equals(mContext.getString(R.string.pref_english_translation_value))) {
            //String[] selectionArgs = new String[]{"'%" + query + "%'"};
            String selectionByEnglish = LearnTangaleContract.WordEntry.COLUMN_ENGLISH + " LIKE " + "'%" + query + "%'" ;
            cursor = mDb.query(true,LearnTangaleContract.WordEntry.TABLE_NAME,
                    null,
                    selectionByEnglish,
                    null,
                    null,
                    null,
                    null,
                    null);
            //  query db by hausa column
        } else if (transLanguage.equals(mContext.getString(R.string.pref_hausa_translation_value))) {
            String selectionByHausa = LearnTangaleContract.WordEntry.COLUMN_HAUSA + " LIKE " + "'%" + query + "%'" ;
            cursor = mDb.query(true,LearnTangaleContract.WordEntry.TABLE_NAME,
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

    // get all data from the db as cursor
    public Cursor getWordsByCategory(long mCategoryId) {

        Cursor cursor = mDb.query(LearnTangaleContract.WordEntry.TABLE_NAME,
                null,
                LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID+ "=" + mCategoryId,
                null,
                null,
                null,
                null,
                null);

        return cursor;
    }

}



