package com.example.mariya.newswaytracker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity implements View.OnClickListener {
    TextView prod, plan, rate, sts,paysts,payuse,paystat;
    Button b1;
    String planid, prodid, bookid,userid,bid;
    SharedPreferences sh,shpay;
    String sh_name = "My Data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        prod = findViewById(R.id.prdtxt);
        plan = findViewById(R.id.plntxt);
        rate = findViewById(R.id.ratetxt);
        sts = findViewById(R.id.ststxtt);
        paysts=findViewById(R.id.payststxtt);
        paysts.setVisibility(View.INVISIBLE);
        paystat=findViewById(R.id.paystastxtt);
        paystat.setVisibility(View.INVISIBLE);
        b1 = findViewById(R.id.btndebit);
        payuse=findViewById(R.id.paytxt);
        payuse.setVisibility(View.INVISIBLE);
        b1.setOnClickListener(this);
        b1.setVisibility(View.INVISIBLE);
        bookid= getIntent().getStringExtra("bookingid");
        String productName = getIntent().getStringExtra("product");
        String prodrate = getIntent().getStringExtra("rate");
        String plantype = getIntent().getStringExtra("type");
        String status = getIntent().getStringExtra("status");
        if(status.equals("Accepted"))
        {
            b1.setVisibility(View.VISIBLE);
            payuse.setVisibility(View.VISIBLE);
            paystat.setVisibility(View.VISIBLE);
            paysts.setVisibility(View.VISIBLE);
        }
        String paystatus = getIntent().getStringExtra("paystatus");
        if(paystatus.equals("Paymment Succesfull"))
        {
            b1.setVisibility(View.INVISIBLE);
            payuse.setVisibility(View.INVISIBLE);
        }
        sh = getSharedPreferences(sh_name, Context.MODE_PRIVATE);
        userid = sh.getString("id", "");
        SharedPreferences.Editor editor=sh.edit();
        editor.putString("bid",bookid);
        editor.commit();


//
//        shpay = getSharedPreferences("Payment", Context.MODE_PRIVATE);
//
//        String tot = shpay.getInt("amount",0)+"";



        prod.setText(productName);
        plan.setText(plantype);
        rate.setText(prodrate);
        sts.setText(status);
        paysts.setText(paystatus);
    }

    @Override
    public void onClick(View view) {
        if (view == b1) {
            Intent in = new Intent(PaymentActivity.this, CardActivity.class);
            startActivity(in);

        }
    }
}
