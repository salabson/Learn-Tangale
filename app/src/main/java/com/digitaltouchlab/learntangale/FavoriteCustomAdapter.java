package com.digitaltouchlab.learntangale;

import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
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
 * Created by salabs on 06/09/2017.
 */

public class FavoriteCustomAdapter extends BaseExpandableListAdapter {
    Context mContext;
    List<Word> listParentData;
    HashMap<String, List<Word>>  listChildData;
    Word currentWord;

    public FavoriteCustomAdapter(Context mContext, HashMap<String, List<Word>> listChildData, List<Word> listParentData ) {
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
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(mContext);
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
        final ImageView deleteImage = (ImageView)convertView.findViewById(R.id.favoriteImage);
            deleteImage.setImageResource(R.drawable.ic_delete);



        // add word to favorite list and change favorite image to on or off
        deleteImage.setOnClickListener(new View.OnClickListener() {
            // get current word in this scope
            Word currentWord = (Word) getGroup(groupPosition);
            long id = currentWord.getId();
            SQLiteDatabase db;
            LearnTangaleDbHelper dbHelper = new LearnTangaleDbHelper(mContext);


            @Override
            public void onClick(View view) {
                // create AlertDialog object
                AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
                builder.setMessage(mContext.getString(R.string.delete_message))
                        .setTitle(mContext.getString(R.string.delete_title))
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                db = dbHelper.getWritableDatabase();
                                currentWord.setAddedToFavorite("false");
                                ContentValues cv = new ContentValues();
                                cv.put(LearnTangaleContract.WordEntry.COLUMN_TANGALE, currentWord.getTangaleTranlation());
                                cv.put(LearnTangaleContract.WordEntry.COLUMN_ENGLISH,currentWord.getEnglishTranlation());
                                cv.put(LearnTangaleContract.WordEntry.COLUMN_HAUSA, currentWord.getHausaTranlation());
                                cv.put(LearnTangaleContract.WordEntry.COLUMN_IMAGE_ID,currentWord.getwordImageId() );
                                cv.put(LearnTangaleContract.WordEntry.COLUMN_IS_ADDED_TO_FAVORITE,currentWord.getIsAddedToFavorit());
                                try{
                                    int z = db.update(LearnTangaleContract.WordEntry.TABLE_NAME,cv, LearnTangaleContract.WordEntry._ID + "=" + id,null);
                                    db.close();
                                    Intent intent = new Intent(mContext,FavoriteActivity.class);
                                    mContext.startActivity(intent);

                                    Log.v("WordAdapter", "update result " + z );
                                }catch (Exception e){
                                    e.printStackTrace();
                                    db.close();
                                }

                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                        builder.create().show();
            }
        });

        // get reference to parent word image
        ImageView  parentImage = (ImageView)convertView.findViewById(R.id.wordImage);
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
