package com.saturnus.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBuah;
    private ArrayList<Buah> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvBuah = findViewById(R.id.rv_Buah);
        rvBuah.setHasFixedSize(true);

        list.addAll(BuahData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvBuah.setLayoutManager(new LinearLayoutManager(this));
        ListBuahAdapter listBuahAdapter = new ListBuahAdapter(list);
        rvBuah.setAdapter(listBuahAdapter);

    }
}