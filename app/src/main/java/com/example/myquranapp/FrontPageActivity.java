package com.example.myquranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrontPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_page);

        Button surahIndex= findViewById(R.id.surahIndex);
        Button paraIndex=findViewById(R.id.paraIndex);

        surahIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent surahIndex=new Intent(FrontPageActivity.this,AllSurahNamesActivity.class);
                surahIndex.putExtra("value","0");
                startActivity(surahIndex);
            }
        });

        paraIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent surahIndex=new Intent(FrontPageActivity.this,AllParaNamesActivity.class);
                surahIndex.putExtra("value","0");
                startActivity(surahIndex);
            }
        });
    }
}