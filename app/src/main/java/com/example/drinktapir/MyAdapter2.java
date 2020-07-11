package com.example.drinktapir;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MyAdapter2 extends RecyclerView.Adapter<MyHolder2> {
    Context c;
    ArrayList<Model2> model2s;


    public MyAdapter2(Context c, ArrayList<Model2> model2s) {
        this.c = c;
        this.model2s = model2s;
    }

    @NonNull
    @Override
    public MyHolder2 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row2, null);
        return new MyHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder2 myHolder2, final int i) {

        myHolder2.mProduct.setText(model2s.get(i).getProductName());
        myHolder2.mQuantity.setText(model2s.get(i).getQuantity());
        myHolder2.mPrice.setText(model2s.get(i).getPrice());


        myHolder2.mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myHolder2.mquantity2=myHolder2.mquantity2+1;
                myHolder2.mQuantity.setText(String.valueOf(myHolder2.mquantity2));
                model2s.get(i).setQuantity(String.valueOf(myHolder2.mquantity2));
            }
        });

        myHolder2.mMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myHolder2.mquantity2 > 0){
                    myHolder2.mquantity2=myHolder2.mquantity2-1;
                    myHolder2.mQuantity.setText(String.valueOf(myHolder2.mquantity2));
                    model2s.get(i).setQuantity(String.valueOf(myHolder2.mquantity2));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return model2s.size();
    }
}
