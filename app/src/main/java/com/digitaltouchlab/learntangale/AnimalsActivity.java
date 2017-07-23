package com.digitaltouchlab.learntangale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnimalsActivity extends AppCompatActivity {
    ExpandableListView expLV;
    List<Word> parentData ;
    HashMap<String,List<Word>> childData;
     List<Word> words;
    //hold each list for child data
    List<Word> wordList;
   private int lastSelectedItem = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        // make reference to expandable listview
        expLV = new ExpandableListView(this);
        expLV = (ExpandableListView)findViewById(R.id.exp_lv);
        expLV.setGroupIndicator(null);
        expLV.setDivider(getResources().getDrawable(R.color.black));
        expLV.setDividerHeight(1);

        // call method that populate parent and child data
        fillData();

        // create custom adapter object and set expandable list view to it
        WordCustomAdapater customAdapater = new WordCustomAdapater(this,childData,parentData);
        expLV.setAdapter(customAdapater);

               expLV.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
                    @Override
                    public void onGroupExpand(int groupPosition) {
                        if (lastSelectedItem != -1 &&  groupPosition != lastSelectedItem  ) {
                            expLV.collapseGroup(lastSelectedItem);
                        }
                        lastSelectedItem = groupPosition;
                    }
                });


    }

    // method that populate parent and child data
    private void fillData() {
        parentData = new ArrayList<>();
        childData = new HashMap<>();
        words = new ArrayList<>();
        //initialize arraylist of words
        words.add( new Word("Bai", "Dog", "Kare",R.drawable.animals, false));
        words.add( new Word("Babba", "Donkey", "Jaki", R.drawable.donkey, true));
        words.add( new Word("Ankilin", "Lizard", "Kadangare", R.drawable.lizard,false));
        words.add( new Word("Tuje", "Horse", "Doki", R.drawable.horse,true));
        words.add( new Word("Tanga", "Cow", "Shanu", R.drawable.cow, false));
        words.add( new Word("Andokko", "Grasshopper", "Fara", R.drawable.grassphopper, true));
        // create variable that hold each word
        Word word = new Word();

        // iterate through list of words and extract parent and child data
        for (int i = 0; i < words.size(); i++) {
            // get word at specific location
            word = words.get(i);
            //Add the word to parent list
            parentData.add(word);
            // create new list and add it to the child list
            wordList = new ArrayList<>();
            wordList.add(word);
            childData.put(word.getEnglishTranlation(),wordList);
        }







    }
}
