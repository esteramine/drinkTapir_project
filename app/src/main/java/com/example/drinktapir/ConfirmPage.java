package com.example.drinktapir;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ConfirmPage extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter3 myAdapter3;

    TextView mStoreName, mTotal;
    Button confirmBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_page);

        ActionBar actionBar = getSupportActionBar();

        recyclerView = findViewById(R.id.confirmRecyclerView);
        mStoreName = findViewById(R.id.storeName3);
        mTotal = findViewById(R.id.totalPrice);
        confirmBtn = findViewById(R.id.confirmAndPayBtn);

        Intent intent = getIntent();
        final String mStore = intent.getStringExtra("iStore");
        mStoreName.setText(mStore);
        ArrayList<String> strings = intent.getStringArrayListExtra("iArray");
        actionBar.setTitle("Order Confirmation From: "+mStore);
        String total = intent.getStringExtra("iTotal");
        mTotal.setText(total);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter3 = new MyAdapter3(this, getMyList(strings));
        recyclerView.setAdapter(myAdapter3);

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConfirmPage.this, "You just paid and the order just sent to "+mStore+".", Toast.LENGTH_LONG).show();
            }
        });
    }

    private ArrayList<Model2> getMyList(ArrayList<String> strings){
        ArrayList<Model2> model2s = new ArrayList<>();
        for (int i  = 0; i < strings.size(); i=i+3){
            Model2 m = new Model2();
            m.setProductName(strings.get(i));
            m.setPrice(strings.get(i+1));
            m.setQuantity(strings.get(i+2));
            model2s.add(m);
        }

        return model2s;
    }
}
