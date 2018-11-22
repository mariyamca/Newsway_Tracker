package com.example.mariya.newswaytracker;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static android.R.layout.simple_spinner_item;

public class AdvertiseActivity extends AppCompatActivity implements View.OnClickListener {
    Button B1, B2;
    TextView rate;
    Spinner sptype, spheight, spwidth;
    String advid[] = null;
    String[] advtype = null;
    String advwid[] = null;
    String advheig[] = null;
    ArrayAdapter<String> adapteratype;
    ArrayAdapter<String> adapterwidth;
    ArrayAdapter<String> adapterheight;
    String type, width, height;
    String advtypId = null, advwidId = null, advheiId = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advertise);
        sptype = findViewById(R.id.typEditText);
        spheight = findViewById(R.id.heightEditText);
        spwidth = findViewById(R.id.widthEditText);
        rate = findViewById(R.id.rattxt);
        B1 = findViewById(R.id.serButton);
        B1.setOnClickListener(this);
        B2 = findViewById(R.id.nextButton);
        B2.setOnClickListener(this);
        advdata pd = new advdata();
        pd.execute();


    }

    @Override
    public void onClick(View view) {
        type = advid[sptype.getSelectedItemPosition()];
        width = spwidth.getSelectedItem().toString();
        height = spheight.getSelectedItem().toString();

        if (view == B1) {
            ratedata rd = new ratedata();
            rd.execute(width, height);
            Toast.makeText(this, "Succes", Toast.LENGTH_SHORT).show();

        } else if (view == B2) {
            String rat=rate.getText().toString();
            insertdata id = new insertdata();
            id.execute(type,width,height,rat);
            Intent intent = new Intent(AdvertiseActivity.this, imageuploadActivity.class);
            startActivity(intent);
        }

    }

    private class advdata extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb = new WebServiceCaller();
            wb.setSoapObject("getadvertiseperation");
            wb.callWebService();
            return wb.getResponse();

        }

        protected void onPostExecute(String s) {
            super.onPostExecute(s);


            try {
                JSONArray jsonArray = new JSONArray(s);
                advid = new String[jsonArray.length()];
                advtype = new String[jsonArray.length()];
                advwid = new String[jsonArray.length()];
                advheig = new String[jsonArray.length()];
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    advid[i] = jsonObject.getString("advid");
                    advtype[i] = jsonObject.getString("advtpe");
                    advwid[i] = jsonObject.getString("advwid");
                    advheig[i] = jsonObject.getString("advheig");
                }
                adapteratype = new ArrayAdapter<String>(AdvertiseActivity.this, simple_spinner_item, advtype);
                adapteratype.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sptype.setAdapter(adapteratype);
                adapterwidth = new ArrayAdapter<String>(AdvertiseActivity.this, simple_spinner_item, advwid);
                adapterwidth.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spwidth.setAdapter(adapterwidth);
                adapterheight = new ArrayAdapter<String>(AdvertiseActivity.this, simple_spinner_item, advheig);
                adapterheight.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spheight.setAdapter(adapterheight);

            } catch (JSONException e) {
                e.printStackTrace();
            }


        }
    }

    private class ratedata extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb = new WebServiceCaller();
            wb.setSoapObject("getrateadvertise");
            wb.addProperty("width", strings[0]);
            wb.addProperty("height", strings[1]);
            wb.callWebService();
            return wb.getResponse();
        }

        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            rate.setText(s);
            Toast.makeText(AdvertiseActivity.this, "Rate " + s, Toast.LENGTH_SHORT).show();
        }


    }

    private class insertdata extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb = new WebServiceCaller();
            wb.setSoapObject("insertadvertise");
            wb.addProperty("type", strings[0]);
            wb.addProperty("width", strings[1]);
            wb.addProperty("height", strings[2]);
            wb.addProperty("rate", strings[3]);
            wb.callWebService();
            return wb.getResponse();
        }

        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            if (!s.equals("Error")) {
                Toast.makeText(AdvertiseActivity.this, "Inserted " + s, Toast.LENGTH_SHORT).show();
                Intent in=new Intent(AdvertiseActivity.this,imageuploadActivity.class);
                in.putExtra("id",s);
                startActivity(in);
            }
            else{
                Toast.makeText(AdvertiseActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
