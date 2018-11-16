package com.example.mariya.newswaytracker;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mariya on 10/11/2018.
 */

public class Adapterproductplan extends RecyclerView.Adapter<Adapterproductplan.MyViewHolder> {
    List<Beanprodplan> bpp=null;
    Context context;

    public Adapterproductplan(List<Beanprodplan> bpp, Context applicationContext) {
        this.bpp=bpp;
        context=applicationContext;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(parent.getContext()).inflate(R.layout.singleplan,parent,false);
        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
    Beanprodplan B=bpp.get(position);
    holder.plan.setText(B.getPlantype());
    holder.price.setText(B.getPlanrate());
    }

    @Override
    public int getItemCount() {
        return bpp.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView plan, price;
        public MyViewHolder(View itemView) {
            super(itemView);
            plan=itemView.findViewById(R.id.plantxt);
            price=itemView.findViewById(R.id.ratetxt);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            int a=getAdapterPosition();
            Beanprodplan bp=bpp.get(a);
            String planid=bp.getProdplanid();
            String planrate=bp.getPlanrate();
            String plantyp=bp.getPlantype();
            String prodid=bp.getProdid();
            Intent i = new Intent(context, BookingActivity.class);
            i.putExtra("planid",planid);
            i.putExtra("planrat",planrate);
            i.putExtra("plantype",plantyp);
            i.putExtra("prodid",prodid);
            i.putExtra("productName",bp.getProductName());
            context.startActivity(i);


        }
    }
}
