package com.example.mariya.newswaytracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EditPaperActivity extends AppCompatActivity implements View.OnClickListener {
    TextView name, hname, plac, gend, age, ph, email, dist, pin, accno;
    SharedPreferences sh;
    String sh_name = "My Data";
    Spinner spplace;
    String placeid[] = null;
    String placename[] = null;
    ArrayAdapter<String> adapterplace;
    String Id;
    String Name, Hname, Plac, Age, Ph, Email, Gen, Dist, Pin, Accno, place;
    Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_paper);
        name = findViewById(R.id.name1EditText);
        spplace = findViewById(R.id.place1EditText);
        gend = findViewById(R.id.gender1EditText);
        age = findViewById(R.id.age1EditText);
        email = findViewById(R.id.email1EditText);
        ph = findViewById(R.id.phone1EditText);
        dist = findViewById(R.id.dist1EditText);
        update = findViewById(R.id.updButton);
        update.setOnClickListener(this);
        sh = getSharedPreferences(sh_name, Context.MODE_PRIVATE);
        Id = sh.getString("id", "");
        Toast.makeText(this, Id, Toast.LENGTH_SHORT).show();
        placedata pl = new placedata();
        pl.execute();
        fetchdata fe = new fetchdata();
        fe.execute(Id);

    }

    @Override
    public void onClick(View view) {
        Name = name.getText().toString();
        Gen = gend.getText().toString();
        Age = age.getText().toString();
        Email = email.getText().toString();
        Ph = ph.getText().toString();
        Dist = dist.getText().toString();
        place = placeid[spplace.getSelectedItemPosition()];
        updatedata up=new updatedata();
        up.execute(Name,Gen,place,Age,Ph,Email,Dist,Id);

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
                JSONObject jsonObject;
                for (int i = 0; i < jsonArray.length(); i++) {
                    jsonObject = jsonArray.getJSONObject(i);
                    name.setText(jsonObject.getString("Name"));
                    int spinnerPosition = adapterplace.getPosition(jsonObject.getString("Place"));
                    spplace.setSelection(spinnerPosition);
                    gend.setText(jsonObject.getString("Gender"));
                    age.setText(jsonObject.getString("Age"));
                    email.setText(jsonObject.getString("Email"));
                    ph.setText(jsonObject.getString("Phone"));
                    dist.setText(jsonObject.getString("District"));

                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private class updatedata extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb = new WebServiceCaller();
            wb.setSoapObject("updateoperat");
            wb.addProperty("Name", strings[0]);
            wb.addProperty("Place", strings[2]);
            wb.addProperty("Gender", strings[1]);
            wb.addProperty("Age", strings[3]);
            wb.addProperty("Email", strings[5]);
            wb.addProperty("Phone", strings[4]);
            wb.addProperty("District", strings[6]);
            wb.addProperty("Id", strings[7]);

            wb.callWebService();
            return wb.getResponse();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(EditPaperActivity.this, "Update Succesfully", Toast.LENGTH_SHORT).show();

        }
    }

    private class placedata extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb = new WebServiceCaller();
            wb.setSoapObject("getplaceoperation");
            wb.callWebService();
            return wb.getResponse();

        }

        protected void onPostExecute(String s) {
            super.onPostExecute(s);


            try {
                JSONArray jsonArray = new JSONArray(s);
                placeid = new String[jsonArray.length()];
                placename = new String[jsonArray.length()];
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    placeid[i] = jsonObject.getString("pid");
                    placename[i] = jsonObject.getString("namid");
                }
                adapterplace = new ArrayAdapter<String>(EditPaperActivity.this, android.R.layout.simple_spinner_item, placename);
                adapterplace.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spplace.setAdapter(adapterplace);


            } catch (JSONException e) {
                e.printStackTrace();
            }


        }
    }
}
