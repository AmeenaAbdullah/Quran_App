package com.example.myquranapp;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AllParaNameAdapter extends RecyclerView.Adapter<AllParaNameAdapter.MyVH>{
    private Context _context;
    private ArrayList<para> surahList;

    public AllParaNameAdapter(Context c,ArrayList<para> surah) {
        this.surahList = surah;
        this._context = c;
    }

    @NonNull
    @Override
    public AllParaNameAdapter.MyVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.paraname, parent, false);
        return new MyVH(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AllParaNameAdapter.MyVH holder, int position) {
        holder.data=surahList.get(position);
        holder.Surah_U.setText(holder.data.getParaNameU());
        holder.Surah_E.setText(holder.data.getParaNameE());
        holder.Id.setText(String.valueOf(holder.data.getParaId()));
        int p=position;
        para parah=surahList.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(_context,ParaActivity.class);
                i.putExtra("nameE",parah.getParaNameE());
                i.putExtra("nameU", parah.getParaNameU());
                i.putExtra("index",String.valueOf(p));
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                _context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return surahList.size();
    }
    public class MyVH extends RecyclerView.ViewHolder {
        TextView Surah_U;
        TextView Surah_E;
        TextView Id;
        para data;
        public MyVH(@NonNull View itemView) {
            super(itemView);

            Surah_E = itemView.findViewById(R.id.paraNameE);
            Surah_U = itemView.findViewById(R.id.paraNameU);
            Id=itemView.findViewById(R.id.parano);

        }

    }
}


