package com.digitaltouchlab.learntangale;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import com.digitaltouchlab.learntangale.LearnTangaleContract;

import static com.digitaltouchlab.learntangale.MainActivity.ANIMALS;
import static com.digitaltouchlab.learntangale.MainActivity.BASICS;
import static com.digitaltouchlab.learntangale.MainActivity.CLIMATE_WEATHER;
import static com.digitaltouchlab.learntangale.MainActivity.COMMON_ACTIONS;
import static com.digitaltouchlab.learntangale.MainActivity.FAMILY;
import static com.digitaltouchlab.learntangale.MainActivity.FARM;
import static com.digitaltouchlab.learntangale.MainActivity.GENERAL_WORDS;
import static com.digitaltouchlab.learntangale.MainActivity.GREETINGS;
import static com.digitaltouchlab.learntangale.MainActivity.HOME_OBJECTS;
import static com.digitaltouchlab.learntangale.MainActivity.HUMAN_BODY;
import static com.digitaltouchlab.learntangale.MainActivity.TIME_DATE;

/**
 * Created by salabs on 23/07/2017.
 */

public class InsertData {
    public static void insertCategpryData(SQLiteDatabase db) {

        if(db == null) return;

       /* //initialize arraylist of words
        words.add( new Word("Bai", "Dog", "Kare",R.drawable.animals, false));
        words.add( new Word("Babba", "Donkey", "Jaki", R.drawable.donkey, true));
        words.add( new Word("Ankilin", "Lizard", "Kadangare", R.drawable.lizard,false));
        words.add( new Word("Tuje", "Horse", "Doki", R.drawable.horse,true));
        words.add( new Word("Tanga", "Cow", "Shanu", R.drawable.cow, false));
        words.add( new Word("Andokko", "Grasshopper", "Fara", R.drawable.grassphopper, true));*/

        // list of data to be insert to db
        List<ContentValues> list = new ArrayList<ContentValues>();

        ContentValues cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Basics");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.basic);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Animals");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.animal);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Family");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.family);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Home Objects");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.homeobjects);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Counting");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.counting);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Enquiries");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.question);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"General Conversation");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.coversation);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Time and Date");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.time);
        list.add(cv);
        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Greetings");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.greeting);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Weather and Climate");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.weather);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Common words");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.word);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Action words");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.action);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Human Body");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.body);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Colors");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.colours);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Farm");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.farm);
        list.add(cv);



        try {
            db.beginTransaction();
            // clear db
            db.delete(LearnTangaleContract.CategoryEntry.TABLE_NAME,null,null);
            // loop to insert data in the list
            for (ContentValues c : list) {
                db.insert(LearnTangaleContract.CategoryEntry.TABLE_NAME,null,c);
            }
            db.setTransactionSuccessful();
            db.endTransaction();

        } catch (SQLException e) {
        }finally {
        }



    }

    public static void insertWordData(SQLiteDatabase db) {
        if(db == null) return;

       /* //initialize arraylist of words
        words.add( new Word("Bai", "Dog", "Kare",R.drawable.animals, false));
        words.add( new Word("Babba", "Donkey", "Jaki", R.drawable.donkey, true));
        words.add( new Word("Ankilin", "Lizard", "Kadangare", R.drawable.lizard,false));
        words.add( new Word("Tuje", "Horse", "Doki", R.drawable.horse,true));
        words.add( new Word("Tanga", "Cow", "Shanu", R.drawable.cow, false));
        words.add( new Word("Andokko", "Grasshopper", "Fara", R.drawable.grassphopper, true));*/

        // list of data to be insert to db
        List<ContentValues> list = new ArrayList<ContentValues>();

        ContentValues cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yonge");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Pig");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Alade");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_pig);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

         cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Telem");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Giraffe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Rakumin dawa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_giraffe);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "true");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

         cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Amfara/Turum");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Lion");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Zaki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_lion);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);


         cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wokupiyo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Owl");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mujiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_owl);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "true");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);


         cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yugne");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Elephant");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Giwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_elephant);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);


         cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lala");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Spider");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gizo-gizo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_spider);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Asikonjo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Cameleon");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hawainiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_chameleon);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lakudumthum");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Caterpillar");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tsutsa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_caterpillar);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ankiling");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Lizard");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kadangare");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.lizard);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kome");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Goat");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Akuya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_goat);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Alelowu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "butterfly");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwakwala");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_butterfly);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Andokko");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Grasshopper");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Fara");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.grassphopper);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Rwanga");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Crab");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kaguwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_crab);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sombo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Fly");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kuda");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_fly);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Akobsondi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Vulture");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Angulu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_vulture);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tithir");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Cockroach");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kyankyaso");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_cockroach);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wogot");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Bee");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kudan zuma");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_bee);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Powinthiri");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Scorpion");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kunama");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_scorpion);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sugthugup");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Eagle");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shaho");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_eagle);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Asikiliri");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Earthworm");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tsutsa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_earthworm);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Bobo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Gazelle");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Barewa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_gazelle);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Babba");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Donkey");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Jaki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.donkey);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tuje");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Horse");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Doki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.horse);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);
         cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Teh");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Father");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Baba");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_father);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FAMILY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ne");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Mother");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mama");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_mother);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "true");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FAMILY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Bai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Dog");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kare");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_dog);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pombo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Rat");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Bera");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_rat);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"lakongulong");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Kangaroo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kangaro");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_kangaroo);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yabe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Hen");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kaza");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_hen);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wodduwodde");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Bug");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwaaro");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_bug);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mbitla");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Black ant");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tururuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_ant);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Dwaga");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Snail");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Dodon Kodi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_snail);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sele");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Hawk");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shirwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_hawk);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Haaze");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Snake");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Maciji");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_snake);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tiilo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Bat");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Jemage");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_bat);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kodom");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Crocodile");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kada");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_crocodile);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kombolo/Seje");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Tortoise");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kunkuru");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_tortoise);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nigi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Hippopotamus");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Dorinan Ruwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_hippopotamus);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sokjok/pothos");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Mosquito");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kadangare");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_mosquito);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Monkey");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Salang/Pidok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Monkey");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_monkey);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tanga");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Cow");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shanu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.cow);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Shung");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Gorilla");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Goggon biri");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_gorilla);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kuuge");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Hedgehog");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Bushiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_hedgehog);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Siddau/Yiddi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Bird");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tsunstu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_bird);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Latakira");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Squirrel");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kadangare");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_squirrel);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wolok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Fish");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kifi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_fish);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kaltha");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Cat");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kule");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_cat);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nethe/Somdok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Rabit");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Zomo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_rabbit);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kolok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Cock");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Zakara");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_cock);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Akulthede/Athedung");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Frog");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwado");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_frog);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Amilthomi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Hyena");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kura");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_hyena);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kaltham");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Tiger");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Damisa mamiji");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_tiger);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);








        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Shiji");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Grandfather");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kaka namiji");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_grandfather);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FAMILY);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kaaga");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Grandmother");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kaka namace");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_grandmother);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "true");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FAMILY);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Man");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Namiji");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_man);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FAMILY);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Worop");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Wowan");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mace");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_woman);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "true");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FAMILY);
        list.add(cv);

        // greetings
        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tur nagko/Dar go");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Good Morning");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"In kwana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "true");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Di pissi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Good Afternoon");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Barka da rana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE," Yak wini");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Good evening");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ina yini");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ya sum tom");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Good night");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"A kwana lafiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nkakka layikko");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "How are you?");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yaya kake");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE," Lele ka wattu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "You are welcome");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sannu da zuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE," Wutton yak kong");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Well done");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Madalla");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nkakka merge");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "How was your journey?");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yaya Hanya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"se kakko");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Good bye");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sai an jima");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ya mergu tom");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Safe journey");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sauka lafiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wushe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Congratulation");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Na taya ka murna");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nkakka tom laiyikko?");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "How is your health?");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yaya jikin ka?");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ku tom");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "I hope you are good");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ina fata kana lafiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nkakka Teh");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "How is your father");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yaya baban ka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nkakka Neh");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "How is your mother");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yaya maman ka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nkakka worop go");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "How is your wife");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yaya matan ka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nkakka laliwin");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "How is your children");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yaya yaran ka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nkakka laman mana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "How is your husband");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yaya baban ka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nkakka wutton");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "How is work");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yaya aiki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nan tom");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "I am fine");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ina lafiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nu Tomun");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "I am no fine");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ba ni lafiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kennon liji, wutton ya merug kong");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "I believe work is going well");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Na bada gaskiya aiki na tafiya daidai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Paida yamba");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Thank God");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Godiya ga Allah");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Paida yi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Thank you");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Na gode");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nu wego doji");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "see you Tomorrow");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sai mun sadu gobe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nu wego kaknu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "see you later");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sai mun sadu anjima");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nu wego pissim  kaye");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "see you  another day");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sai mun sadu wata rana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nu wegon wanthom peleum ma watthu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "see you  next week");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sai mun sadu sati mai zuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);



        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ku tom?");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Are you well?");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kana lafiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Immum, na tomun?");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "No, I am Sick");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Aa,bani da lafiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Todowugo yarang");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "I wish you well");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ina maka fatan alheri");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lele ka lumo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Well done for market");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sannu da kasuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nkakka lumo?");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "How market?");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yaya kasuwa kasuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nkakka lamongo?");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "How is your family?");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yaya Iyali?");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yamb wottok abar");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Good Luck");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Allah ba da sa'a");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kodim kaye");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Bye");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Allah ba da sa'a");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ya lele");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Take care");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kula da lafiyan ka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Inno waizi ka mesgo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "nice to meet you");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Na ji dadin saduwa da kai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Waizik pissi lai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Happy birthday");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Barka da ranar haifuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Waizik lai Yesu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Happy christmas");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Barka da krisimeti");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"waizik kent sor");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Happy new year");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Barka da sabuwar shekara");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);






        // human body
        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Head");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_head);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Leg");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kafai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_leg);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"wissin");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Nose");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hanci");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_nose);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);



        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Liwin poara");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Fingers");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yatsu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_fingers);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Te");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Ear");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kunne");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_ear);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ago");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Stomatch");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tumbi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_stomach);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tom");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Blood");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Jini");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_blood);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wudo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Tooth");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hakori");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_tooth);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wok-ki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Hair");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gashi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_hair);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Dom salaido");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Eye");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ido");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_eye);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Mouth");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Baki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_mouth);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Rozo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Neck");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wuya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_neck);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Po-sindi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Chest");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gyirji");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_chest);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ara");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Hand");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hannu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_hand);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Daga");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Tongue");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Harshe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_tongue);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Poido");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Forehead");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Goshi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_forehead);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wok dengum");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Beared");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gemu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_beared);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wok pok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Moustache");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gahin baki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_moustache);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Purum");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Knee");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gwiwan kafa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_knee);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"purum pakka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Elbow");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gwiwan Hannu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_elbow);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kad pok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Lips");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Leben baki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_lips);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kwal pakka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Shoulder");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kafada");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_shoulder);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Widi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Breast");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Nono");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_breast);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ik");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Body");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Jiki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_body);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kwarangkwatulang");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Ankle");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mahadin kafa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_ankle);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ido");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Face");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Fuska");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_face);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Woj ruktuduk");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Ribs");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hakarkari");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_ribs);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"La-tinthong");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Foot");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA," sawun kafa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_foot);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Dak-asondi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Buttock");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Duwawu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_buttock);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wok-salaido");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Eye lashes");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gashin ido");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_eyelashes);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wok kongol salaido");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Eyebrow");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gira");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_eyebrow);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kwaddak");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Nail");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Farce");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_nails);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Labobok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Armfit");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hamata");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_armpit);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Buthe-buthe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Brain");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwakwalwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_brain);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HUMAN_BODY);
        list.add(cv);

        // general word
        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Iluk");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Soup");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Miya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Po/Sana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Food");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Abinci");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lasankaltang");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Bicycle");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Keken hauwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yogo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Wind");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Iska");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wokko");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Road");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hanya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kemji");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Fat");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kiba");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yalam");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Oil");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Dom");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Egg");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pitho");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Tree");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Bishiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Aipidi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Light");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Haske");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Fire");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wuta");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tada");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Heavy");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Nauyi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kude");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Big");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Babba");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Am");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Water");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ruwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wobbok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Leave");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gyanye");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Miye");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "People");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mutane");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Person");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mutum");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lumo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Market");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kasuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sakat");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Top/High");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Bisa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Dang-dang");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Thin");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Siriri");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Missi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Hatred");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kiyayya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pidim matwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "School");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Makaranta");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ledo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Thorn");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kaya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Anangseuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Student");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Dalibi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kwada");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Wealth");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Arziki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sen");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Wisdom");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hikima");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Waizik");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Happiness");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Farinciki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wuyaka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Sand");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yashi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yelli");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Soil");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kasa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mawobo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Church");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Masujadan krista");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sangal");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Tax");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Haraji");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tepuda");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Story");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Labari");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sindi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Tale");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tatsuniya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Radang");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Scissors");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Almakashi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Paida");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Thanks");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Godiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);
        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yeshin buk birit birit");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Flour");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gari");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wakorji");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Nature");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Halita");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mutho");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Death");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mutuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Diyom kon");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Peace");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Zaman lafiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pidimyaswa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Liberty");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yanci");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pep-pep");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Quickly");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Da sauri");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kazak-kazak");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Neatly");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mai tsabta");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Le Le");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Slowly");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"A hankali");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tam-tam");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Clearly");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Dalla-dalla");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tal/bak");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Far");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Nisa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kong");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Good");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mai kyau");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Dassa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "bad");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mara kyau");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kerek");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Bitter");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Daci");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sori");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Tall");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Dogo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lalori");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Little");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"dalla-dalla");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Buk");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Soft");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mai laushi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lakei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Small");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karami");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kwanthol");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Short");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gajere");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Bana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Anger");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"dalla-dalla");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Dul");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "cool");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sanyi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Hot");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Zafi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Birth");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Haifuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yilong");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Shadow");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Inuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Silip");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Hard");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mai wuya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Keb/Rok-rok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Greediness");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hadama");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Dik-dik");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Sweet");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Dadi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lubbak");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Tasteless");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mara dandano");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yamba");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "God");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Allah");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Suro");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Devil");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shaidan");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Laman wuppuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Teacher");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Malami");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wuton");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Work");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Aiki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pidim Wutum");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Office/Place of work");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"dalla-dalla");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);



        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Korok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Grass");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ciyawa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Inji tong");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Air plane");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Jigirn Sama");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lakitong");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Heaven");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Bol");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Horn");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kaho");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pada");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Illiness");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Den");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Medicine");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Magani");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Duka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Salt");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gishiri");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tede/Pali");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "River");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kogi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kada");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Skin");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Fata");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ala");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Stick");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sanda");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Amwidi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Tears");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hawaye");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tugad/Kwatham");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Whip");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Dorina");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kaye");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Empty");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Fanko/Wofi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kentiji/Pos");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Full");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Cikakke");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kokki/Silakki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Half");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Rabi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);




        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lapimana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Toilet");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Bayan gida");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wamkaiki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Blanket");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Bargo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Poruk");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Trap");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tarko");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ayolo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Smoke");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hayaki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Meat");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Nama");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pugum");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Blind");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Makaho");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wale");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Leper");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kuturu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kidawu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Lame");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gurgu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Rungu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Visitor/Stranger");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Fata");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GENERAL_WORDS);
        list.add(cv);



        // commom actions

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lekko");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To love");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"So/Kaunaci");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tain");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To greet");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gai da");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To eat");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ci");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Puddei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To clean");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tsabtace");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);



        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Illu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To stand up");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tashi tsaye");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Dikko");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To sit down");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Zauna");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kanje");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To wait");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Jira");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ya wa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To act");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Aikata");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Penthawu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To know");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sani");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To do");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tauwi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To seek");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Nema");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lambu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To plant");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pethu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To go out");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Fita");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Keno");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To come in");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"shiga");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wantho");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To sleep");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Barci");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Monthe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To Forget");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Manta");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ne");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To talk");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yi magana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pathu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To buy");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sayi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sebu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To look");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Duba/gani");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sewuk");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To learn");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Koya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Belu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To break");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karya/Raba");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Balla");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To write");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Rubuta");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Putho");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To arrive");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Isa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Solu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To beg");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Roko");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ta neri");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To understand");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"ganewa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tible");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To cut");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Datse/karya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wukko/wuge");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To fail");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Fadi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wuji");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To cry");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yi Kuka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Merge");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To travel");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yi tafiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"ya Ture");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To jump");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yi tsalle");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wuthe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To farm");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yi noma");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Muthgo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To die");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Mutu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kwethu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To finish");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gama/Kammala");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Laigo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To Deliver(child)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Haifuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yak pulo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To impregnate)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yi ma mace ciki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yikko");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To start)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Fara/soma");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"palam");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To play)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yi wasa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lekko");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To like)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"So");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"pithei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To quench)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kashe wuta ko kyishi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Woppe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To dig)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yi tono");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wudi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To bite)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yi cizo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lebi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To agree)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yarda/Amince");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);



        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yille");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To lift)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"daga");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Swathei/Tuge");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To thresh");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"sussuka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ti");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To rear");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kiwo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wobo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To worship)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sujada/bauta");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wobo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To worship)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sujada/Bauta");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wutthei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To send)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Aika");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wobugo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To embrace)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Runguma");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yeji");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To drink)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sha");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nase");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To close");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sha");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"puddu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To wash");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wanke");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Doone");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To repair)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gyara");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lakumo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To check)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Duba/Bincika");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Donei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To organzie)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shirya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Donik");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To Prepare)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yi shiri");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Daage/Tuungude");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To Push)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tura");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ambo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To climb)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hau");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Alu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To burn)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hau");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nassu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To cover)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"rufe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Saage");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To mix");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Dama/Juya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Appei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To turn on)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kunna");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nasei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To turn off)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kashe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Appu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To open)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Bude");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ayyei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To light)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Haska");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Angei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To pay)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Biya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"merge");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To walk)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA," Yi tafiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kollei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To dance");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA," Yi rawa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Attu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To bring)");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kawo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"pelem");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To lie");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yi karya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Weko");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To run away ");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yi gudu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"woke");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To help )");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yi taimako");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Liye");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To put down )");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ajiye");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,COMMON_ACTIONS);
        list.add(cv);


        // home objects
        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Dundi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Pot ");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tukunya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_pot);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tabbak");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Tray ");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Paranti");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_tray);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lur");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Baket ");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwando");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_basket);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tassi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Kettle ");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Buta");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_kettle);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kwali");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Calabah ");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwarya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_calabash);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Dil");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Matches ");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ashana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_matches);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sombol");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Spoon ");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Chokali");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_spoon);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sassap");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Broom ");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tsintsiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_broom);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kotob");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Bucket ");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Bokati");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_bucket);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sadak diyo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Stool ");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karamin kujera");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_stool);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Luttu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Bag ");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Jaka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_bag);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wamballa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Pen");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Alkalami");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_pen);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Taga");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Shoe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Buta");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_shoe);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sakam");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Knife");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wuka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_kinfe);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yauli");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Firewood ");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Itace");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_firewood);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wobokballa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Book");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Takarda");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_book);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wanbenwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Wrapper");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Zani");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_wrapper);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lantha");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Shirt");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Riga");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_shirt);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yenge");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Trouser");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wando");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_trouser);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wam-aipidi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Lamp");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Itace");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_lamp);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Taja");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Dish");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_dish);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Latissi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Jug");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tulu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_jug);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sadakballa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Table");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tebur");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_table);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kwimana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Roof");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"jinka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_roof);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Atau");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Mat");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tabarma");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_mat);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pomana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Door");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Itace");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_door);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pobuga");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Window");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Taga");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_window);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Komboro");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Bed");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gado");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_bed);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Laman wantho");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Bedroom");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Dakin Kwana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_bedroom);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Laman sana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Kitchen");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Dakin dafowa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_kitchen);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pdin pinon");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Bathroom");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Dakin wanka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_bathroom);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lolowu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Thread");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Zare");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_thread);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Luttu/Pippi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Box");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Akwati");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_box);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lipra");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Needle");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Allura");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_needle);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Laman sana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Kitchen");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Dakin dafowa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_kitchen);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Alateena/Teena");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Pestle/Mortar");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_mortar);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,HOME_OBJECTS);
        list.add(cv);



        // farm
        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lamn wutho");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Farmer");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Manomi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_farmer);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sau");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Guinea corn");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Dawa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_guineacorn);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sekum");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Maize");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Masara");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_maize);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kondo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Groundnut");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gyada");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_gnut);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kondumu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Bambara nut");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gujjiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_bnut);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Maddo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Millet");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hasti");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_millet);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Dom");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Beans");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wake");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_beans);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Dwang");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Tamarind");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tsayima");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_tamarind);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tolo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Pupkin");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kabewa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_pumpkin);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sida");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Pepper");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Barkono");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_pepper);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Eezum");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Onion");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Albasa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_onion);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sir");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Yam");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Doya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_yam);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Podo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Seed");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Iri");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_seed);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Komburom");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Okro");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kubewa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_okro);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Konne");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Boabob");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kabewa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_boabob);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Locus bean");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Twaali");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Daddawa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_locusbean);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Taba");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Barn");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Rumbu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_barn);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Hoe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Kwas");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Partanya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_hoe);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nar");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Spear");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Masi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_spear);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pik");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Arrow");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwari");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_arrow);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Twan");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Axe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gatari");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_axe);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Denger");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Bow");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Baka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_bow);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kwiri");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Sickle");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Lauje");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_sickle);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,FARM);
        list.add(cv);


        // Basics

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Na");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "I");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ni");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "He");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ta");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "She");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ita");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ku");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "It");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ka/Shi/Ma");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "You");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kai/Ke/Ku");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Anangpena");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "They");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Su");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Abastam");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Her");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"ta");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Na");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Me");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ni");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Anangpenaa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Them");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Su");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mo/Tam mene");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "This");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wannan");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mu/Ta munu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "That");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"wancan");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mo munu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "These");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"wadannan");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tam munu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Those");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wadancan");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kakwiwu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Themselve");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kansu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kakwini");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Himself");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kansa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kakwinto");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Herself");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kanta");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Na ka kino");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Myself");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kanina");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kakwitho");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Itself");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kanta/Kansa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mi yi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "His");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Na sa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mi to");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Hers");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Na ta");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mimmu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Ours");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Namu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Minno");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Mine");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Nawa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mikko/Missi/Mikku");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Yours");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"NaKa/Naki/Naku");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mamiu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Theirs");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Na su");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pip");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "All");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Duka");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lakei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Few");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kadan");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nung-nung");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Each");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kowanne");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Bel");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Many");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Da yawa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wandok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Something");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wani abu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wawayim");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Nothing");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Babu komai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Nung-nung");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Everyone");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kowa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mumdok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Each other");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Juna");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "There");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Can");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Keh/Ninge");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Here");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Nan");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Latam");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Outside");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Waje");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Laterei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Inside");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ciki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kwaddei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Only");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"kadai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kwing/Tama-tama");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Very");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"sosai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mwassi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Almost");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kusa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yo dok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Once");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"So daya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yo rab");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Twice");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"So biyu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yo kunung");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Thrice");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"So uku");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wowu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Yes");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"ee");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);
        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yimmon");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "No");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"a'a");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);



        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tong");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Above");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Bisa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lang");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Early");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Da wuri");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"watho");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Soon");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Jim kadan");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ta terei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Between");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tsakani");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ki/Kwi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "On");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Bisa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tu/Tom");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "To");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wurin");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ma");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "By");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"a'a");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,BASICS);
        list.add(cv);


        // weaher and climate
        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Welei");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Spring");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wojon");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Dry season");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Rani");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kutho");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Hamattan");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Lokacin sanyi ");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kodi pidin wi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Hot season");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Lokacin Zafi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sene");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Rainy season");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Damina");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tere");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Moon");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wata");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pissi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Sun");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Rana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Laliwin Tere");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Star");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Tauraro");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lakwitong");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Sky");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sararin sama");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yogo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Wind");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Iska");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kalawu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Dust");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kura");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kada");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Cloud");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Hardari");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pidin wi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "it's hot");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Akwai zafi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pidin dul");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "it's cold");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Akwai sanyi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pidin ka kada");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "it's cloudy");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Akwai hadari");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Pidin ka pissi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "it's cloudy");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Akwai zafin rana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Am na tiji");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "it's rainy");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Ina ruwan sama");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,CLIMATE_WEATHER);
        list.add(cv);

        

        // time and season's data
        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Awar dok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "One O'clock");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karfe daya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Awar rap");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Two O'clock");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karfe biyu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Awar kunun");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Three O'clock");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karfe uku");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Awar Padau");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Four O'clock");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karfe Hudu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Awar Puwat");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Five O'clock");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karfe biyar");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Awar Payindi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Six O'clock");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karfe shida");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Awar peleuw");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Seven O'clock");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karfe bakwai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Awar Parpada");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Eight O'clock");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karfe takwas");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Awar Lambuda");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Nine O'clock");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karfe tara");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Awar komo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Ten O'clock");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karfe goma");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Awar komo ka salai dok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Eleven O'clock");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karfe daya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Awar komo ka salai rap");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Twelve O'clock");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Karfe daya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wanthu dok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "One day");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwana daya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wanthu rap");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Two days");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwana biyu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wanthu kunun");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Three days");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwana uku");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wanthu padau");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Four days");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwana hudu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wanthu puwat");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Five days");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwana biyar");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wanthu payindi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Six days");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwana shida");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wanthu peleuw");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Seven days");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwana bakwai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wanthu parpada");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Eight days");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwana takwas");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wanthu lambuda");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Nine months");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wata goma");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wanthu komo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Ten days");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwana goma");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);





        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ter dok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "One month");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wata daya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ter rap");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Two months");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"wata biyu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ter kunun");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Three months");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"wata uku");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ter padau");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Four months");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"wata hudu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ter puwat");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Five months");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwana biyar");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ter payindi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Six months");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"wata shida");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ter peleuw");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Seven months");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwana bakwai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ter parpada");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Eight months");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wata takwas");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ter lambuda");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Nine months");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wata Tara");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ter komo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Ten months");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwana goma");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);



        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sor dok");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "One year");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shekara daya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sor rap");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Two years");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shekara biyu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sor kunun");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Three years");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shekara uku");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sor padau");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Four years");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shekara hudu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sor puwat");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Five years");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shekara biyar");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sor payindi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Six years");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shekara shida");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sor peleuw");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Seven years");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shekara bakwai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sor parpada");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Eight years");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shekara takwas");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sor lambuda");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Nine years");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shekara tara");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sor komo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Ten years");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shekara goma");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Teme");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Today");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yau");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Doji");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Tommorow");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yau");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wono");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Yesterday");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Gobe");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tinu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Next tommorow");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Jibi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Yi shin");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Day before yestaday");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shekaran diya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Milgo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Long time ago");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Dadadewa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mammo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Now");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Yanzu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);


        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Kakko/Kaknu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Later");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Anjima");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Banu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Ealier");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"dazu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Mam mommo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Recently");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kwanannan/Ba dadadewa ba");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);



        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Wantom Peleum Kubgo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Last week");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Satin da ya wuce");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"wantom Peleum mo watu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Next week");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Satin mai zuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);



        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Terem kubgo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Last Month");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Watan daya wuce");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Terem mo wattu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Next month");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Wata mai zuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Milyishin/Sor kubgo");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Last year");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shekaran da ya wuce");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Milandoji/Sor mo wattu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Next year");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Shekara mai zuwa");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Sor lara");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "New year");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Sabon shekara");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Lai yesu");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Chrismas");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kiristimaiti");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,-1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,TIME_DATE);
        list.add(cv);













        try {

            db.beginTransaction();
            // clear db
            db.delete(LearnTangaleContract.WordEntry.TABLE_NAME,null,null);
            // loop to insert data in the list
            for (ContentValues c : list) {
                db.insert(LearnTangaleContract.WordEntry.TABLE_NAME,null,c);
            }
            db.setTransactionSuccessful();
            db.endTransaction();

        } catch (SQLException e) {
        }finally {
        }



    }
}
