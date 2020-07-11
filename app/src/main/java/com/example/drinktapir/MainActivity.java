package com.example.drinktapir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(this, getMyList());

        recyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList(){
        ArrayList<Model> models = new ArrayList<>();
        Model m;

        m = new Model();
        m.setStoreName("THE ALLEY");
        m.setAddress("台北市大安區復興南路二段206號");
        m.setImg(R.drawable.the_alley);
        models.add(m);

        m = new Model();
        m.setStoreName("TRUEDAN");
        m.setAddress("台北市中正區羅斯福路一段12號");
        m.setImg(R.drawable.truedan);
        models.add(m);

        m = new Model();
        m.setStoreName("CoCo");
        m.setAddress("台北市中正區南昌路一段77號");
        m.setImg(R.drawable.coco);
        models.add(m);

        m = new Model();
        m.setStoreName("Milkshop");
        m.setAddress("台北市中正區寧波西街50號");
        m.setImg(R.drawable.milkshop);
        models.add(m);

        return models;
    }
}
