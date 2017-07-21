package com.digitaltouchlab.learntangale;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by salabs on 20/07/2017.
 */

public class SharedPrefrence {
    private static final String PREF_NAME = "tangale_app";
    private static final String FAVORITES = "animals_favorite";
    public SharedPrefrence() {
        super();
    }

    // save data to shared prefrences
    private void saveFavorites(Context context, List<Word> favorites) {
        // get reference to share preference object
        SharedPreferences sharedPrefs = context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPrefs.edit();

        // create Gson object
        Gson gson = new Gson();

        // get type of the list of word object
        Type type = new TypeToken<List<Word>>() {}.getType();

        // convert favorites list to json object
        String jsonFavorites = gson.toJson(favorites,type);


        // save the json object to sharedPrefereces
        editor.putString(FAVORITES, jsonFavorites);
        editor.apply();
    }

    // retrieve data from shared preferences
    private List<Word> getFavorite(Context context, Word word) {
        // get reference to share preference object
        SharedPreferences sharedPrefs = context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        List<Word> favorites;

        // check if the specific key exist in the share
        if (sharedPrefs.contains(FAVORITES)) {
            // get Json string from shared preferences
            String jsonFavorites = sharedPrefs.getString(FAVORITES,null);
            // create Gson object
            Gson gson = new Gson();
            // get type of the list of word object
            Type type = new TypeToken<List<Word>>() {}.getType();
            // convert favorites list from json to array of word object
            favorites = gson.fromJson(jsonFavorites, type);

        } else return null;

        return favorites;
    }

    // remove item from the favorite
    public void removeFavorite(Context context, Word word) {
        List<Word> favorites = getFavorite(context, word);
        if (favorites != null) {
            favorites.remove(word);
            saveFavorites(context,favorites);
        }
    }


    public void addFavorite(Context context, Word word) {
        List<Word> favorites = getFavorite(context, word);
        if (favorites == null) {
            favorites.add(word);
            saveFavorites(context,favorites);
        }
    }


}
