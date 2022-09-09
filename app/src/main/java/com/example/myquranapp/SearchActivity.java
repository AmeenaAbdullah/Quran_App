package com.example.myquranapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    All_Surah_nameAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<tsurah> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
//        Button search=findViewById(R.id.searchbtn);
//        EditText text=findViewById(R.id.editsurah);
        SearchView simpleSearchView=(SearchView)findViewById(R.id.simpleSearchView);
        Intent i = getIntent();
        int T_index = Integer.parseInt(i.getStringExtra("value"));

        DBhelper dbHelper = new DBhelper(SearchActivity.this);


        simpleSearchView.setOnQueryTextListener((SearchView.OnQueryTextListener) this);
//        search.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String searchtext=text.getText().toString();
//                list = dbHelper.searchdata(searchtext);    //Get Data from DB
//                recyclerView = findViewById(R.id.recyclerViewsearch);
//
//                recyclerView.setHasFixedSize(true);
//                layoutManager = new LinearLayoutManager(SearchActivity.this,
//                        LinearLayoutManager.VERTICAL,
//                        false);
//                recyclerView.setLayoutManager(layoutManager);
//                adapter = new All_Surah_nameAdapter(getApplicationContext(), list, T_index);
//
//                recyclerView.setAdapter(adapter);
//            }
//        });

    }
}