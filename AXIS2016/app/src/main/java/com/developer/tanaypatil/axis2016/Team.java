package com.developer.tanaypatil.axis2016;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Team extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper vf1,vf2,vf3,vf4;
    Animation left_in,left_out,right_in,right_out,up_in,up_out;
    TextView pinc,profinc,web,ccnt;
    Typeface font;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        font = Typeface.createFromAsset(getAssets(), "fonts/BebasNeue.otf");

        getVariables();
        setFlippers();
        setFont();

        vf3.setOnClickListener(this);
        vf4.setOnClickListener(this);
        vf1.setOnClickListener(this);
        vf2.setOnClickListener(this);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }


    private  void getVariables(){

        left_in = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
        left_out = AnimationUtils.loadAnimation(this,R.anim.slide_out_left);
        right_in = AnimationUtils.loadAnimation(this,R.anim.slide_in_right);
        right_out = AnimationUtils.loadAnimation(this,R.anim.slide_out_right);
        up_in = AnimationUtils.loadAnimation(this,R.anim.slide_in_up);
        up_out = AnimationUtils.loadAnimation(this,R.anim.slide_out_up);

        vf1 = (ViewFlipper)findViewById(R.id.tflipper1);
        vf2 = (ViewFlipper)findViewById(R.id.tflipper2);
        vf3 = (ViewFlipper)findViewById(R.id.tflipper3);
        vf4 = (ViewFlipper)findViewById(R.id.tflipper4);

        profinc = (TextView)findViewById(R.id.profinc);
        pinc = (TextView)findViewById(R.id.pinc);
        ccnt = (TextView)findViewById(R.id.ccnt);
        web = (TextView)findViewById(R.id.web);

    }

    private void setFlippers(){
        vf1.setFlipInterval(1300);
        vf2.setFlipInterval(3100);
        vf3.setFlipInterval(5300);
        vf4.setFlipInterval(4300);

        vf1.setInAnimation(right_in);
        vf1.setOutAnimation(right_out);

        vf2.setInAnimation(left_in);
        vf2.setOutAnimation(left_out);

        vf3.setInAnimation(left_in);
        vf3.setOutAnimation(left_out);

        vf4.setInAnimation(up_in);
        vf4.setOutAnimation(up_out);


        vf1.startFlipping();
        vf2.startFlipping();
        vf3.startFlipping();
        vf4.startFlipping();

    }

    private void setFont(){
        web.setTypeface(font);
        ccnt.setTypeface(font);
        pinc.setTypeface(font);
        profinc.setTypeface(font);
    }

    @Override
    public void onClick(View v) {

        String s = null;
        switch (v.getId()){
            case R.id.tflipper3:
                s = "Core";
                break;
            case R.id.tflipper4:
                s = "Desg";
                break;
            case R.id.tflipper2:
                s = "Pub";
                break;
            case R.id.tflipper1:
                s = "Profs";
                break;
        }
        Intent intent = new Intent("android.intent.action."+s);
        startActivity(intent);

    }
}
