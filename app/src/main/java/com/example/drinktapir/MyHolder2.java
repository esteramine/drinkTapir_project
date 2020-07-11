package com.example.drinktapir;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MyHolder2 extends RecyclerView.ViewHolder {

    TextView mProduct, mQuantity, mPrice;
    ImageButton mMinus, mAdd;
    int mquantity2 = 0;

    MyHolder2(@NonNull View itemView) {
        super(itemView);
        this.mProduct = itemView.findViewById(R.id.productName);
        this.mQuantity = itemView.findViewById(R.id.quantity);
        this.mPrice = itemView.findViewById(R.id.price);
        this.mAdd = itemView.findViewById(R.id.addBtn);
        this.mMinus = itemView.findViewById(R.id.minusBtn);


    }

}
