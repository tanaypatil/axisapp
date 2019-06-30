package com.developer.tanaypatil.axis2016.socIni;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.developer.tanaypatil.axis2016.R;

public class EnvDay extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    android.support.design.widget.CollapsingToolbarLayout mCollapsingToolbarLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.socini_env_day);
        toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.envday_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mCollapsingToolbarLayout = (android.support.design.widget.CollapsingToolbarLayout)findViewById(R.id.main_collapsing);
        mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);



        WebView view = (WebView) findViewById(R.id.env_wbv);
        String text;
        text = "<html><body style=\"backgroumd-color:transparent\"><p align=\"justify\" style=\"color:black;\">";
        text+= "Does it sadden you to watch trees being felled only to pave the way to concrete jungles? If\n" +
                "        it does, the My Tree, My Friend initiative by AXIS\'16 was just the place for you to have been.\n" +
                "         My Tree, My Friend was a Nagpur city-wide attempt to open the Nagpurian\'s eyes as to how\n" +
                "        their once green, tree lined city was fast urbanizing into yet another grey, polluted,\n" +
                "        metropolis. Following on the lines of the friendship day trend of tying ribbons to one\'s\n" +
                "        friends, the students of VNIT instead each befriended a tree by tying a green ribbon around\n" +
                "        it. The green ribbon, signified a promise of protection in the face of deforestation, from\n" +
                "        the younger generation to the good old trees whose shade they had grown up under.";
        text+= "</p></body></html>";
        view.setBackgroundColor(Color.TRANSPARENT);
        view.loadData(text, "text/html", "utf-8");



    }
}
