package com.digitaltouchlab.learntangale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnimalsActivity extends AppCompatActivity {
    ExpandableListView expLV;
    List<String> parentData ;
    HashMap<String,String> childData;
     List<Word> words;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        expLV = (ExpandableListView)findViewById(R.id.exp_lv);

        fillData();

        WordCustomAdapater customAdapater = new WordCustomAdapater(this,childData,parentData);
        expLV.setAdapter(customAdapater);


    }


    private void fillData() {
        parentData = new ArrayList<>();
        childData = new HashMap<>();
        words.add( new Word("Bai", "Dog", "Kare"));
        words.add( new Word("Babba", "Donkey", "Jaki"));
        words.add( new Word("Ankilin", "Lizard", "Kadangare"));
        words.add( new Word("Tuje", "Horse", "Doki"));
        words.add( new Word("Bai", "Dog", "Kare"));
        words.add( new Word("Andokko", "Grasshopper", "Fara"));
        Word word = new Word();

        for (int i = 0; i < words.size(); i++) {
            word = words.get(i);
            parentData.add(word.getEnglishTranlation());
            childData.put(word.getEnglishTranlation(),word.getTangaleTranlation());
        }



    }
}
