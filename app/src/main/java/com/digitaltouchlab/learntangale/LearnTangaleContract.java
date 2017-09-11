package com.digitaltouchlab.learntangale;

import android.provider.BaseColumns;

/**
 * Created by salabs on 23/07/2017.
 */

public class LearnTangaleContract {

    public static final class WordEntry implements BaseColumns {
        public static final String TABLE_NAME ="word";
        public static final String COLUMN_TANGALE ="tangale";
        public static final String COLUMN_ENGLISH ="english";
        public static final String COLUMN_HAUSA ="hausa";
        public static final String COLUMN_IMAGE_ID ="image_id";
        public static final String COLUMN_IS_ADDED_TO_FAVORITE ="isAddedToFavorite";
        public static final String COLUMN_CATEGORY_ID ="category_id";

    }

    public static final class CategoryEntry implements BaseColumns {
        public static final String TABLE_NAME ="category";
        public static final String COLUMN_NAME ="name";
        public static final String COLUMN_IMAGE_ID ="image_Id";
    }


}
