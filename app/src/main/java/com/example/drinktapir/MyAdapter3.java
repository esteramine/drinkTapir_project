package com.example.drinktapir;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MyAdapter3 extends RecyclerView.Adapter<MyHolder3> {
    Context c;
    ArrayList<Model2> model2s;

    public MyAdapter3(Context c, ArrayList<Model2> model2s) {
        this.c = c;
        this.model2s = model2s;
    }

    @NonNull
    @Override
    public MyHolder3 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row3,null);
        return new MyHolder3(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder3 myHolder3, int i) {
        myHolder3.mProduct.setText(model2s.get(i).getProductName());
        myHolder3.mQuantity.setText(model2s.get(i).getQuantity());
        myHolder3.mPrice.setText(model2s.get(i).getPrice());
    }

    @Override
    public int getItemCount() {
        return model2s.size();
    }
}
