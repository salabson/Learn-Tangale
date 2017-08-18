package com.digitaltouchlab.learntangale;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
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

public class WordCustomAdapater extends BaseExpandableListAdapter{
    Context mContext;
    List<Word> listParentData;
    HashMap<String, List<Word>>  listChildData;
    Word currentWord;

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
    public View getGroupView( final int groupPosition, boolean b, View convertView, ViewGroup viewGroup) {
        // get data at the current postion of the parent list
         currentWord = (Word) getGroup(groupPosition);

        // check if there is View for reuse otherwise inflate one
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.parent_word_item,null);
        }

        // get reference of parent textview and set it
        TextView parentText = (TextView) convertView.findViewById(R.id.txtParent);
        parentText.setText(currentWord.getEnglishTranlation());

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
            long id = groupPosition + 1;
             SQLiteDatabase db;
            LearnTangaleDbHelper dbHelper = new LearnTangaleDbHelper(mContext);


            @Override
            public void onClick(View view) {

                db = dbHelper.getWritableDatabase();
                if (Boolean.valueOf(currentWord.getIsAddedToFavorit())) {
                    // add stuff to remove the word from favorite
                    //.......
                    // turn the image off
                    favoriteImage.setImageResource(R.drawable.ic_favorite_off);
                    Log.v("WordAdapter", currentWord.getIsAddedToFavorit());
                    // change favorite exist to false
                    currentWord.setAddedToFavorite("false");

                    ContentValues cv = new ContentValues();
                    cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_TANGALE, currentWord.getTangaleTranlation());
                    cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_ENGLISH,currentWord.getEnglishTranlation());
                    cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_HAUSA, currentWord.getHausaTranlation());
                    cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IMAGEID,currentWord.getwordImageId() );
                    cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IS_ADDED_TO_FAVORITE,currentWord.getIsAddedToFavorit());
                    Log.v("WordAdapter", id + " " + currentWord.getIsAddedToFavorit() );


                    try{
                        int z = db.update(LearnTangaleContract.LearnTangaleEntry.TABLE_NAME,cv, LearnTangaleContract.LearnTangaleEntry._ID + "=" + id,null);
                        db.close();
                        Log.v("WordAdapter", "update result " + z );
                    }catch (Exception e){
                        e.printStackTrace();
                        db.close();
                    }

                } else {
                    // add stuff to add the word to favorite
                    ///........
                    // turn the image on
                    favoriteImage.setImageResource(R.drawable.ic_favorite_on);
                    // change favorite exist to false
                    currentWord.setAddedToFavorite("true");
                    ContentValues cv = new ContentValues();
                    cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_TANGALE, currentWord.getTangaleTranlation());
                    cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_ENGLISH,currentWord.getEnglishTranlation());
                    cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_HAUSA, currentWord.getHausaTranlation());
                    cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IMAGEID,currentWord.getwordImageId() );
                    cv.put(LearnTangaleContract.LearnTangaleEntry.COLUMN_IS_ADDED_TO_FAVORITE,currentWord.getIsAddedToFavorit());

                    db.update(LearnTangaleContract.LearnTangaleEntry.TABLE_NAME,cv, LearnTangaleContract.LearnTangaleEntry._ID + "=" + id,null);
                }
            }
        });

        // get refrence to parent word image
        ImageView  parentImage = (ImageView)convertView.findViewById(R.id.wordImage);
        parentImage.setImageResource(currentWord.getwordImageId());

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
