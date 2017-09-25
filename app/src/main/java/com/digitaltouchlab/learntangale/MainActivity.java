package com.digitaltouchlab.learntangale;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.NavUtils;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.preference.PreferenceManager;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    // variables related to Navigation Drawer
    private DrawerLayout mDrawer;
    private Toolbar mToolbar;
    private NavigationView mNavView;
    private ActionBarDrawerToggle mActionBarDrawerToggle;


    private LearnTangaleDbHelper mDbHelper;
    private SQLiteDatabase mDb;
    // create constants that represent index various categories in array list
    private static final int ANIMALS = 0;
    private static final int FAMILY = 1;
    private static final int COUNTING = 2;
    private static final int ENQUIRIES = 3;
    private static final int PHRASES= 4;

    DatabaseUtils mDbUtils;

    ArrayList<WordCategory> wordCategories;
    GridView categotyGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        mDrawer = (DrawerLayout) findViewById(R.id.drawer);
        setSupportActionBar(mToolbar);


        ActionBar actionBar = this.getSupportActionBar();
        // Set the action bar back button to look like an up button
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        mDbUtils = new DatabaseUtils(this);
       //mDbHelper = new LearnTangaleDbHelper(this);
       //mDb = mDbHelper.getWritableDatabase();
       //InsertData.insertCategpryData(mDb);
      //InsertData.insertWordData(mDb);

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

        initNavigationDrawer();

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

    public void initNavigationDrawer() {
        mNavView = (NavigationView) findViewById(R.id.navView);
        mNavView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            setupDrawer(item,mDrawer);
                return true;
            }
        });

        // find the header layout and set it views
        View header = mNavView.getHeaderView(0);
        TextView tv_email = (TextView) header.findViewById(R.id.tv_email);
        tv_email.setText("salabson4@yahoo.co.uk");

        // set and wire ActionBarDrawerToggle
        //mDrawer = (DrawerLayout) findViewById(R.id.drawer);
        mActionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawer, mToolbar, R.string.open_drawer, R.string.close_drawer) {
            @Override
            public void onDrawerClosed(View v) {
                super.onDrawerClosed(v);
            }

            @Override
            public void onDrawerOpened(View v) {
                super.onDrawerOpened(v);
            }
        };
        mDrawer.addDrawerListener(mActionBarDrawerToggle);
        mActionBarDrawerToggle.syncState();

    }
    private void setupDrawer(MenuItem menuItem, DrawerLayout drawerLayout) {
        Intent intent = null;
        switch (menuItem.getItemId()) {

            case R.id.nav_home:
                drawerLayout.closeDrawers();
                break;
            case R.id.nav_favorites:
                 intent = new Intent(this,FavoriteActivity.class);
                startActivity(intent);
                drawerLayout.closeDrawers();
                break;
            case R.id.nav_settings:
                 intent = new Intent(this,SettingsActivity.class);
                startActivity(intent);
                drawerLayout.closeDrawers();
                break;
            case R.id.nav_rate:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("market://details?id=com.digitaltouchlab.learntangale"));
                startActivity(intent);
                break;
            case R.id.nav_send_feedback:
                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");
                intent.putExtra(Intent.EXTRA_SUBJECT,"FeedBack");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"salabson4@yahoo.co.uk"});
                startActivity(Intent.createChooser(intent,"Feedback:"));

            default:
                drawerLayout.closeDrawers();
        }
    }
    @Override
    protected void onPause() {
        super.onPause();
        mDbUtils.Close();

    }
    @Override
    protected void onResume() {
        super.onResume();
        mDbUtils.Open();

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
