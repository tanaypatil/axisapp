package com.developer.tanaypatil.axis2016.socIni;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.developer.tanaypatil.axis2016.R;

public class NoSmoking extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    android.support.design.widget.CollapsingToolbarLayout mCollapsingToolbarLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.socini_no_smoking);
        toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.nosmoke_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mCollapsingToolbarLayout = (android.support.design.widget.CollapsingToolbarLayout)findViewById(R.id.main_collapsing);
        mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);




        WebView view = (WebView) findViewById(R.id.smoke_wbv);
        String text;
        text = "<html><body style=\"backgroumd-color:transparent\"><p align=\"justify\" style=\"color:black;\">";
        text+= "Addressing the increasing levels of youngsters taking to smoking, AXIS\'16 took social media\n" +
                "        by storm. All it took for you to show your solidarity for the campaign, was to change your\n" +
                "        Facebook and Whatsapp profile pictures to the #ISayNoToSmoking poster for a day. With\n" +
                "        thousands of students across the country volunteering, we hope to have made a small\n" +
                "        difference among the college campus communities.";
        text+= "</p></body></html>";
        view.setBackgroundColor(Color.TRANSPARENT);
        view.loadData(text, "text/html", "utf-8");



    }
}
