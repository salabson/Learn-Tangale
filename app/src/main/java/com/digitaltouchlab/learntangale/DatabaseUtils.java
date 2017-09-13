package com.digitaltouchlab.learntangale;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

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


}
