package com.example.drinktapir;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drinktapir.Model;
import com.example.drinktapir.MyHolder;
import com.example.drinktapir.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
    Context c;
    ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        myHolder.mStore.setText(models.get(i).getStoreName());
        myHolder.mAddress.setText(models.get(i).getAddress());
        myHolder.mImg.setImageResource(models.get(i).getImg());

        myHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                String gStore = models.get(position).getStoreName();

                Intent intent = new Intent(c, TheAlley.class);
                intent.putExtra("iStore", gStore);
                c.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
