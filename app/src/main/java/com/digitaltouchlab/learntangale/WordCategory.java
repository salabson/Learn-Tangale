package com.digitaltouchlab.learntangale;

/**
 * Created by salabs on 15/07/2017.
 */

public class WordCategory {
    // define class member variables
    private int categoryId;
    private String categoryName;
    private int categoryImageId;

    // define constructor and initialise member variables
    public WordCategory(int categoryId, String categoryName, int categoryImageId) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryImageId = categoryImageId;
    }

    // define setters
    public String getCategoryName() {
        return this.categoryName;
    }

    public int  getCategoryImageId() {
        return this.categoryImageId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    

}
