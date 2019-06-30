package com.developer.tanaypatil.axis2016.attractions;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.developer.tanaypatil.axis2016.R;

import java.util.HashMap;
import java.util.Map;

public class AmishForm extends AppCompatActivity implements View.OnClickListener {

    EditText name,mail,cont,city,coll;
    Button but;
    String server_url = "http://axisvnit.org/androregs";
    AlertDialog.Builder builder;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attr_amish_form);
        setVariables();

       /* but.setOnClickListener(this);*/


    }




    private void setVariables(){
        name = (EditText)findViewById(R.id.regname);
        mail = (EditText)findViewById(R.id.regmail);
        cont = (EditText)findViewById(R.id.regcon);
        coll = (EditText)findViewById(R.id.regcoll);
        city = (EditText)findViewById(R.id.regcity);
        but = (Button)findViewById(R.id.regsub);
        builder = new AlertDialog.Builder(AmishForm.this);

    }

    @Override
    public void onClick(View v) {/*
        if (v == but){
            if (name.getText().toString().matches("")||mail.getText().toString().matches("")||coll.getText().toString().matches("")
                    ||cont.getText().toString().matches("")||city.getText().toString().matches("")){
                Toast.makeText(AmishForm.this, "Enter all the credentials or else you will not be registered.", Toast.LENGTH_LONG).show();
            }
            else {
                progressDialog = new ProgressDialog(AmishForm.this);
                progressDialog.setTitle("REGISTERING");
                progressDialog.setMessage("Please Wait...");
                progressDialog.show();
                registerUser();
            }

        }
        */
    }


    private void registerUser(){
        final String fname = name.getText().toString().trim();
        final String fmail = mail.getText().toString().trim();
        final String fcity = city.getText().toString().trim();
        final String fcoll = coll.getText().toString().trim();
        final String fcont = cont.getText().toString().trim();





            StringRequest stringRequest = new StringRequest(Request.Method.POST, server_url,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            if (response.equals("\"error\"")){
                                progressDialog.dismiss();
                                builder.setTitle("REGISTRATION UNSUCCESSFULL.");
                                builder.setMessage("Form Validation Error. \nEither you have registered earlier or" +
                                        "there is some mistake in the form.");
                                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                });

                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();
                                Toast.makeText(AmishForm.this,response, Toast.LENGTH_LONG).show();
                            }
                            if (response.equals("\"success\"")){
                                progressDialog.dismiss();
                                builder.setTitle("REGISTRATION SUCCESSFULL.");
                                builder.setMessage("You have successfully registered for the Guest Lecture. The registration details" +
                                        " are mailed to your email address.");
                                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        name.setText("");
                                        city.setText("");
                                        coll.setText("");
                                        cont.setText("");
                                        mail.setText("");
                                    }
                                });

                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();
                                Toast.makeText(AmishForm.this,response, Toast.LENGTH_LONG).show();
                            }

                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            progressDialog.dismiss();
                            builder.setTitle("REGISTRATION UNSUCCESSFULL.");
                            builder.setMessage("Form Validation Error. \nEither you have registered earlier or" +
                                    " there is some mistake in the form.");
                            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                }
                            });

                            AlertDialog alertDialog = builder.create();
                            alertDialog.show();
                            Toast.makeText(AmishForm.this,"REGISTRATION ERROR. \nCheck the form and submit again.",Toast.LENGTH_LONG).show();
                        }
                    }){
                @Override
                protected Map<String,String> getParams(){
                    Map<String,String> params = new HashMap<String, String>();
                    params.put("name",fname);
                    params.put("city",fcity);
                    params.put("contact", fcont);
                    params.put("mail", fmail);
                    params.put("college", fcoll);
                    return params;
                }

            };

            RequestQueue requestQueue = Volley.newRequestQueue(this);
            requestQueue.add(stringRequest);







    }

}
