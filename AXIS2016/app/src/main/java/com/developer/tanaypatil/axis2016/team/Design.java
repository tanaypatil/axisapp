package com.developer.tanaypatil.axis2016.team;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.developer.tanaypatil.axis2016.R;

public class Design extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_design);
        LinearLayout tanay = (LinearLayout)findViewById(R.id.tanaydesg);
        /*tanay.setOnClickListener(this);*/
    }

    @Override
    public void onClick(View v) {
        /*String s = "+91-8624810406";
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+s));
        startActivity(intent);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"tanay.patil@axisvnit.org"});
        intent.setType("text/plain");
        try {
            startActivity(intent);
        }catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Design.this, "Failed to send mail, please try again later.", Toast.LENGTH_SHORT).show();
        }
        */
    }
}
