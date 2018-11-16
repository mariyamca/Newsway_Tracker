package com.example.mariya.newswaytracker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class PayActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    TextView prod,amt;
    RecyclerView R1;
    List<Beanpayment> bpp=null;
    Adapterpayment app;
    String product[] = null;
    String status[] = null;
    String paystatus[] = null;
    String rate[]=null;
    String type[]=null;
    String bookingid[]=null;
    int fla=0;
    SharedPreferences sh;
    String sh_name = "My Data";
    String Id;
    int total=0;
    String payItems="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        prod=findViewById(R.id.prodttxt);
        amt=findViewById(R.id.amttxt);
        b1 = findViewById(R.id.btndebit);
        b1.setOnClickListener(this);


        sh = getSharedPreferences(sh_name, Context.MODE_PRIVATE);
        Id = sh.getString("id", "");

        getbookoperat gb=new getbookoperat();
        gb.execute(Id);


    }

    @Override
    public void onClick(View view) {
        if (view == b1) {
            Intent in = new Intent(PayActivity.this, MaincardActivity.class);
            startActivity(in);
        }
    }

    private class getbookoperat extends AsyncTask<String,String,String> {

        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb = new WebServiceCaller();
            wb.setSoapObject("getbookoperat");
            wb.addProperty("custid",strings[0]);
            wb.callWebService();
            return wb.getResponse();
        }
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            //          Toast.makeText(ViewBookActivity.this, s, Toast.LENGTH_SHORT).show();
            Log.d("allwell",s);
            SharedPreferences.Editor editor = sh.edit();
            editor.putString("s", s);
            editor.commit();
            try {
                JSONArray jsonArray = new JSONArray(s);
                product = new String[jsonArray.length()];
                status = new String[jsonArray.length()];
                paystatus=new String[jsonArray.length()];
                rate = new String[jsonArray.length()];
                type = new String[jsonArray.length()];
                bookingid = new String[jsonArray.length()];

                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    product[i] = jsonObject.getString("prodname");
                    rate[i] = jsonObject.getString("prodrate");
                    type[i] = jsonObject.getString("plantype");
                    bookingid[i] = jsonObject.getString("bookingid");
                    if(jsonObject.getString("status").equals("0"))
                    {
                        status[i] = "Pending";
                    }
                    else  if(jsonObject.getString("status").equals("1"))
                    {
                        status[i] = "Accepted";
                    }
                    else  if(jsonObject.getString("status").equals("2"))
                    {
                        status[i] = "Rejected";
                    }
                    if(jsonObject.getString("paystatus").equals("0"))
                    {
                        paystatus[i] = "Pending";
                    }
                    else  if(jsonObject.getString("paystatus").equals("1"))
                    {
                        paystatus[i] = "Paymment Succesfull";
                    }

                    if(jsonObject.getString("paystatus").equals("0") && jsonObject.getString("status").equals("1") ){
                        payItems= payItems+ product[i] +"\t:" +rate[i]+"\n";
                        total = total+ Integer.parseInt(rate[i]);
                         fla=1;
                    }


                    //                  Toast.makeText(ViewBookActivity.this, product[i]+",,,"+status[i], Toast.LENGTH_SHORT).show();
//                    Beanpayment bean=new Beanpayment();
//                    bean.setProductname(product[i]);
//                    bean.setStatus(status[i]);
//                    bean.setPlanrate(rate[i]);
//                    bean.setPlantype(type[i]);
//                    bean.setPaystatus(paystatus[i]);
//                    bean.setBookingid(bookingid[i]);
//                    bpp.add(bean);

                }
//                app=new Adapterpayment(bpp,getApplicationContext());
//                R1.setLayoutManager(new LinearLayoutManager(PayActivity.this));
//                R1.setAdapter(app);
                prod.setText(payItems);
                if(fla==1) {
                    amt.setText(total + "");
                }
                else{
                    amt.setText("Already Payed!!!");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
