package com.example.mariya.newswaytracker;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ProductplanActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    List<Beanprodplan> bpp=null;
    Adapterproductplan app;
    Button B1;
    RecyclerView R1;
    Spinner splang, spitem, spprod;
    String language, item, product;
    String prodplanid[] = null;
    String prodplanrate[] = null;
    String plantype[] = null;
    String langid[] = null;
    String langname[] = null;
    String itemid[] = null;
    String itemname[] = null;
    String prodid[] = null;
    String prodname[] = null;
    ArrayAdapter<String> adapteritem;
    ArrayAdapter<String> adapterlang;
    String languaeId = null, itemId = null;
    String productId="",productName="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productplan);
        bpp=new ArrayList<>();
        splang = findViewById(R.id.langEditText);
        spitem = findViewById(R.id.itemEditText);
        spprod = findViewById(R.id.prodEditText);
        R1=findViewById(R.id.recycler1);
        B1 = findViewById(R.id.serButton);
        B1.setOnClickListener(this);
        languagedata p1 = new languagedata();
        p1.execute();
        itemdata pl = new itemdata();
        pl.execute();
        spitem.setOnItemSelectedListener(this);

    }


    @Override
    public void onClick(View view) {
//        item = itemid[spitem.getSelectedItemPosition()];
//        language = langid[splang.getSelectedItemPosition()];
        if (view == B1) {
            bpp.clear();


            productId=prodid[spprod.getSelectedItemPosition()];
            productName=spprod.getSelectedItem().toString();
            prodplandata pd= new prodplandata();
            pd.execute(productId);

        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

//        if (view == splang) {
//            languaeId = langid[splang.getSelectedItemPosition()];
//        } else if (view == spitem) {
//
//         }
        languaeId = langid[splang.getSelectedItemPosition()];
        itemId = itemid[spitem.getSelectedItemPosition()];
        Log.d("alliswell",languaeId+";"+itemId);
        proddata p= new proddata();
        p.execute(languaeId,itemId);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    private class itemdata extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb = new WebServiceCaller();
            wb.setSoapObject("getitemoperation");
            wb.callWebService();
            return wb.getResponse();
        }

        protected void onPostExecute(String s) {
            super.onPostExecute(s);


            try {
                JSONArray jsonArray = new JSONArray(s);
                itemid = new String[jsonArray.length()];
                itemname = new String[jsonArray.length()];
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    itemid[i] = jsonObject.getString("itemid");
                    itemname[i] = jsonObject.getString("itemnamid");
                }
                adapteritem = new ArrayAdapter<String>(ProductplanActivity.this, android.R.layout.simple_spinner_item, itemname);
                adapteritem.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spitem.setAdapter(adapteritem);


            } catch (JSONException e) {
                e.printStackTrace();
            }


        }
    }

    private class languagedata extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb = new WebServiceCaller();
            wb.setSoapObject("getlagoperation");
            wb.callWebService();
            return wb.getResponse();
        }

        protected void onPostExecute(String s) {
            super.onPostExecute(s);
   //         Toast.makeText(ProductplanActivity.this, s, Toast.LENGTH_SHORT).show();
            try {
                JSONArray jsonArray = new JSONArray(s);
                langid = new String[jsonArray.length()];
                langname = new String[jsonArray.length()];
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    langid[i] = jsonObject.getString("langid");
                    langname[i] = jsonObject.getString("lnamid");
                }
                adapterlang = new ArrayAdapter<String>(ProductplanActivity.this, android.R.layout.simple_spinner_item, langname);
                adapterlang.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                splang.setAdapter(adapterlang);


            } catch (JSONException e) {
                e.printStackTrace();
            }


        }

    }
        private class proddata extends AsyncTask<String, String, String> {
            @Override
            protected String doInBackground(String... strings) {
                WebServiceCaller wb = new WebServiceCaller();
                wb.setSoapObject("getprodoperation");
                wb.addProperty("languageid",strings[0]);
                wb.addProperty("itemid",strings[1]);
                wb.callWebService();
                return wb.getResponse();
            }

            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                Toast.makeText(ProductplanActivity.this, s, Toast.LENGTH_SHORT).show();
                try {
                    JSONArray jsonArray = new JSONArray(s);
                    prodid = new String[jsonArray.length()];
                    prodname = new String[jsonArray.length()];
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        prodid[i] = jsonObject.getString("prodid");
                        prodname[i] = jsonObject.getString("prodname");
                    }
                    adapterlang = new ArrayAdapter<String>(ProductplanActivity.this, android.R.layout.simple_spinner_item,prodname);
                    adapterlang.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spprod.setAdapter(adapterlang);


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        private class prodplandata extends AsyncTask<String,String,String>{

            @Override
            protected String doInBackground(String... strings) {
                WebServiceCaller wb = new WebServiceCaller();
                wb.setSoapObject("prodplanoperat");
                wb.addProperty("Id",strings[0]);
                wb.callWebService();
                return wb.getResponse();
            }
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
   //             Toast.makeText(ProductplanActivity.this, s, Toast.LENGTH_SHORT).show();
                Log.d("allwell",s);
                try {
                    JSONArray jsonArray = new JSONArray(s);
                    prodplanid = new String[jsonArray.length()];
                    plantype = new String[jsonArray.length()];
                    prodplanrate = new String[jsonArray.length()];
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        prodplanid[i] = jsonObject.getString("prodplanid");
                        plantype[i] = jsonObject.getString("plantype");
                        prodplanrate[i] = jsonObject.getString("prodrate");
                        Beanprodplan bean=new Beanprodplan();
                        bean.setPlantype(plantype[i]);
                        bean.setProdplanid(prodplanid[i]);
                        bean.setPlanrate(prodplanrate[i]);
                        bean.setProdid(productId);
                        bean.setProductName(productName);
                        bpp.add(bean);

                    }

                    app=new Adapterproductplan(bpp,getApplicationContext());
                    R1.setLayoutManager(new LinearLayoutManager(ProductplanActivity.this));
                    R1.setAdapter(app);


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

}



