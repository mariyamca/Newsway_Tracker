package com.example.mariya.newswaytracker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mariya on 10/28/2018.
 */

public class Adapterroute extends RecyclerView.Adapter<Adapterroute.MyViewHolder>{
Context context;
List<Beanroute> brList;

    public Adapterroute(List<Beanroute> bpp, Context applicationContext) {
        this.brList=bpp;
        context=applicationContext;

    }

    @Override
    public Adapterroute.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(parent.getContext()).inflate(R.layout.singleroute,parent,false);
        return new MyViewHolder(itemview);

           }

    @Override
    public void onBindViewHolder(Adapterroute.MyViewHolder holder, int position) {
        Beanroute B=brList.get(position);
        holder.custname.setText(B.getCustname());
        holder.hname.setText(B.getHname());
        holder.product.setText(B.getProdname());

    }

    @Override
    public int getItemCount() {
        return brList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView product,custname,hname;
        public MyViewHolder(View itemView) {
            super(itemView);
            custname=itemView.findViewById(R.id.custtxt);
            hname=itemView.findViewById(R.id.housetxt);
            product=itemView.findViewById(R.id.protxt);


        }

    }
}
