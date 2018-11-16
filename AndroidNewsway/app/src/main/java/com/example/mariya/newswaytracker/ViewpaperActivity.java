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

public class ViewpaperActivity extends AppCompatActivity {
    TextView name,age, plac, ph, email, user, gen, dist, pin;
    SharedPreferences sh;
    String sh_name = "My Data";
    String Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpaper);
        name = findViewById(R.id.namtxt);
        plac = findViewById(R.id.plactxt);
        gen = findViewById(R.id.gentxt);
        age = findViewById(R.id.agetxt);
        email = findViewById(R.id.emailtxt);
        ph = findViewById(R.id.phntxt);
        dist = findViewById(R.id.disttxt);
        pin = findViewById(R.id.pintxt);
        user = findViewById(R.id.usetxt);
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
            w.setSoapObject("fetchoperat");
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
                Toast.makeText(ViewpaperActivity.this, s, Toast.LENGTH_SHORT).show();
                JSONObject jsonObject;
                for (int i = 0; i < jsonArray.length(); i++) {
                    jsonObject = jsonArray.getJSONObject(i);
                    name.setText(jsonObject.getString("Name"));
                    gen.setText(jsonObject.getString("Gender"));
                    plac.setText(jsonObject.getString("Place"));
                    age.setText(jsonObject.getString("Age"));
                    email.setText(jsonObject.getString("Email"));
                    ph.setText(jsonObject.getString("Phone"));
                    dist.setText(jsonObject.getString("District"));
                    pin.setText(jsonObject.getString("Pincode"));
                    user.setText(jsonObject.getString("User"));
                }


            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
    }
}
