package com.digitaltouchlab.learntangale;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by salabs on 15/07/2017.
 */

public class WordCustomAdapater extends BaseExpandableListAdapter {
    Context mContext;
    List<Word> listParentData;
    HashMap<String, List<Word>>  listChildData;
    Word currentWord;
    SharedPreferences sharedPreferences;
    public  ImageView  parentImage;
    DatabaseUtils mDbUtils;


    public WordCustomAdapater(Context mContext, HashMap<String, List<Word>> listChildData, List<Word> listParentData ) {
        this.mContext = mContext;
        this.listChildData = listChildData;
        this. listParentData = listParentData;
    }

    @Override
    public int getGroupCount() {
        return listParentData.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.listChildData.get(listParentData.get(groupPosition).getEnglishTranlation()).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listParentData.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.listChildData.get(listParentData.get(groupPosition).getEnglishTranlation()).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView( final int groupPosition, boolean b,  View convertView, ViewGroup viewGroup) {
        // get data at the current position of the parent list
         currentWord = (Word) getGroup(groupPosition);

        // check if there is View for reuse otherwise inflate one
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.parent_word_item,null);
        }


        // get reference of parent textview
        TextView parentText = (TextView) convertView.findViewById(R.id.txtParent);
        // get all share preferences
         sharedPreferences = PreferenceManager.getDefaultSharedPreferences(mContext);
        String translationLanguage;
        // read the share preferences by key and  assign to variable
        translationLanguage = sharedPreferences.getString(mContext.getString(R.string.pref_translation_key),mContext.getString(R.string.pref_hausa_translation_value));
        Log.v("translang",translationLanguage);
        if (translationLanguage.equals(mContext.getString(R.string.pref_english_translation_value))) {
            Log.v("translang2", translationLanguage);
            // set the @parentText to English
            parentText.setText(currentWord.getEnglishTranlation());
        } else if (translationLanguage.equals(mContext.getString(R.string.pref_hausa_translation_value)) ) {
            // set the @parentText to English
            parentText.setText(currentWord.getHausaTranlation());
        }


        // get reference to favorite image
        final ImageView favoriteImage = (ImageView)convertView.findViewById(R.id.favoriteImage);
        // set image depending on wether exist in the favorite
        if (Boolean.valueOf(currentWord.getIsAddedToFavorit())) {

            // turn the image on
            favoriteImage.setImageResource(R.drawable.ic_favorite_on);
            // change favorite exist to false
            currentWord.setAddedToFavorite("true");
        } else {
            // turn the image off
            favoriteImage.setImageResource(R.drawable.ic_favorite_off);
            // change favorite exist to false
            currentWord.setAddedToFavorite("false");
        }


        // add word to favorite list and change favorite image to on or off
        favoriteImage.setOnClickListener(new View.OnClickListener() {
            // get current word in this scope
             Word currentWord = (Word) getGroup(groupPosition);
            long id = currentWord.getId();
             SQLiteDatabase db;
            LearnTangaleDbHelper dbHelper = new LearnTangaleDbHelper(mContext);


            @Override
            public void onClick(View view) {

               mDbUtils =  new DatabaseUtils(mContext);
                mDbUtils.Open();
                if (Boolean.valueOf(currentWord.getIsAddedToFavorit())) {
                    // add stuff to remove the word from favorite
                    //.......
                    // turn the image off
                    favoriteImage.setImageResource(R.drawable.ic_favorite_off);
                    Log.v("WordAdapter", currentWord.getIsAddedToFavorit());
                    // change favorite exist to false
                    currentWord.setAddedToFavorite("false");

                   mDbUtils.updateWordById(id, currentWord.getTangaleTranlation(),currentWord.getEnglishTranlation(),currentWord.getHausaTranlation(),
                           currentWord.getwordImageId(),currentWord.getIsAddedToFavorit(),currentWord.getCategoryId());

                } else {
                    // add stuff to add the word to favorite
                    ///........
                    // turn the image on
                    favoriteImage.setImageResource(R.drawable.ic_favorite_on);
                    // change favorite exist to false
                    currentWord.setAddedToFavorite("true");
                    mDbUtils.updateWordById(id, currentWord.getTangaleTranlation(),currentWord.getEnglishTranlation(),currentWord.getHausaTranlation(),
                            currentWord.getwordImageId(),currentWord.getIsAddedToFavorit(),currentWord.getCategoryId());

                }
            }
        });

        // get reference to parent word image
           parentImage = (ImageView)convertView.findViewById(R.id.wordImage);
        //retrieve the value of show iamge checkbox from the sharesprefences
        boolean showImage;
        showImage = sharedPreferences.getBoolean(mContext.getString(R.string.pref_show_image_key),mContext.getResources().getBoolean(R.bool.show_image_default));
       // if the value of checkbox is true in shared preferences display image otherwise hide the image
        if (showImage) {
            if (currentWord.getwordImageId() == -1) {
                parentImage.setVisibility(View.GONE);
            } else {
                parentImage.setImageResource(currentWord.getwordImageId());
            }

        } else {
            parentImage.setVisibility(View.GONE);
        }


        // return the for display on expandable list view
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean b, View convertView, ViewGroup viewGroup) {
        // get data at the current postion of the parent list
         currentWord = (Word) getChild(groupPosition,childPosition);
        // check if there is View for reuse otherwise inflate one
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.child_word_item,null);
        }

        // get reference of parent textview and set it
        TextView childText = (TextView) convertView.findViewById(R.id.txtChild);
        childText.setText(currentWord.getTangaleTranlation());

        // display bottom divided in child at the end of the child list item
        TextView childBottomDivider = (TextView)convertView.findViewById(R.id.txtChildBottomDivider);
        if (childPosition == getChildrenCount(groupPosition) - 1) {
            // set the divider to visible
            childBottomDivider.setVisibility(View.VISIBLE);
        } else {
            // hide the divider
            childBottomDivider.setVisibility(View.GONE);
        }
        // return the for display on expandable list view
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }


}
