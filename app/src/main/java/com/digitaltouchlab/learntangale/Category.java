package com.digitaltouchlab.learntangale;

/**
 * Created by salabs on 11/09/2017.
 */

public class Category {
    //  private members
    private int id;
    private String name;
    private String image_id;

    public Category(int id, String name, String image_id) {
        this.id = id;
        this.name = name;
        this.image_id = image_id;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage_id() {
        return image_id;
    }
}
