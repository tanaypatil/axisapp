package com.developer.tanaypatil.axis2016.socIni;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.developer.tanaypatil.axis2016.R;

public class colors extends AppCompatActivity {


    android.support.v7.widget.Toolbar toolbar;
    android.support.design.widget.CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.socini_colors);
        toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.colors_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mCollapsingToolbarLayout = (android.support.design.widget.CollapsingToolbarLayout)findViewById(R.id.main_collapsing);
        mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);





        WebView view = (WebView) findViewById(R.id.colors_wbv);
        String text;
        text = "<html><body style=\"backgroumd-color:transparent\"><p align=\"justify\" style=\"color:black;\">";
        text+= "Every festival has darker shades to it, an underbelly that is not always visible to the eye.\n" +
                "        So, is the case with Holi, the festival of colours. AXIS\'16, conducted a heart-warming city-wide\n" +
                "        series called Colours of Nagpur, wherein we brought to light the stories of those who go unnoticed,\n" +
                "        unheeded working relentlessly as the rest of the city was revelling in the spirit of Holi. Nurses,\n" +
                "        petrol pump workers, traffic policemen, airport staff, the \'Coolie\' at the train station, we covered\n" +
                "        them all. Just a simple act of being a good patient listener showed that we cared.";
        text+= "</p></body></html>";
        view.setBackgroundColor(Color.TRANSPARENT);
        view.loadData(text, "text/html", "utf-8");



    }
}
