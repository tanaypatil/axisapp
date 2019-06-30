package com.developer.tanaypatil.axis2016;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static android.view.Window.FEATURE_NO_TITLE;

public class SPLASH extends Activity {

    ImageView logo,typo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        logo = (ImageView)findViewById(R.id.logo);
        typo = (ImageView)findViewById(R.id.typo);
        Animation logofade = AnimationUtils.loadAnimation(getBaseContext(), R.anim.logofade);
        final Animation fade = AnimationUtils.loadAnimation(getBaseContext(), R.anim.fade);

        final Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent start = new Intent("android.intent.action.Main");
                    startActivity(start);
                    overridePendingTransition(R.anim.fadefast,R.anim.fadefast);
                }
            }
        };

        logo.startAnimation(logofade);
        logofade.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                logo.setVisibility(View.VISIBLE);
                typo.startAnimation(fade);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        fade.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                typo.setVisibility(View.VISIBLE);
                timer.start();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
