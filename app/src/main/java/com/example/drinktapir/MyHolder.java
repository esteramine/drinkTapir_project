package com.example.drinktapir;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView mStore, mAddress;
    public ImageView mImg;
    ItemClickListener itemClickListener;

    MyHolder(@NonNull View itemView) {
        super(itemView);
        this.mStore = itemView.findViewById(R.id.cardStoreName);
        this.mAddress = itemView.findViewById(R.id.cardAddress);
        this.mImg = itemView.findViewById(R.id.cardIV);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClickListener(v, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener = ic;
    }
}
