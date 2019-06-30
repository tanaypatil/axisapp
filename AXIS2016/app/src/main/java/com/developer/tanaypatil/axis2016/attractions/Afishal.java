package com.developer.tanaypatil.axis2016.attractions;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.developer.tanaypatil.axis2016.R;

public class Afishal extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    android.support.design.widget.CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attr_afishal);

        toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.amish_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mCollapsingToolbarLayout = (android.support.design.widget.CollapsingToolbarLayout)findViewById(R.id.main_collapsing);
        mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
        WebView view = (WebView) findViewById(R.id.amish_wbv);
        String text;
        text = "<html><body style=\"backgroumd-color:transparent\"><p align=\"justify\" style=\"color:black;\">";
        text+= "For the Third time in India and the First time in Nagpur, AXIS'16 presents \"AFISHAL\" -\n" +
                "        The one and only Visual DJ, who has taken DJ'ing to a new level with the TREMOR.\n" +
                "        Get ready to Redefine Reality and experience the most incredible Live Show!!<br><br>\n" +
                "        Date: 25th September 2016.<br>\n" +
                "        Time: 6:30pm<br>\n" +
                "        Venue: VNIT Auditorium<br><br>\n" +
                "        Grab your free passes from the AXIS Reception Desk on 24th September from 10:00am.<br> Don't\n" +
                "        forget to get your ID proof while collecting your passes.";
        text+= "</p></body></html>";
        view.setBackgroundColor(Color.TRANSPARENT);
        view.loadData(text, "text/html", "utf-8");

    }
}
