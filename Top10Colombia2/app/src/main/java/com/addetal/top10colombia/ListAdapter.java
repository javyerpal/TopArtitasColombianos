package com.addetal.top10colombia;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{
    private final List<ListElement> mData;
    private final LayoutInflater mInflater;
    final ListAdapter.OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(ListElement item);
}

    public ListAdapter(List<ListElement> itemList, Context context, ListAdapter.OnItemClickListener listener){
        this.mInflater= LayoutInflater.from(context);
        this.mData = itemList;
        this.listener = listener;
    }

    @Override
    public int getItemCount() {return mData.size();}

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        @SuppressLint("InflateParams") View view = mInflater.inflate(R.layout.list_element1, null);
          return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListAdapter.ViewHolder holder, final int position){
        holder.bindData(mData.get(position));
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView name, city, status, top;

        ViewHolder(View itemView){
            super(itemView);
            iconImage = itemView.findViewById(R.id.iconImageView);
            name = itemView.findViewById(R.id.nameTextView);
            city = itemView.findViewById(R.id.cityTextView);
            status = itemView.findViewById(R.id.statusTextView);
            top = itemView.findViewById(R.id.topTextView);
                    
        }

        void bindData(final ListElement item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            city.setText(item.getCity());
            status.setText(item.getStatus());
            top.setText(item.getTop());
            itemView.setOnClickListener(v -> listener.onItemClick(item));
        }
    }
}
