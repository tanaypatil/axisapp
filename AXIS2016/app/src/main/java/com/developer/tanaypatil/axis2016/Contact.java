package com.developer.tanaypatil.axis2016;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Contact extends AppCompatActivity implements View.OnClickListener {

    LinearLayout num1,num2,email, address;
    Typeface font;
    TextView n1,n2,mail;
    EditText name,fmail,cont,msg;
    Button submit;
    AlertDialog.Builder builder;
    ProgressDialog progressDialog;
    ImageView fb,yt,li,insta,tw;
    String server_url = "http://axisvnit.org/msgandro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        font = Typeface.createFromAsset(getAssets(), "fonts/BebasNeue.otf");

        num1 = (LinearLayout)findViewById(R.id.num1);
        num2 = (LinearLayout)findViewById(R.id.num2);
        email = (LinearLayout)findViewById(R.id.email);
        address = (LinearLayout)findViewById(R.id.address);

        name = (EditText)findViewById(R.id.feedname);
        fmail = (EditText)findViewById(R.id.feedmail);
        cont = (EditText)findViewById(R.id.feedcon);
        msg = (EditText)findViewById(R.id.feedmsg);
        submit = (Button)findViewById(R.id.feedsub);

        fb = (ImageView)findViewById(R.id.fb);
        yt = (ImageView)findViewById(R.id.yt);
        insta = (ImageView)findViewById(R.id.insta);
        tw = (ImageView)findViewById(R.id.twitter);
        li = (ImageView)findViewById(R.id.linkedin);

        /*num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        email.setOnClickListener(this);
        address.setOnClickListener(this);

        fb.setOnClickListener(this);
        yt.setOnClickListener(this);
        li.setOnClickListener(this);
        insta.setOnClickListener(this);
        tw.setOnClickListener(this);*/


        /*submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().matches("")||fmail.getText().toString().matches("")||cont.getText().toString().matches("")
                        ||msg.getText().toString().matches("")){
                    Toast.makeText(Contact.this,"Enter all the credentials.",Toast.LENGTH_LONG).show();
                }
                else {
                    progressDialog = new ProgressDialog(Contact.this);
                    progressDialog.setTitle("SENDING");
                    progressDialog.setMessage("Please Wait...");
                    progressDialog.show();
                    registerUser();
                }

            }
        });*/

        n1 = (TextView)findViewById(R.id.jp);
        n2 = (TextView)findViewById(R.id.md);
        mail = (TextView)findViewById(R.id.mail);
        //n1.setTypeface(font);
        //n2.setTypeface(font);
        //mail.setTypeface(font);

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

    @Override
    public void onClick(View v) {
        /*
        Intent intent = null;
        switch (v.getId()){
            case R.id.num1:
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+91-7767061700"));
                break;
            case R.id.num2:
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+91-7875352622"));
                break;
            case R.id.email:
                intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@axisvnit.org"});
                intent.setType("text/plain");
                break;
            case R.id.address:
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.google.co.in/maps/place/Visvesvaraya+National+" +
                        "Institute+of+Technology/@21.1232725,79.0492658,17z/data=!3m1!4b1!4m5!3m4!" +
                        "1s0x3bd4c092757d7017:0x2178cb8a2b2f0e8a!8m2!3d21.1232725!4d79.0514545"));
                break;
            case R.id.fb:
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/axisvnit/"));
                break;
            case R.id.yt:
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/channel/UCjczZvwh0T20yvMLsc5eUkA"));
                break;
            case R.id.insta:
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.instagram.com/axis_vnit"));
                break;
            case R.id.twitter:
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://twitter.com/axisvnit"));
                break;
            case R.id.linkedin:
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/company/axis-vnit-nagpur?trk=biz-companies-cym"));
                break;
        }
        try {
            startActivity(intent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Contact.this, "Please try again later.", Toast.LENGTH_SHORT).show();
        }
        */
    }





    private void registerUser(){
        final String fename = name.getText().toString().trim();
        final String femail = fmail.getText().toString().trim();
        final String fecont = cont.getText().toString().trim();
        final String femsg = msg.getText().toString().trim();

        StringRequest stringRequest = new StringRequest(Request.Method.POST, server_url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        progressDialog.dismiss();
                        Toast.makeText(Contact.this,"Message Sent.", Toast.LENGTH_LONG).show();
                        name.setText("");
                        fmail.setText("");
                        cont.setText("");
                        msg.setText("");
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        progressDialog.dismiss();
                        Toast.makeText(Contact.this,error.toString(),Toast.LENGTH_LONG).show();
                    }
                }){
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                params.put("name",fename);
                params.put("mail", femail);
                params.put("contact", fecont);
                params.put("msg",femsg);
                return params;
            }

        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }






}
