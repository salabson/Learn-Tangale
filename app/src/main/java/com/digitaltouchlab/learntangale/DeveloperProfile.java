package com.digitaltouchlab.learntangale;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class DeveloperProfile extends AppCompatActivity {
private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_profile);
        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    private void openSocialMedia(String webAddress) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri uriAddress = Uri.parse(webAddress);
        intent.setData(uriAddress);
        startActivity(Intent.createChooser(intent,"Connect to Social Media"));


    }


}
