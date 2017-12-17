package com.digitaltouchlab.learntangale;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class DeveloperProfile extends AppCompatActivity {
private Toolbar mToolbar;
    private ImageView img_fb;
    private ImageView img_tw;
    private ImageView img_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_profile);
        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // get references of social media images
        img_fb = (ImageView)findViewById(R.id.soc_fb);
        img_tw = (ImageView)findViewById(R.id.soc_tw);
        img_in = (ImageView)findViewById(R.id.soc_in);

        img_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }


    private void openSocialMedia(String webAddress) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri uriAddress = Uri.parse(webAddress);
        intent.setData(uriAddress);
        startActivity(Intent.createChooser(intent,"Connect to Social Media"));
    }


}
