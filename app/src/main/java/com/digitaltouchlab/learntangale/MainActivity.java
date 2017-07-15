package com.digitaltouchlab.learntangale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<WordCategory> wordCategories;
    GridView categotyGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get reference to gridviw from the main layout
        categotyGV = (GridView) findViewById(R.id.gridViewMain);

        // call fill data method tp populate word category array list
        fillData();

        // gridiew adapter to our custom adapter
        CategoryCustomAdapter customAdapter = new CategoryCustomAdapter(this,wordCategories);
        categotyGV.setAdapter(customAdapter);




    }

    private void fillData() {
        wordCategories = new ArrayList<>();
        wordCategories.add(new WordCategory("Animals", R.drawable.catagoryimage));
        wordCategories.add(new WordCategory("Family", R.drawable.catagoryimage));
        wordCategories.add(new WordCategory("Counting", R.drawable.catagoryimage));
        wordCategories.add(new WordCategory("Enquiries", R.drawable.catagoryimage));
        wordCategories.add(new WordCategory("Phrases", R.drawable.catagoryimage));

    }

}
