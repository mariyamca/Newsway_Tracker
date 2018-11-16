package com.example.mariya.newswaytracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TrackviewActivity extends AppCompatActivity {
    TextView lati,longi, plac, date,time;
    SharedPreferences sh;
    String sh_name = "My Data";
    String Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trackview);
        lati = findViewById(R.id.latitxt);
        longi = findViewById(R.id.longitxt);
        plac = findViewById(R.id.plactxt);
        date = findViewById(R.id.datetxt);
        time= findViewById(R.id.timetxt);
        sh = getSharedPreferences(sh_name, Context.MODE_PRIVATE);
        Id = sh.getString("id", "");
        Toast.makeText(this, Id, Toast.LENGTH_SHORT).show();
        fetchdata fe = new fetchdata();
        fe.execute(Id);
    }
    private class fetchdata extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller w = new WebServiceCaller();
            w.setSoapObject("ViewLocation");
            w.addProperty("Id", strings[0]);
            w.callWebService();
            return w.getResponse();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            try {
                JSONArray jsonArray = null;
                jsonArray = new JSONArray(s);
                Toast.makeText(TrackviewActivity.this, s, Toast.LENGTH_SHORT).show();
                JSONObject jsonObject;
                for (int i = 0; i < jsonArray.length(); i++) {
                    jsonObject = jsonArray.getJSONObject(i);
                    lati.setText(jsonObject.getString("Latti"));
                    longi.setText(jsonObject.getString("Longi"));
                    plac.setText(jsonObject.getString("Plac"));
                    date.setText(jsonObject.getString("Dat"));
                    time.setText(jsonObject.getString("Tim"));

                }


            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }
}
