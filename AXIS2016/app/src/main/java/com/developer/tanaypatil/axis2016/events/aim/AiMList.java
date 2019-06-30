package com.developer.tanaypatil.axis2016.events.aim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.developer.tanaypatil.axis2016.R;
import com.developer.tanaypatil.axis2016.events.EveList_Adapter;
import com.developer.tanaypatil.axis2016.events.List_Item;

import java.util.ArrayList;
import java.util.List;

public class AiMList extends AppCompatActivity implements EveList_Adapter.ItemClickCallback {

    private RecyclerView recView;
    private EveList_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_mlist);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setElevation(0);
        recView = (RecyclerView)findViewById(R.id.aim_rec);
        recView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new EveList_Adapter(this,getListData());
        recView.setAdapter(adapter);
        adapter.setItemClickCallback(this);
    }

    public static List<List_Item> getListData(){
        List<List_Item> data = new ArrayList<>();
        String[] titles = {"COLL-in-COLL","KARTAVYA","TECHNO.DOCX"};

        for(int i=0;i<titles.length;i++){
            List_Item item = new List_Item();
            item.setTitle(titles[i]);
            data.add(item);
        }
        return data;
    }

    @Override
    public void onItemClick(int p) {
        String s = null;
        switch (p){
            case 0:
                s = "Coll";
                break;
            case 1:
                s = "Kart";
                break;
            case 2:
                s = "Techno";
                break;
        }
        Intent intent = new Intent("android.intent.action."+s);
        startActivity(intent);
    }
}
