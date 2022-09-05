package com.example.myquranapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class All_Surah_nameAdapter extends RecyclerView.Adapter<All_Surah_nameAdapter.MyVH>{
     private Context _context;
    private ArrayList<tsurah> surahList;

    public All_Surah_nameAdapter(Context c,ArrayList<tsurah> surah) {
        this.surahList = surah;
        this._context = c;
    }

    @NonNull
    @Override
    public All_Surah_nameAdapter.MyVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.surahname, parent, false);
        return new MyVH(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull All_Surah_nameAdapter.MyVH holder, int position) {
        holder.data=surahList.get(position);
        holder.Surah_U.setText(holder.data.getSurahNameU());
        holder.Surah_E.setText(holder.data.getSurahNameE());
        holder.Id.setText(String.valueOf(holder.data.getSurahID()));
        holder.Nazol.setText(holder.data.getNazool());
        int p=position;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(_context,SurahActivity.class);
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
        TextView Nazol;
        TextView Intro;
        TextView Id;
        tsurah data;
        public MyVH(@NonNull View itemView) {
            super(itemView);

            Surah_E = itemView.findViewById(R.id.SurahNameE);
            Surah_U = itemView.findViewById(R.id.paraname2);
            Nazol = itemView.findViewById(R.id.Nazool);
            Id=itemView.findViewById(R.id.surahno);

        }

    }
}


