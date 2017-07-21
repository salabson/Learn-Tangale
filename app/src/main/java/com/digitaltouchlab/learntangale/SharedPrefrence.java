package com.digitaltouchlab.learntangale;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;

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
    public void saveFavorites(Context context, List<Word> favorites) {
        // get reference to share preference object
        SharedPreferences sharedPrefs = context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPrefs.edit();

        // create Gson object
        Gson gson = new Gson();
        // convert favorites list to json object
        String jsonFavorites = gson.toJson(favorites);

        // save the json object to sharedPrefereces
        editor.putString(FAVORITES, jsonFavorites);
        editor.apply();
    }

    // retrieve data from shared preferences
    public List<Word> getFavorite(Context context, Word word) {
        // get reference to share preference object
        SharedPreferences sharedPrefs = context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        List<Word> favorites;
        if (sharedPrefs.contains(FAVORITES)) {
            // get Json data from shared preferences
            String jsonFavorites = sharedPrefs.getString(FAVORITES,null);
            // create Gson object
            Gson gson = new Gson();
            // convert favorites list to json object
            Word[] jsonFavoritesItems = gson.fromJson(jsonFavorites, Word[].class);

            favorites = Arrays.asList(jsonFavoritesItems);
            favorites = new ArrayList<Word>(favorites);

        } else return null;

        return favorites;
    }


}
