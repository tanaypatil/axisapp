package com.developer.tanaypatil.axis2016.attractions;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.developer.tanaypatil.axis2016.R;

import pl.bclogic.pulsator4droid.library.PulsatorLayout;

public class Amish extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    Button register;
    android.support.design.widget.CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attr_amish);
        toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.amish_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        PulsatorLayout pulsator = (PulsatorLayout) findViewById(R.id.pulsator);
        pulsator.start();
        mCollapsingToolbarLayout = (android.support.design.widget.CollapsingToolbarLayout)findViewById(R.id.main_collapsing);
        mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        WebView view = (WebView) findViewById(R.id.amish_wbv);
        String text;
        text = "<html><body style=\"backgroumd-color:transparent\"><p align=\"justify\" style=\"color:black;\">";
        text+= "An atheist turned believer, a banker turned writer, he is a man who rekindled young India\'s fascination for our rich mythology.\n" +
                "        <br>AXIS, VNIT invites you to an evening with one of India's most popular authors Amish Tripathi. Come, live the dream on the 24th of\n" +
                "        September at VNIT, Nagpur.";
        text+= "</p></body></html>";
        view.setBackgroundColor(Color.TRANSPARENT);
        view.loadData(text, "text/html", "utf-8");
        register = (Button)findViewById(R.id.regis);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.AmishForm");
                startActivity(intent);
            }
        });
    }
}
