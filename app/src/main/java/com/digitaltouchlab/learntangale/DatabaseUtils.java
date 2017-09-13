package com.digitaltouchlab.learntangale;

import android.content.Context;
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


    
}
