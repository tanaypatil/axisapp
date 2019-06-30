package com.developer.tanaypatil.axis2016.workshops;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.developer.tanaypatil.axis2016.R;

public class SelfBalWks extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    android.support.design.widget.CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wks_selfbal);
        toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.selfbal_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mCollapsingToolbarLayout = (android.support.design.widget.CollapsingToolbarLayout)findViewById(R.id.main_collapsing);
        mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);





        WebView view = (WebView) findViewById(R.id.selfbal_wbv);
        String text;
        text = "<html><body style=\"backgroumd-color:transparent\"><p align=\"justify\" style=\"color:black;\">";
        text+= "Ever rode a bike?\n" +
                "        The art of balancing oneself takes some time to learn. Now learn how to teach this feature to a\n" +
                "        robot to balance itself in the workshop on a self-balancing robot.\n" +
                "        This workshop will use gyro sensors and Arduino to balance the unique three tier chassis of\n" +
                "        the robot. Also learn how to code a bluetooth module to connect to the robot and make it\n" +
                "        move whilst balancing itself.";
        text+= "</p></body></html>";
        view.setBackgroundColor(Color.TRANSPARENT);
        view.loadData(text, "text/html", "utf-8");




    }
}
