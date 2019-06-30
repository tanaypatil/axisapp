package com.developer.tanaypatil.axis2016.socIni;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.developer.tanaypatil.axis2016.R;

public class ChildLabor extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbar;
    android.support.design.widget.CollapsingToolbarLayout mCollapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.socini_child_labor);
        toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.childlabor_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mCollapsingToolbarLayout = (android.support.design.widget.CollapsingToolbarLayout)findViewById(R.id.main_collapsing);
        mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);






        WebView view = (WebView) findViewById(R.id.child_wbv);
        String text;
        text = "<html><body style=\"backgroumd-color:transparent\"><p align=\"justify\" style=\"color:black;\">";
        text+= "The dream that we all hope comes true someday is that there should be no reason to celebrate\n" +
                "        a day such as World Day against Child Labour.  AXIS\'16, performed street plays across Nagpur\n" +
                "        in prime youth hotspots such as malls and parks igniting the fire in the educated youth of\n" +
                "        the city, to rise and fight against this inhuman and cruel practice. The street plays received\n" +
                "        an overwhelming response from people of all walks of life.";
        text+= "</p></body></html>";
        view.setBackgroundColor(Color.TRANSPARENT);
        view.loadData(text, "text/html", "utf-8");





    }
}
