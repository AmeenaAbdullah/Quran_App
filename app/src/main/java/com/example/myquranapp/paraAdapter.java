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

public class paraAdapter extends RecyclerView.Adapter<paraAdapter.MyVH>{
    private Context _context;
    private ArrayList<tayah> ayat;


    public paraAdapter(Context c,ArrayList<tayah> t) {
        this.ayat = t;
        this._context = c;
    }

    @NonNull
    @Override
    public paraAdapter.MyVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.para_customized_view, parent, false);
        return new paraAdapter.MyVH(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull paraAdapter.MyVH holder, int position) {
        holder.data=ayat.get(position);
        holder.para.setText(holder.data.getArabicText());
        int p=position;
        tayah parah=ayat.get(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(_context,ParaActivity.class);
                i.putExtra("arabic",parah.getArabicText());
                i.putExtra("tarjma", parah.getFatehMuhammadJaland());
                i.putExtra("index",String.valueOf(p));
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                _context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ayat.size();
    }
    public class MyVH extends RecyclerView.ViewHolder {
        TextView para;
        TextView paraayat;
        TextView Id;
        tayah data;
        public MyVH(@NonNull View itemView) {
            super(itemView);

            para = itemView.findViewById(R.id.paraname2);
//            paraayat = itemView.findViewById(R.id.paraayat);

        }

    }
}
