package com.example.drinktapir;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyHolder3 extends RecyclerView.ViewHolder {
    TextView mProduct, mQuantity, mPrice;

    public MyHolder3(@NonNull View itemView) {
        super(itemView);
        this.mProduct = itemView.findViewById(R.id.confirmProduct);
        this.mPrice = itemView.findViewById(R.id.confirmPrice);
        this.mQuantity = itemView.findViewById(R.id.confirmQuantity);

    }
}
