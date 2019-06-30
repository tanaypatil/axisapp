package com.developer.tanaypatil.axis2016.workshops;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.developer.tanaypatil.axis2016.R;

public class MoboWks extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    android.support.design.widget.CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wks_mobo);
        toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.mobo_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mCollapsingToolbarLayout = (android.support.design.widget.CollapsingToolbarLayout)findViewById(R.id.main_collapsing);
        mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);




        WebView view = (WebView) findViewById(R.id.mobo_wbv);
        String text;
        text = "<html><body style=\"backgroumd-color:transparent\"><p align=\"justify\" style=\"color:black;\">";
        text+= "Mobile Phone Building Workshop is an exclusive workshop to learn the entire working of the\n" +
                "        mobile phone. The importance of a mobile phone is increasing day by day in our lives and\n" +
                "        this is a golden opportunity to learn the science behind it. The coding and logic gates\n" +
                "        required to do this workshop will be taught right from the basics on an Arduino processor.\n" +
                "        The mobile phone will be able to send and receive calls as well as send SMS to anyone. The\n" +
                "        kit will include an Arduino board, SIM 900A module, LCD display, dialer pad and attached\n" +
                "        wirings. The basics of automation will be also taught which will be helpful for robotics purposes too.";
        text+= "</p></body></html>";
        view.setBackgroundColor(Color.TRANSPARENT);
        view.loadData(text, "text/html", "utf-8");




    }
}
