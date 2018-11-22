package com.example.mariya.newswaytracker;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mariya on 11/15/2018.
 */

public class AdapterNotify extends RecyclerView.Adapter<AdapterNotify.MyViewHolder>{
    Context c;
    List<BeanNotify> listnoti;

    public AdapterNotify(List<BeanNotify> lst,ViewcustNotify viewcustNotify) {

        this.listnoti=lst;
        c=viewcustNotify;
    }

    @Override
    public AdapterNotify.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlenotify,parent,false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(AdapterNotify.MyViewHolder holder, int position) {
        BeanNotify obj= listnoti.get(position);
        holder.d.setText(obj.getNotidate());
        holder.t.setText(obj.getNotitime());
        holder.m.setText(obj.getNotimsg());

    }

    @Override
    public int getItemCount() {
        return listnoti.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView d,t,m;
        public MyViewHolder(View itemView) {
            super(itemView);

            d= itemView.findViewById(R.id.notidate);
            t= itemView.findViewById(R.id.notitime);
            m= itemView.findViewById(R.id.notimsg);
        }
    }
}
