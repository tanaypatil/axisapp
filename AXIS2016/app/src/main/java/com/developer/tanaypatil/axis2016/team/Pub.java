package com.developer.tanaypatil.axis2016.team;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.developer.tanaypatil.axis2016.R;

public class Pub extends AppCompatActivity implements View.OnClickListener {

    LinearLayout jassu, ponnu, daga, chandra, hinge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_pub);
        setVariables();
        setClicks();
    }

    public void setVariables(){
        jassu = (LinearLayout)findViewById(R.id.jassu);
        ponnu = (LinearLayout)findViewById(R.id.ponnu);
        daga = (LinearLayout)findViewById(R.id.daga);
        chandra = (LinearLayout)findViewById(R.id.chandra);
        hinge = (LinearLayout)findViewById(R.id.hinge);
    }

    public void setClicks(){
        /*
        jassu.setOnClickListener(this);
        ponnu.setOnClickListener(this);
        daga.setOnClickListener(this);
        chandra.setOnClickListener(this);
        hinge.setOnClickListener(this);*/
    }

    @Override
    public void onClick(View v) {
        /*
        String s = null;
        switch (v.getId()){
            case R.id.jassu:
                s = "jashwanth.reddy@axisvnit.org";
                break;
            case R.id.ponnu:
                s = "meghana.ponnuru@axisvnit.org";
                break;
            case R.id.daga:
                s = "mihika.daga@axisvnit.org";
                break;
            case R.id.chandra:
                s = "praneel.chandra@axisvnit.org";
                break;
            case R.id.hinge:
                s = "shubham.hinge@axisvnit.org";
                break;
        }
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{s});
        intent.setType("text/plain");
        try {
            startActivity(intent);
        }
        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(Pub.this, "Failed to send mail, please try again later.", Toast.LENGTH_SHORT).show();
        }
        */
    }
}
