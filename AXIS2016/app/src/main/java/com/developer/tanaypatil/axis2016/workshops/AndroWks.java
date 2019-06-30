package com.developer.tanaypatil.axis2016.workshops;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.developer.tanaypatil.axis2016.R;

public class AndroWks extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    android.support.design.widget.CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wks_andro);
        toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.andro_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mCollapsingToolbarLayout = (android.support.design.widget.CollapsingToolbarLayout)findViewById(R.id.main_collapsing);
        mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);






        WebView view = (WebView) findViewById(R.id.andro_wbv);
        String text;
        text = "<html><body style=\"backgroumd-color:transparent\"><p align=\"justify\" style=\"color:black;\">";
        text+= "Android being a robust operating system provides you with stability that has a strong Linux\n" +
                "        core which helps your android application to withstand the judgment of internet traffic.\n" +
                "        Android has covered very importance in the mobile industry mostly with our Android\n" +
                "        applications and developers which then empowers programmers to develop an ingenious mobile\n" +
                "        application for your android smartphone. This workshop is a comprehensive look at the\n" +
                "        Android architecture that teaches how to build and deploy applications for Android phones\n" +
                "        and tablets using the Java programming language. Starting with the installation of the\n" +
                "        required developer tools, including Eclipse and the Android SDK, the course covers how to\n" +
                "        build the user interface, work with local data, integrate data from the accelerometer and\n" +
                "        other sensors, and deploy finished applications to the Play Store.";
        text+= "</p></body></html>";
        view.setBackgroundColor(Color.TRANSPARENT);
        view.loadData(text, "text/html", "utf-8");





    }
}
