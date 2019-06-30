package com.developer.tanaypatil.axis2016.main;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.developer.tanaypatil.axis2016.R;

import java.util.Collections;
import java.util.List;

/**
 * Created by Tanay on 24-Jun-16.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    Main main;
    private Context context;
    private LayoutInflater inflater;
    private ClickListener clickListener;
    List<Information> data = Collections.emptyList();

    public MyAdapter(Context context, List<Information> data){
        this.context=context;
        inflater = LayoutInflater.from(context);
        this.data=data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.custom_row, parent, false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Information current=data.get(position);
        holder.title.setText(current.title);
        holder.icon.setImageResource(current.iconId);
    }


    public void setClickListener(ClickListener clickListener){
        this.clickListener=clickListener;
    }


    public interface ClickListener{
        public void itemClicked(View view, int position, String s);
    }


    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView title;
        ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            title=(TextView)itemView.findViewById(R.id.listText);
            icon=(ImageView)itemView.findViewById(R.id.listIcon);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            String s = null;
            int i=getAdapterPosition();
            switch (i){
                case 0:
                    s="About";
                    break;
                case 1:
                    s = "Attractions";
                    break;
                case 2:
                    s="Events";
                    break;
                case 3:
                    s="Workshops";
                    break;
                case 4:
                    s="Social";
                    break;
                case 5:
                    s="Sponsors";
                    break;
                case 6:
                    s="Team";
                    break;
                case 7:
                    s="Contact";
                    break;
            }

            if (clickListener!=null){
                clickListener.itemClicked(v,getAdapterPosition(),s);
            }

            Intent intent = new Intent("android.intent.action."+s);
        }

    }

}
