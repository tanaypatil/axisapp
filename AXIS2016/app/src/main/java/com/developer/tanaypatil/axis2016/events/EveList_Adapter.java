package com.developer.tanaypatil.axis2016.events;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.developer.tanaypatil.axis2016.R;

import java.util.List;

/**
 * Created by Tanay on 15-Jul-16.
 */
public class EveList_Adapter extends RecyclerView.Adapter<EveList_Adapter.ListHolder> {

    private List<List_Item> list_data;
    private LayoutInflater inflater;
    //Typeface font;
    private ItemClickCallback itemClickCallback;

    public interface ItemClickCallback{
        void onItemClick(int p);
    }

    public void setItemClickCallback(final ItemClickCallback itemClickCallback){
        this.itemClickCallback = itemClickCallback;
    }

    public EveList_Adapter(Context c, List<List_Item> listData) {
        //this.font = Typeface.createFromAsset(c.getAssets(), "fonts/BebasNeue.otf");
        this.inflater = LayoutInflater.from(c);
        this.list_data = listData;
    }

    class ListHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView title;
        private View container;

        public ListHolder(View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.eve_title);
            //title.setTypeface(font);
            this.container = itemView.findViewById(R.id.root_list);
            container.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemClickCallback.onItemClick(getAdapterPosition());
        }
    }

    @Override
    public ListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,parent,false);
        ListHolder holder = new ListHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ListHolder holder, int position) {
        List_Item item = list_data.get(position);
        holder.title.setText(item.getTitle());
    }

    @Override
    public int getItemCount() {
        return list_data.size();
    }
}
