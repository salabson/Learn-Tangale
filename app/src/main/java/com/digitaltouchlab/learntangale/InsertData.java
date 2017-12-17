package com.digitaltouchlab.learntangale;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import com.digitaltouchlab.learntangale.LearnTangaleContract;

import static com.digitaltouchlab.learntangale.MainActivity.ANIMALS;
import static com.digitaltouchlab.learntangale.MainActivity.FAMILY;
import static com.digitaltouchlab.learntangale.MainActivity.GREETINGS;
import static com.digitaltouchlab.learntangale.MainActivity.HUMAN_BODY;

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
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Animals");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.animal);

        list.add(cv);
        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Family");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.family);
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
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Common words");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.word);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Human Body");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.body);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_NAME,"Colors");
        cv.put(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID,R.drawable.colours);
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
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Bai");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Dog");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kare");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.ic_dog);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

         cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Babba");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Monkey");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Jaki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.donkey);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "true");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,ANIMALS);
        list.add(cv);

         cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Ankilin");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Lizard");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Kadangare");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.lizard);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,1);
        list.add(cv);


         cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Tuje");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Horse");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Doki");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.horse);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "true");
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
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Andokko");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Grasshopper");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Fara");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, R.drawable.grassphopper);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "true");
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
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Daru go");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Good Morning");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Barka dan safiya");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "true");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Dibishi");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Good Afternoon");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Barka da rana");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "false");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,GREETINGS);
        list.add(cv);

        cv = new ContentValues();
        cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE,"Diwini");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH, "Good evening");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA,"Barka da yini");
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID, -1);
        cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE, "true");
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
        cv.put(LearnTangaleContract.WordEntry.COLUMN_CATEGORY_ID,8);
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
