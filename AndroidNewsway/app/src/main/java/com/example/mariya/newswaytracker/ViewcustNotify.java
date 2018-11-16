package com.example.mariya.newswaytracker;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ViewcustNotify extends AppCompatActivity {
    String id;
    SharedPreferences sp;
    RecyclerView rc;
    ViewcustNotify ada;
    List<BeanNotify> lst;
AdapterNotify adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewcust_notify);
        sp = getSharedPreferences("My Data", MODE_PRIVATE);
        id = sp.getString("id", "");



          rc=(RecyclerView)findViewById(R.id.recycle2);
          lst=new ArrayList<>();
        custnotification pn = new custnotification();
        pn.execute(id);
    }

    private class custnotification extends AsyncTask<String, String, String> {


        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb = new WebServiceCaller();
            wb.setSoapObject("viewcustnotification");
            wb.addProperty("custid",strings[0]);
            wb.callWebService();
            return wb.getResponse();

        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            Toast.makeText(ViewcustNotify.this,s, Toast.LENGTH_SHORT).show();

            Log.d("alliswell", s);
            try {

                JSONArray ja = new JSONArray(s);
                for(int i=0;i<ja.length();i++) {
                    JSONObject jo = ja.getJSONObject(i);

                    String date = jo.getString("Date");
                    String time = jo.getString("Time");
                    String msg = jo.getString("Msg");
                    Toast.makeText(ViewcustNotify.this, "date " + date + "time" + time + "msg" + msg, Toast.LENGTH_SHORT).show();
                    BeanNotify bb= new BeanNotify();
                    bb.setNotidate(date);
                    bb.setNotitime(time);
                    bb.setNotimsg(msg);
                    lst.add(bb);
                }
                adp =new AdapterNotify(lst,ViewcustNotify.this);
                rc.setLayoutManager(new LinearLayoutManager(ViewcustNotify.this));
                rc.setAdapter(adp);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        }
    }

