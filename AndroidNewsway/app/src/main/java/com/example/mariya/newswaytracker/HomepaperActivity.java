package com.example.mariya.newswaytracker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class HomepaperActivity extends AppCompatActivity implements View.OnClickListener,LocationListener {
    Button home, vie, edi, ch,rout;
    String loc;
    LocationManager locationManager;
    String lattitude;
    String longitude;
    SharedPreferences sh;
    String id="";
    String sh_name = "My Data";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepaper);
        home = findViewById(R.id.hmbtn);
        vie = findViewById(R.id.viiewbtn);
        edi = findViewById(R.id.editbtn);
        ch = findViewById(R.id.ch1btn);
        rout=findViewById(R.id.rtbtn);
        rout.setOnClickListener(this);
        home.setOnClickListener(this);
        vie.setOnClickListener(this);
        edi.setOnClickListener(this);
        ch.setOnClickListener(this);
        getLocation();
        SharedPreferences sh = getSharedPreferences(sh_name, MODE_PRIVATE);
        id = sh.getString("id", " ");
        Toast.makeText(this, "ID::: "+id, Toast.LENGTH_SHORT).show();
        Log.d("alliswell",id);
    }

    @Override
    public void onClick(View view) {
        if (view == home) {
            Intent i = new Intent(HomepaperActivity.this, HomepaperActivity.class);
            startActivity(i);
        } else if (view == vie) {
            Intent i = new Intent(HomepaperActivity.this, ViewpaperActivity.class);
            startActivity(i);
        } else if (view == edi) {
            Intent i = new Intent(HomepaperActivity.this, EditPaperActivity.class);
            startActivity(i);
        }
        else if (view ==rout) {
            Intent i = new Intent(HomepaperActivity.this, ViewrouteActivity.class);
            startActivity(i);

        }
        else {
            Intent i = new Intent(HomepaperActivity.this, PasswordActivity.class);
            startActivity(i);

        }

    }

    public void getLocation() {

        try {
            Log.d("alliswell", "Inside getLocation");
            locationManager = (LocationManager) getApplicationContext().getSystemService(Context.LOCATION_SERVICE);
            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 5000, 5, this);
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onLocationChanged(Location location) {
        Toast.makeText(this, "Latitude: " + location.getLatitude() + "\n Longitude: " + location.getLongitude(), Toast.LENGTH_SHORT).show();
        lattitude = location.getLatitude() + "";
        longitude = location.getLongitude() + "";
        try {
            Geocoder geocoder = new Geocoder(getBaseContext(), Locale.getDefault());
            List<Address> addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            addresses.get(0).getAddressLine(1);
            loc = "Latitude: " + location.getLatitude() + "\n Longitude: " + location.getLongitude() + "\n" + addresses.get(0).getAddressLine(0) + ", " +
                    addresses.get(0).getAddressLine(1);
            Log.d("alliswell", "hello");
            String myloc = addresses.get(0).getAddressLine(0) + "";

            SharedPreferences sh = getSharedPreferences(sh_name, MODE_PRIVATE);
            id = sh.getString("id", " ");
            Toast.makeText(this, "ID::: "+id, Toast.LENGTH_SHORT).show();

            insertLocation il = new insertLocation();
            il.execute(id,lattitude,longitude,myloc);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {
        Toast.makeText(this, "Please Enable GPS and Internet", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onProviderDisabled(String s) {

    }

    class insertLocation extends AsyncTask<String, String, String> {


        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb = new WebServiceCaller();
            wb.setSoapObject("Trackpaperboy");
            wb.addProperty("paprid", strings[0]);
            wb.addProperty("lattitude", strings[1]);
            wb.addProperty("longitude", strings[2]);
            wb.addProperty("plac", strings[3]);

            wb.callWebService();
            return wb.getResponse();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

        }
    }
}
