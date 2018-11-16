package com.example.mariya.newswaytracker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PaperboyActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    Button B1,B2;
    EditText name,age, phone, email, district, pin, username, password, cpsw;
    RadioButton R1, R2;
    RadioGroup G;
    Spinner spplace;
    String placeid[]=null;
    String placename[]=null;
    ArrayAdapter<String> adapterplace;
    String Name, Age, Email, Phno, District, Pin, User, Pass, Cpsw, Gender, place;
    SharedPreferences sh;
    String sh_name = "My Data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paperboy);
        name = findViewById(R.id.nameEditText);
        spplace = findViewById(R.id.placeEditText);
        age = findViewById(R.id.ageEditText);
        email = findViewById(R.id.emailEditText);
        phone = findViewById(R.id.phoneEditText);
        district = findViewById(R.id.disEditText);
        pin = findViewById(R.id.pinEditText);
        username = findViewById(R.id.userEditText);
        password = findViewById(R.id.passwordEditText);
        cpsw = findViewById(R.id.cnfpassEditText);
        R1 = findViewById(R.id.maleRadioButton);
        R2 = findViewById(R.id.femaleRadioButton);
        G = findViewById(R.id.gender);
        B1 = findViewById(R.id.regButton);
        B1.setOnClickListener(this);
        B2=findViewById(R.id.canButton);
        B2.setOnClickListener(this);
        G.setOnCheckedChangeListener(this);
        PaperboyActivity.placedata pl = new PaperboyActivity.placedata();
        pl.execute();
    }

    @Override
    public void onClick(View view) {
        Name = name.getText().toString();
        Age = age.getText().toString();
        Email = email.getText().toString();
        Phno = phone.getText().toString();
        District = district.getText().toString();
        Pin = pin.getText().toString();
        User = username.getText().toString();
        Pass = password.getText().toString();
        Cpsw = cpsw.getText().toString();
        place=placeid[spplace.getSelectedItemPosition()];


        if (view == B1) {


            if (Pass.equals(Cpsw)) {

                PaperboyActivity.insertdata id = new PaperboyActivity.insertdata();
                id.execute(Name,place, Gender,  Age, Email,Phno, District, Pin, User, Pass);

            } else {
                Toast.makeText(this, "confirm password not same", Toast.LENGTH_SHORT).show();
            }


        }

        else if(view==B2){


            email.setText("");
            phone.setText("");
            name.setText("");
            password.setText("");
            cpsw.setText("");
            username.setText("");
            R1.setChecked(false);
            R2.setChecked(false);
            G.setSelected(false);
            pin.setText("");
            district.setText("");
            age.setText("");

        }

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i == R.id.maleRadioButton) {
            Gender = R1.getText().toString();
        } else {
            Gender = R2.getText().toString();
        }

    }

      private class insertdata extends AsyncTask<String,String,String>{

          @Override
          protected String doInBackground(String... strings) {
              WebServiceCaller wb = new WebServiceCaller();
              wb.setSoapObject("Registoperation");
              wb.addProperty("Name", strings[0]);
              wb.addProperty("Place", strings[1]);
              wb.addProperty("Gender", strings[2]);
              wb.addProperty("Age", strings[3]);
              wb.addProperty("Email", strings[4]);
              wb.addProperty("Phone", strings[5]);
              wb.addProperty("District", strings[6]);
              wb.addProperty("Pincode", strings[7]);
              wb.addProperty("User", strings[8]);
              wb.addProperty("Password", strings[9]);
              wb.callWebService();
              return wb.getResponse();

          }
          @Override
          protected void onPostExecute(String s) {
              super.onPostExecute(s);
              Toast.makeText(PaperboyActivity.this, s, Toast.LENGTH_SHORT).show();
              if (s.equals("true")) {
                  Intent intent = new Intent(PaperboyActivity.this, PaprboyLoginActivity.class);
                  sh=getSharedPreferences(sh_name,MODE_PRIVATE);
                  SharedPreferences.Editor editor=sh.edit();
                  editor.putString("user_id",User);
                  editor.putString("password",Pass);
                  startActivity(intent);
              }

          }
      }

      private class placedata extends AsyncTask<String,String,String>{

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
                  JSONArray jsonArray=new JSONArray(s);
                  placeid=new String[jsonArray.length()];
                  placename=new String[jsonArray.length()];
                  for (int i=0;i<jsonArray.length();i++)
                  {
                      JSONObject jsonObject=jsonArray.getJSONObject(i);
                      placeid[i]=jsonObject.getString("pid");
                      placename[i]=jsonObject.getString("namid");
                  }
                  adapterplace=new ArrayAdapter<String>(PaperboyActivity.this,android.R.layout.simple_spinner_item,placename);
                  adapterplace.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                  spplace.setAdapter(adapterplace);


              } catch (JSONException e) {
                  e.printStackTrace();
              }


          }
      }
}

