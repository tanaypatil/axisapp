package com.developer.tanaypatil.axis2016.main;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developer.tanaypatil.axis2016.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Menu_Fragment extends Fragment implements MyAdapter.ClickListener {


    DrawerLayout mDrawerLayout;
    private MyAdapter adapter;
    private View onClickView;
    private android.support.v7.widget.RecyclerView recyclerView;
    private ActionBarDrawerToggle mActionToggle;
    private boolean mUserLearnedDrawer;
    private boolean mFromSavedInstanceState;
    public static final String PREF_FILE_NAME = "testpref";
    public static final String KEY_USER_LEARNED_DRAWER = "user_learned_drawer";
    View containerView;

    public Menu_Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUserLearnedDrawer = Boolean.valueOf(readFromPreferences(getActivity(), KEY_USER_LEARNED_DRAWER, "false"));
        if(savedInstanceState!=null){
            mFromSavedInstanceState = true;
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_menu_, container, false);
        recyclerView= (android.support.v7.widget.RecyclerView) layout.findViewById(R.id.drawerList);
        adapter=new MyAdapter(getActivity(),getData());
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return layout;
    }

    public static List<Information> getData(){
        List<Information> data=new ArrayList<>();
        int[] icons={R.drawable.user_shape, R.drawable.star_circle,R.drawable.events, R.drawable.workshop,R.drawable.socini,R.drawable.sponsors,R.drawable.team, R.drawable.mobile_phone};
        String[] titles={"About", "Attractions","Events","Workshops","Social Initiatives","Sponsors","Team","Contact Us"};
        for (int i=0;i<titles.length && i<icons.length;i++){
            Information current = new Information();
            current.iconId=icons[i];
            current.title=titles[i];
            data.add(current);
        }
        return data;
    }

    public void setup(int fragmentId, DrawerLayout drawerLayout, final Toolbar toolbar) {
        containerView = getActivity().findViewById(fragmentId);
        mDrawerLayout = drawerLayout;
        mActionToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close){

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);

                if(!mUserLearnedDrawer){
                    mUserLearnedDrawer = true;
                    saveToPreferences(getActivity(), KEY_USER_LEARNED_DRAWER, mUserLearnedDrawer + "");
                }
                }


            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                if (Build.VERSION.SDK_INT >= 16) {

                    getActivity().invalidateOptionsMenu();

                } else {

                    //layout.setBackgroundDrawable(animation);

                }
                //getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);


                if (Build.VERSION.SDK_INT >= 16) {

                    if (slideOffset<0.6)
                        toolbar.setAlpha(1-slideOffset);

                } else {

                    //layout.setBackgroundDrawable(animation);
                }



            }
        };

        if(!mUserLearnedDrawer && !mFromSavedInstanceState){
            mDrawerLayout.openDrawer(containerView);
        }

        mDrawerLayout.setDrawerListener(mActionToggle);
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mActionToggle.syncState();
            }
        });
    }

    public static void saveToPreferences(Context context, String preferenceName, String preferenceValue){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(preferenceName, preferenceValue);
        editor.apply();
    }

    public static String readFromPreferences(Context context, String preferenceName, String defaultValue){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(preferenceName, defaultValue);
    }

    @Override
    public void itemClicked(View view, int position, String s) {
        if (position == 5){
            Intent newIntent = new Intent();
            newIntent.setAction(Intent.ACTION_VIEW);
            newIntent.addCategory(Intent.CATEGORY_BROWSABLE);
            newIntent.setData(Uri.parse("http://axisvnit.org/sponsors.html"));
            startActivity(newIntent);
        }
        else {
            Intent intent = new Intent("android.intent.action."+s);
            startActivity(intent);
        }

        this.onClickView = view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
