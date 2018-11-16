package com.example.mariya.newswaytracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class BookingActivity extends  AppCompatActivity implements View.OnClickListener {
    TextView name,prod,plan,rate;
    Button b1;
    String planid,prodid, userid,un;
    SharedPreferences sh;
    String sh_name = "My Data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        name=findViewById(R.id.namtxt);
        prod=findViewById(R.id.prodtxt);
        plan=findViewById(R.id.plantxt);
        rate=findViewById(R.id.ratetxt);
        b1=findViewById(R.id.Button1);
        b1.setOnClickListener(this);

        planid= getIntent().getStringExtra("planid");
        String planrate=getIntent().getStringExtra("planrat");
        String plantype=getIntent().getStringExtra("plantype");
        prodid=getIntent().getStringExtra("prodid");
        String productName=getIntent().getStringExtra("productName");
        sh = getSharedPreferences(sh_name, Context.MODE_PRIVATE);
        userid = sh.getString("id", "");
        un=sh.getString("username","");
        prod.setText(productName);
        plan.setText(plantype);
        rate.setText(planrate);
        name.setText(un);


    }

    @Override
    public void onClick(View view) {
        insertdata in=new insertdata();
        in.execute(userid,planid,prodid);


    }
    private class insertdata extends AsyncTask<String,String,String >{

        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb = new WebServiceCaller();
            wb.setSoapObject("insertoperat");

            wb.addProperty("customerid",strings[0]);
            wb.addProperty("planid",strings[1]);
            wb.addProperty("productid",strings[2]);
            wb.callWebService();
            return wb.getResponse();
        }
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(BookingActivity.this, s, Toast.LENGTH_SHORT).show();


        }
    }


}




