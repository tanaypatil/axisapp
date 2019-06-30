package com.developer.tanaypatil.axis2016.team;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.developer.tanaypatil.axis2016.R;

public class Core extends AppCompatActivity implements View.OnClickListener {

    LinearLayout sumedh, amit, anoushka, harshal, himanshu, jp, vivek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_core);
        setVariables();
        setClicks();
    }

    public void setVariables() {
        sumedh = (LinearLayout) findViewById(R.id.sumedh);
        amit = (LinearLayout) findViewById(R.id.amit);
        anoushka = (LinearLayout) findViewById(R.id.anoushka);
        harshal = (LinearLayout) findViewById(R.id.harshal);
        himanshu = (LinearLayout) findViewById(R.id.himanshu);
        jp = (LinearLayout) findViewById(R.id.jp);
        vivek = (LinearLayout) findViewById(R.id.vivek);
    }

    public void setClicks() {
        /*sumedh.setOnClickListener(this);
        amit.setOnClickListener(this);
        anoushka.setOnClickListener(this);
        harshal.setOnClickListener(this);
        himanshu.setOnClickListener(this);
        jp.setOnClickListener(this);
        vivek.setOnClickListener(this);*/
    }

    @Override
    public void onClick(View v) {
        /*
        String s = null;
        switch (v.getId()) {
            case R.id.sumedh:
                s = "sumedh.kanade@axisvnit.org";
                break;
            case R.id.amit:
                s = "amit.tapas@axisvnit.org";
                break;
            case R.id.anoushka:
                s = "anoushka.banavar@axisvnit.org";
                break;
            case R.id.harshal:
                s = "harshal.patil@axisvnit.org";
                break;
            case R.id.himanshu:
                s = "hemanshu.chamate@axisvnit.org";
                break;
            case R.id.jp:
                s = "jyothiprakash.joga@axisvnit.org";
                break;
            case R.id.vivek:
                s = "vivek.deshpande@axisvnit.org";
                break;
        }
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{s});
        intent.setType("text/plain");
        try {
            startActivity(intent);
        }
        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(Core.this, "Failed to send mail, please try again later.", Toast.LENGTH_SHORT).show();
        }
        */
    }

}
