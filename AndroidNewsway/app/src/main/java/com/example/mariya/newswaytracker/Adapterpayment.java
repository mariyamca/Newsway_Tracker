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
 * Created by Mariya on 10/19/2018.
 */

public class Adapterpayment extends RecyclerView.Adapter<Adapterpayment.MyViewHolder> {
    List<Beanpayment> bpp=null;
    Context context;
    SharedPreferences shpay;

    public Adapterpayment(List<Beanpayment> bpp, Context applicationContext) {
        this.bpp=bpp;
        context=applicationContext;
        shpay = context.getSharedPreferences("Payment", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = shpay.edit();

        editor.putInt("amount", '0');

        editor.commit();

    }

    @Override
    public Adapterpayment.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(parent.getContext()).inflate(R.layout.singlebook,parent,false);
        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Beanpayment B=bpp.get(position);
        holder.product.setText(B.getProductname());
        holder.status.setText(B.getStatus());

        String status=B.getStatus();
        String amount=B.getPlanrate();
        int tot=0;

        if(status.equals("Accepted")) {

            shpay = context.getSharedPreferences("Payment", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = shpay.edit();

            tot = shpay.getInt("amount",0)+Integer.parseInt(amount);

            editor.putInt("amount", tot);

            editor.commit();
        }

    }

    @Override
    public int getItemCount() {
        return bpp.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView product,status,paystatus;
        public MyViewHolder(View itemView) {
            super(itemView);
            product=itemView.findViewById(R.id.prodtxt);
            status=itemView.findViewById(R.id.ststxtt);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            int a=getAdapterPosition();
            Beanpayment bp=bpp.get(a);
            String product=bp.getProductname();
            String status=bp.getStatus();
            String paystatus=bp.getPaystatus();
            String bookingid=bp.getBookingid();
            String rate=bp.getPlanrate();
            String type=bp.getPlantype();

            Intent i = new Intent(context, PaymentActivity.class);
            i.putExtra("product",product);
            i.putExtra("status",status);
            i.putExtra("paystatus",paystatus);
            i.putExtra("bookingid",bookingid);
            i.putExtra("rate",rate);
            i.putExtra("type",type);
            context.startActivity(i);


        }
    }
}
