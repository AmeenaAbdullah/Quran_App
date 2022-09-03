package com.example.myquranapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllSurahNamesActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_main);

        DBhelper dbHelper  = new DBhelper(AllSurahNamesActivity.this);
        ArrayList<tsurah> list =dbHelper.getAllSurah();    //Get Data from DB
        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(AllSurahNamesActivity.this,
                LinearLayoutManager.HORIZONTAL,
                true);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new All_Surah_nameAdapter(list) ;
        recyclerView.setAdapter(adapter);

    }
}