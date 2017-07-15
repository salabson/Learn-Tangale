package com.digitaltouchlab.learntangale;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by salabs on 15/07/2017.
 */

public class WordCustomAdapater extends BaseExpandableListAdapter{
    Context mContext;
    List<String> listParentData;
    HashMap<String, List<String>>  listChildData;

    public WordCustomAdapater(Context mContext, HashMap<String, String> listChildData, List<String> listParentData) {
        this.mContext = mContext;
        listChildData = listChildData;
        listParentData = listParentData;
    }

    @Override
    public int getGroupCount() {
        return this.listParentData.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listChildData.get(listParentData.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listParentData.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listChildData.get(listParentData.get(groupPosition)).get(childPosition);
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
    public View getGroupView(int groupPosition, boolean b, View convertView, ViewGroup viewGroup) {
        // get data at the current postion of the parent list
        String parentTitle = (String) getGroup(groupPosition);
        // check if there is View for reuse otherwise inflate one
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.parent_word_item,null);
        }

        // get reference of parent textview and set it
        TextView parentText = (TextView) convertView.findViewById(R.id.txtParent);
        parentText.setText(parentTitle);
        // return the for display on expandable list view
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean b, View convertView, ViewGroup viewGroup) {
        // get data at the current postion of the parent list
        String childTitle = (String) getChild(groupPosition,childPosition);
        // check if there is View for reuse otherwise inflate one
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.parent_word_item,null);
        }

        // get reference of parent textview and set it
        TextView childText = (TextView) convertView.findViewById(R.id.txtChild);
        childText.setText(childTitle);
        // return the for display on expandable list view
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
