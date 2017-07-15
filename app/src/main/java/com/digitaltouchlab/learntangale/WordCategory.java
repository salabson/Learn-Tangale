package com.digitaltouchlab.learntangale;

/**
 * Created by salabs on 15/07/2017.
 */

public class WordCategory {
    // define class member variables
    private String categoryName;
    private int categoryImageId;

    // define constructor and initialise member variables
    public WordCategory(String categoryName, int categoryImageId) {
        this.categoryName = categoryName;
        this.categoryImageId = categoryImageId;
    }

    // define getters
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void  setCategoryImageId(int categoryImageId) {
        this.categoryImageId = categoryImageId;
    }
}
