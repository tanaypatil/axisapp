package com.developer.tanaypatil.axis2016.workshops;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.developer.tanaypatil.axis2016.R;

public class OrniWks extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    android.support.design.widget.CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wks_orni);
        toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.orni_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mCollapsingToolbarLayout = (android.support.design.widget.CollapsingToolbarLayout)findViewById(R.id.main_collapsing);
        mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);



        WebView view = (WebView) findViewById(R.id.orni_wbv);
        String text;
        text = "<html><body style=\"backgroumd-color:transparent\"><p align=\"justify\" style=\"color:black;\">";
        text+= "Ever seen a bird flying? Replicate the original flying machine in the form of an \n" +
                "        ornithocopter. This aero-model will flap its mechanical wings using only mechanical energy. \n" +
                "        The highest quality and lightweight material will help you to fly it to greater heights and distances.";
        text+= "</p></body></html>";
        view.setBackgroundColor(Color.TRANSPARENT);
        view.loadData(text, "text/html", "utf-8");



    }
}
