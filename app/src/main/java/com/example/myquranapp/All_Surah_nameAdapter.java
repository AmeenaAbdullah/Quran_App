package com.example.myquranapp;

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

public class All_Surah_nameAdapter extends RecyclerView.Adapter<All_Surah_nameAdapter.MyVH>{

  private ArrayList<tsurah> surahList;

    public All_Surah_nameAdapter(ArrayList<tsurah> surah) {
        this.surahList=surah;
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
      holder.Surah_E.setText(String.valueOf(holder.data.getSurahNameE()));
      holder.Intro.setText(holder.data.getSurahIntro());
      holder.Id.setText(holder.data.getSurahID());
      holder.Nazol.setText(holder.data.getNazool());

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
      Surah_U = itemView.findViewById(R.id.surahNameU);
      Nazol = itemView.findViewById(R.id.Nazool);
      Id=itemView.findViewById(R.id.SurahNo);
    }
  }
}


