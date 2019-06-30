package com.developer.tanaypatil.axis2016.attractions;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.developer.tanaypatil.axis2016.R;

public class naug extends AppCompatActivity {


    android.support.v7.widget.Toolbar toolbar;
    android.support.design.widget.CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attr_inaug);



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
        text+= "We are privileged to have Dr. Ashish Saraf, Vice President,Industry Development, Strategic\n" +
                "        Partnerships &amp; Offsets, Airbus India as our Chief Guest and Mr. Sachin Kurve, the\n" +
                "        District Collector of Nagpur as the Guest of Honour.<br><br>\n" +
                "        Concluding with a one of a kind Graphic and Beam show, the inaugural evening promises to be\n" +
                "        a memorable experience!<br><br>\n" +
                "        TIME : 23rd September at 5.30 pm in the VNIT Auditorium.<br>\n" +
                "        Passes available at the AXIS Registration Desk.";
        text+= "</p></body></html>";
        view.setBackgroundColor(Color.TRANSPARENT);
        view.loadData(text, "text/html", "utf-8");


    }
}
