package com.developer.tanaypatil.axis2016.events.sne;

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

public class SneList extends AppCompatActivity implements EveList_Adapter.ItemClickCallback {

    private RecyclerView recView;
    private EveList_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sne_list);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setElevation(0);
        recView = (RecyclerView)findViewById(R.id.sne_rec);
        recView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new EveList_Adapter(this,getListData());
        recView.setAdapter(adapter);
        adapter.setItemClickCallback(this);
    }

    public static List<List_Item> getListData(){
        List<List_Item> data = new ArrayList<>();
        String[] titles = {"ANIMAZIONE","CRYPTOCRUX","INSOMNIA","POSTEROLIC"};

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
                s = "Anim";
                break;
            case 1:
                s = "Crypto";
                break;
            case 2:
                s = "Inso";
                break;
            case 3:
                s = "Poster";
                break;
        }
        Intent intent = new Intent("android.intent.action."+s);
        startActivity(intent);
    }
}