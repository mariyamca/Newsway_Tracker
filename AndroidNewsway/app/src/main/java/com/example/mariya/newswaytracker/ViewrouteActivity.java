package com.example.mariya.newswaytracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ViewrouteActivity extends AppCompatActivity {
    TextView from,to;
    SharedPreferences sh;
    String sh_name = "My Data";
    String Id,custid;
    RecyclerView R1;
    List<Beanroute> bpp = null;
    Adapterroute app;
    String product[] = null;
    String name[] = null;
    String house[] = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewroute);
        from=findViewById(R.id.route1txt);
        to=findViewById(R.id.route2txt);
        R1 = findViewById(R.id.recycler1);
        sh = getSharedPreferences(sh_name, Context.MODE_PRIVATE);
        Id = sh.getString("id", "");
        bpp=new ArrayList<>();
        routedata rd=new routedata();
        rd.execute(Id);
        viewcust gb = new viewcust();
        gb.execute(Id);

    }


    private class routedata extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller w = new WebServiceCaller();
            w.setSoapObject("Viewroute");
            w.addProperty("PaperboyId", strings[0]);
            w.callWebService();
            return w.getResponse();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            try {
                JSONArray jsonArray = null;
                jsonArray = new JSONArray(s);
                Toast.makeText( ViewrouteActivity.this, s, Toast.LENGTH_SHORT).show();
                JSONObject jsonObject;
                for (int i = 0; i < jsonArray.length(); i++) {
                    jsonObject = jsonArray.getJSONObject(i);
                    from.setText(jsonObject.getString("placfrom"));
                    to.setText(jsonObject.getString("placto"));


                }


            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }
    private class viewcust extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb = new WebServiceCaller();
            wb.setSoapObject("Viewcust");
            wb.addProperty("PaperboyId", strings[0]);
            wb.callWebService();
            return wb.getResponse();
        }

        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.d("allwell", s);
            SharedPreferences.Editor editor = sh.edit();
            editor.putString("s", s);
            editor.commit();
            try {
                JSONArray jsonArray = new JSONArray(s);
                name = new String[jsonArray.length()];
                house = new String[jsonArray.length()];
                product = new String[jsonArray.length()];


                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    name[i] = jsonObject.getString("Name");
                    house[i] = jsonObject.getString("Hname");
                    product[i] = jsonObject.getString("product");
                    if(!product[i].equals("")) {
                        Beanroute be = new Beanroute();
                        be.setCustname(name[i]);
                        be.setHname(house[i]);
                        be.setProdname(product[i]);
                        bpp.add(be);
                    }

                }
                app = new Adapterroute(bpp,getApplicationContext());
                R1.setLayoutManager(new LinearLayoutManager(ViewrouteActivity.this));
                R1.setAdapter(app);


            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
