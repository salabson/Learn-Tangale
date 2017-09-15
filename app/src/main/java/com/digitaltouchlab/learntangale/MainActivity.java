package com.digitaltouchlab.learntangale;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.preference.PreferenceManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    // create constants that represent index various categories in array list
    private static final int ANIMALS = 0;
    private static final int FAMILY = 1;
    private static final int COUNTING = 2;
    private static final int ENQUIRIES = 3;
    private static final int PHRASES= 4;
    SQLiteDatabase db;
    LearnTangaleDbHelper dbHelper;
    DatabaseUtils mDbUtils;

    ArrayList<WordCategory> wordCategories;
    GridView categotyGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = this.getSupportActionBar();
        // Set the action bar back button to look like an up button
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        mDbUtils = new DatabaseUtils(this);

        //InsertData.insertCategpryData(db);
      // InsertData.insertWordData(db);

        // get reference to gridviw from the main layout
        categotyGV = (GridView) findViewById(R.id.gridViewMain);

        // call fill data method tp populate word category array list
        mDbUtils.Open();
        fillData();

        // gridiew adapter to our custom adapter
        CategoryCustomAdapter customAdapter = new CategoryCustomAdapter(this,wordCategories);
        categotyGV.setAdapter(customAdapter);

        categotyGV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // call loadActivity to start the activity
                loadAcivity(position);
            }
        });


    }

    private void fillData() {
        wordCategories = new ArrayList<>();
        Cursor cursor = mDbUtils.getAllCategories();
        for (int i = 0; i < cursor.getCount(); i++) {
            cursor.moveToPosition(i);
            String name = cursor.getString(cursor.getColumnIndex(LearnTangaleContract.CategoryEntry.COLUMN_NAME));
            int image_id = cursor.getInt(cursor.getColumnIndex(LearnTangaleContract.CategoryEntry.COLUMN_IMAGE_ID));
            wordCategories.add(new WordCategory(name, image_id));

        }
    }

    private void loadAcivity(int index) {
        Intent startActivityIntent = null;
        switch (index) {
            case ANIMALS:
                startActivityIntent = new Intent(this,AnimalsActivity.class);
                break;
            case FAMILY:
                startActivityIntent = new Intent(this,FamilyActivity.class);
                break;
            case COUNTING:
                startActivityIntent = new Intent(this,CountingActivity.class);
                break;
            case ENQUIRIES:
                startActivityIntent = new Intent(this,EnquiriesActivity.class);
                break;
            case PHRASES:
                startActivityIntent = new Intent(this,FavoriteActivity.class);
                break;

        }
        startActivity(startActivityIntent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        // When the home button is pressed, take the user back to the VisualizerActivity
        if (id == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
        }
        return super.onOptionsItemSelected(item);
    }
}
