package com.developer.tanaypatil.axis2016.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.developer.tanaypatil.axis2016.Notifs.MyFirebaseInstanceIdService;
import com.developer.tanaypatil.axis2016.Notifs.SharedPrefManager;
import com.developer.tanaypatil.axis2016.R;

public class Main extends AppCompatActivity{


    private DrawerLayout drawer_layout;
    String server_url = "http://www.axisvnit.org/notifsandro";


   // private TextView tvDay, tvHour, tvMinute, tvSecond, tvEvent;
    //private LinearLayout linearLayout1, linearLayout2;
    //private Handler handler;
    //private Runnable runnable;
    private BroadcastReceiver broadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.cappbar);
        setSupportActionBar(toolbar);



        drawer_layout = (DrawerLayout)findViewById(R.id.drawer_layout);

        //initUI();
        //countDownStart();


        Menu_Fragment drawer_fragment = (Menu_Fragment)getSupportFragmentManager().findFragmentById(R.id.menu_fragment);
        drawer_fragment.setup(R.id.menu_fragment, drawer_layout, toolbar);


        final TextView textView = (TextView)findViewById(R.id.token_text);
        broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                textView.setText(SharedPrefManager.getInstance(Main.this).getToken());
            }
        };
        registerReceiver(broadcastReceiver, new IntentFilter(MyFirebaseInstanceIdService.TOKEN_BROADCAST));



        /*JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, server_url, (String) null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            textView.setText(response.getString("title"));
                        }catch (JSONException j){
                            j.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        textView.setText("Error");
                    }
                });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonObjectRequest);*/




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }




    @Override
    protected void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.translate,R.anim.translate_right);
    }






    /*
    @SuppressLint("SimpleDateFormat")
    private void initUI() {
        linearLayout1 = (LinearLayout) findViewById(R.id.ll1);
        linearLayout2 = (LinearLayout) findViewById(R.id.ll2);
        tvDay = (TextView) findViewById(R.id.txtTimerDay);
        tvHour = (TextView) findViewById(R.id.txtTimerHour);
        tvMinute = (TextView) findViewById(R.id.txtTimerMinute);
        tvSecond = (TextView) findViewById(R.id.txtTimerSecond);
        tvEvent = (TextView) findViewById(R.id.tvevent);
    }

    // //////////////COUNT DOWN START/////////////////////////
    public void countDownStart() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 1000);
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat(
                            "yyyy-MM-dd");
                    // Here Set your Event Date
                    Date futureDate = dateFormat.parse("2016-09-23");
                    Date currentDate = new Date();
                    if (!currentDate.after(futureDate)) {
                        long diff = futureDate.getTime()
                                - currentDate.getTime();
                        long days = diff / (24 * 60 * 60 * 1000);
                        diff -= days * (24 * 60 * 60 * 1000);
                        long hours = diff / (60 * 60 * 1000);
                        diff -= hours * (60 * 60 * 1000);
                        long minutes = diff / (60 * 1000);
                        diff -= minutes * (60 * 1000);
                        long seconds = diff / 1000;
                        tvDay.setText("" + String.format("%02d", days));
                        tvHour.setText("" + String.format("%02d", hours));
                        tvMinute.setText("" + String.format("%02d", minutes));
                        tvSecond.setText("" + String.format("%02d", seconds));
                    } else {
                        linearLayout1.setVisibility(View.VISIBLE);
                        linearLayout2.setVisibility(View.GONE);
                        tvEvent.setText("Android Event Start");
                        handler.removeCallbacks(runnable);
                        // handler.removeMessages(0);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 0);
    }*/



























}
