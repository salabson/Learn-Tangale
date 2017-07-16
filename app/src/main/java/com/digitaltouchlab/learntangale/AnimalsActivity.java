package com.digitaltouchlab.learntangale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnimalsActivity extends AppCompatActivity {
    ExpandableListView expLV;
    List<String> parentData ;
    HashMap<String,List<String>> childData;
     List<Word> words;
    //hold each list for child data
    List<String> wordList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        // make reference to expandable listview
        expLV = new ExpandableListView(this);
        expLV = (ExpandableListView)findViewById(R.id.exp_lv);

        // call method that populate parent and child data
        fillData();

        // create custom adapter object and set expandable list view to it
        WordCustomAdapater customAdapater = new WordCustomAdapater(this,childData,parentData);
        expLV.setAdapter(customAdapater);


    }

    // method that populate parent and child data
    private void fillData() {
        parentData = new ArrayList<>();
        childData = new HashMap<>();
        words = new ArrayList<>();
        //initialize arraylist of words
        words.add( new Word("Bai", "Dog", "Kare"));
        words.add( new Word("Babba", "Donkey", "Jaki"));
        words.add( new Word("Ankilin", "Lizard", "Kadangare"));
        words.add( new Word("Tuje", "Horse", "Doki"));
        words.add( new Word("Tanga", "Cow", "Shanu"));
        words.add( new Word("Andokko", "Grasshopper", "Fara"));
        // create variable that hold each word
        Word word = new Word();

        //
        for (int i = 0; i < words.size(); i++) {
            word = words.get(i);
            parentData.add(word.getEnglishTranlation());
            wordList = new ArrayList<>();
            wordList.add(word.getTangaleTranlation());
            childData.put(word.getEnglishTranlation(),wordList);
        }







    }
}
