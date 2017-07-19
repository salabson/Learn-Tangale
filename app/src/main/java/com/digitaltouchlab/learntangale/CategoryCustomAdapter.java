package com.digitaltouchlab.learntangale;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by salabs on 15/07/2017.
 */

public class CategoryCustomAdapter extends ArrayAdapter<WordCategory> {
    Context mContext;

    public CategoryCustomAdapter(@NonNull Context context, @NonNull List<WordCategory> WordCategories) {
        super(context, 0, WordCategories);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get the data at current postion
        WordCategory currentWordCategory = getItem(position);

        // check if there is view for reuse ortherwise inflate it
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.category_list_item,null);
        }

        // get references of various views in the inflated layout
        ImageView wordCategoryImage = (ImageView) convertView.findViewById(R.id.imageWordCategory);
        wordCategoryImage.setImageResource(currentWordCategory.getCategoryImageId());

        TextView wordCategoryDecs = (TextView) convertView.findViewById(R.id.wordCategoryDesc);
        wordCategoryDecs.setText(currentWordCategory.getCategoryName());


        return convertView;
    }
}
