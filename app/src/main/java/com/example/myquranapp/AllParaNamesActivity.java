package com.example.myquranapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllParaNamesActivity extends AppCompatActivity {
    QDH store;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_para_names);
        store=new QDH();
       ArrayList<para> list =store.getAllPara();
        recyclerView = findViewById(R.id.recycleViewpara);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(AllParaNamesActivity.this,
               LinearLayoutManager.VERTICAL,
                false);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new AllParaNameAdapter(getApplicationContext(),list) ;
        recyclerView.setAdapter(adapter);
    }
}