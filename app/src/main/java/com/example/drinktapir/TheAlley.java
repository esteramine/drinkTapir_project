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

import java.util.ArrayList;

public class TheAlley extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter2 myAdapter2;

    TextView mStoreName;
    Button mButton;
    String mStore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_alley);

        ActionBar actionBar = getSupportActionBar();

        recyclerView = findViewById(R.id.recyclerView2);
        mStoreName = findViewById(R.id.storeName2);
        mButton = findViewById(R.id.submitBtn);

        final Intent intent = getIntent();
        mStore = intent.getStringExtra("iStore");
        mStoreName.setText(mStore); //set the store name
        actionBar.setTitle(mStore+"'s Products List");

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter2 = new MyAdapter2(this, getMyList());
        recyclerView.setAdapter(myAdapter2);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> strings = new ArrayList<>();
                int total = 0;
                for (int k = 0; k < myAdapter2.getItemCount(); k++){
                    if(!myAdapter2.model2s.get(k).getQuantity().equals("0")){
                        total = total+ Integer.valueOf(myAdapter2.model2s.get(k).getQuantity())*Integer.valueOf(myAdapter2.model2s.get(k).getPrice());
                        strings.add(myAdapter2.model2s.get(k).getProductName());
                        strings.add(myAdapter2.model2s.get(k).getPrice());
                        strings.add(myAdapter2.model2s.get(k).getQuantity());
                    }
                }

                Intent intent1 = new Intent();
                intent1.setClass(TheAlley.this, ConfirmPage.class);
                intent1.putExtra("iStore",mStore);
                intent1.putStringArrayListExtra("iArray",strings);
                intent1.putExtra("iTotal", String.valueOf(total));
                startActivity(intent1);
                //TheAlley.this.finish();
            }
        });
    }
    //用get intent的方式傳飲料項目
    private ArrayList<Model2> getMyList(){
        ArrayList<Model2> model2s = new ArrayList<>();
        Model2 m = new Model2();

        if (mStore.equals("THE ALLEY")){
            m.setProductName("Brown Sugar Deerioca Creme Brulee Milk");
            m.setQuantity("0");
            m.setPrice("50");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Brown Sugar Deerioca Milk");
            m.setQuantity("0");
            m.setPrice("50");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Brown Sugar Deerioca Cocoa Milk");
            m.setQuantity("0");
            m.setPrice("60");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Brown sugar Deerioca Matcha Milk");
            m.setQuantity("0");
            m.setPrice("60");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Snow Velvet Peach Oolong Tea");
            m.setQuantity("0");
            m.setPrice("65");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Snow Velvet Brown Sugar Latte");
            m.setQuantity("0");
            m.setPrice("65");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Snow Velvet Earl Grey Tea");
            m.setQuantity("0");
            m.setPrice("65");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Snow Velvet Flavor Fresh Tea");
            m.setQuantity("0");
            m.setPrice("55");
            model2s.add(m);

            m= new Model2();
            m.setProductName("No. 3 Alley Milk Tea");
            m.setQuantity("0");
            m.setPrice("55");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Royal No. 9 Milk Tea");
            m.setQuantity("0");
            m.setPrice("50");
            model2s.add(m);

        }

        else if(mStore.equals("TRUEDAN")){
            m.setProductName("Brown Sugar Bubble with Milk");
            m.setQuantity("0");
            m.setPrice("55");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Brown Sugar Bubble with Milk & Cream");
            m.setQuantity("0");
            m.setPrice("60");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Brown Sugar Bubble with Pudding");
            m.setQuantity("0");
            m.setPrice("55");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Brown Sugar Bubble with Grass Jelly");
            m.setQuantity("0");
            m.setPrice("50");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Brown Sugar with Taro");
            m.setQuantity("0");
            m.setPrice("65");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Brown Sugar with Milk");
            m.setQuantity("0");
            m.setPrice("55");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Brown Sugar Bubble Drink");
            m.setQuantity("0");
            m.setPrice("40");
            model2s.add(m);

            m= new Model2();
            m.setProductName("Brown Sugar Winter Melon Drink");
            m.setQuantity("0");
            m.setPrice("40");
            model2s.add(m);

        }

        else if(mStore.equals("CoCo")){
            m.setProductName("美式咖啡");
            m.setQuantity("0");
            m.setPrice("35");
            model2s.add(m);

            m= new Model2();
            m.setProductName("拿鐵咖啡");
            m.setQuantity("0");
            m.setPrice("50");
            model2s.add(m);

            m= new Model2();
            m.setProductName("珍珠拿鐵咖啡");
            m.setQuantity("0");
            m.setPrice("65");
            model2s.add(m);

            m= new Model2();
            m.setProductName("香草拿鐵咖啡");
            m.setQuantity("0");
            m.setPrice("55");
            model2s.add(m);

            m= new Model2();
            m.setProductName("法國奶霜咖啡");
            m.setQuantity("0");
            m.setPrice("65");
            model2s.add(m);

            m= new Model2();
            m.setProductName("卡布奇諾");
            m.setQuantity("0");
            m.setPrice("50");
            model2s.add(m);

            m= new Model2();
            m.setProductName("摩卡咖啡");
            m.setQuantity("0");
            m.setPrice("50");
            model2s.add(m);

            m= new Model2();
            m.setProductName("特調咖啡");
            m.setQuantity("0");
            m.setPrice("50");
            model2s.add(m);

            m= new Model2();
            m.setProductName("耶加雪啡咖啡");
            m.setQuantity("0");
            m.setPrice("60");
            model2s.add(m);

            m= new Model2();
            m.setProductName("耶加雪啡拿鐵");
            m.setQuantity("0");
            m.setPrice("70");
            model2s.add(m);

            m= new Model2();
            m.setProductName("阿薩姆奶茶");
            m.setQuantity("0");
            m.setPrice("35");
            model2s.add(m);
        }

        else if(mStore.equals("Milkshop")){
            m.setProductName("伯爵紅茶拿鐵");
            m.setQuantity("0");
            m.setPrice("45");
            model2s.add(m);

            m= new Model2();
            m.setProductName("珍珠紅茶拿鐵");
            m.setQuantity("0");
            m.setPrice("55");
            model2s.add(m);

            m= new Model2();
            m.setProductName("布丁紅茶拿鐵");
            m.setQuantity("0");
            m.setPrice("55");
            model2s.add(m);

            m= new Model2();
            m.setProductName("仙草凍紅茶拿鐵");
            m.setQuantity("0");
            m.setPrice("55");
            model2s.add(m);

            m= new Model2();
            m.setProductName("紅豆紅茶拿鐵");
            m.setQuantity("0");
            m.setPrice("55");
            model2s.add(m);

            m= new Model2();
            m.setProductName("茉香綠茶");
            m.setQuantity("0");
            m.setPrice("30");
            model2s.add(m);

            m= new Model2();
            m.setProductName("大正紅茶");
            m.setQuantity("0");
            m.setPrice("30");
            model2s.add(m);

        }
        return model2s;
    }
}
