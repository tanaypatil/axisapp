package com.developer.tanaypatil.axis2016.events;

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
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.developer.tanaypatil.axis2016.R;

public class Events extends AppCompatActivity implements View.OnClickListener {

    Animation left_in,left_out,right_in,right_out,up_in,up_out,gfm,stm;
    ViewFlipper vf1,vf2,vf3,vf4,vf5,vf6,vf7;
    TextView anr,se,sae,cad,mao,aim,ne;
    Typeface font;
    RelativeLayout f1,b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        font = Typeface.createFromAsset(getAssets(), "fonts/BebasNeue.otf");

        getVariables();
        setFlippers();
        setFont();

        vf1.setOnClickListener(this);
        vf2.setOnClickListener(this);
        vf3.setOnClickListener(this);
        vf4.setOnClickListener(this);
        vf5.setOnClickListener(this);
        vf6.setOnClickListener(this);
        vf7.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
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

    private void getVariables(){

        left_in = AnimationUtils.loadAnimation(this,R.anim.slide_in_left);
        left_out = AnimationUtils.loadAnimation(this,R.anim.slide_out_left);
        right_in = AnimationUtils.loadAnimation(this,R.anim.slide_in_right);
        right_out = AnimationUtils.loadAnimation(this,R.anim.slide_out_right);
        up_in = AnimationUtils.loadAnimation(this,R.anim.slide_in_up);
        up_out = AnimationUtils.loadAnimation(this,R.anim.slide_out_up);
        gfm = AnimationUtils.loadAnimation(this,R.anim.grow_from_middle);
        stm = AnimationUtils.loadAnimation(this,R.anim.shrink_to_middle);

         vf1 = (ViewFlipper)findViewById(R.id.flipper1);
         vf2 = (ViewFlipper)findViewById(R.id.flipper2);
         vf3 = (ViewFlipper)findViewById(R.id.flipper3);
         vf4 = (ViewFlipper)findViewById(R.id.flipper4);
         vf5 = (ViewFlipper)findViewById(R.id.flipper5);
         vf6 = (ViewFlipper)findViewById(R.id.flipper6);
         vf7 = (ViewFlipper)findViewById(R.id.flipper7);

        anr = (TextView)findViewById(R.id.anr);
        se = (TextView)findViewById(R.id.se);
        sae = (TextView)findViewById(R.id.sae);
        cad = (TextView)findViewById(R.id.cad);
        mao = (TextView)findViewById(R.id.mao);
        aim = (TextView)findViewById(R.id.aim);
        ne = (TextView)findViewById(R.id.ne);

        f1 = (RelativeLayout)findViewById(R.id.f1);
        b1 = (RelativeLayout)findViewById(R.id.b1);

    }


    private  void setFlippers(){

        vf1.setFlipInterval(3000);
        vf1.setInAnimation(gfm);
        vf1.setOutAnimation(stm);
        vf1.startFlipping();


        vf2.setFlipInterval(5100);
        vf2.setInAnimation(right_in);
        vf2.setOutAnimation(right_out);
        vf2.startFlipping();


        vf3.setFlipInterval(2100);
        vf3.setInAnimation(up_in);
        vf3.setOutAnimation(up_out);
        vf3.startFlipping();


        vf4.setFlipInterval(6100);
        vf4.setInAnimation(left_in);
        vf4.setOutAnimation(left_out);
        vf4.startFlipping();


        vf5.setFlipInterval(3900);
        vf5.setInAnimation(gfm);
        vf5.setOutAnimation(stm);
        vf5.startFlipping();

        vf6.setFlipInterval(7300);
        vf6.setInAnimation(up_in);
        vf6.setOutAnimation(up_out);
        vf6.startFlipping();

        vf7.setFlipInterval(4700);
        vf7.setInAnimation(left_in);
        vf7.setOutAnimation(left_out);
        vf7.startFlipping();

    }

    private  void  setFont(){

        anr.setTypeface(font);
        se.setTypeface(font);
        sae.setTypeface(font);
        cad.setTypeface(font);
        mao.setTypeface(font);
        aim.setTypeface(font);
        ne.setTypeface(font);

    }

    @Override
    public void onClick(View v) {
        String s=null;
        switch (v.getId()){
            case R.id.flipper1:
                s="AnR_evelist";
                break;
            case R.id.flipper2:
                s="SeList";
                break;
            case R.id.flipper3:
                s="SneList";
                break;
            case  R.id.flipper4:
                s="CndList";
                break;
            case R.id.flipper5:
                s="MnoList";
                break;
            case R.id.flipper6:
                s="AimList";
                break;
            case R.id.flipper7:
                s="NeList";
                break;
        }
        Intent intent = new Intent("android.intent.action."+s);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_left);
    }
}
