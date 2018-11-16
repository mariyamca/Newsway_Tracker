package com.example.mariya.newswaytracker;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    Button B1,B2;
    EditText name, hname,age, phone, email, district, pin, accno, username, password, cpsw;
    Spinner spplace;
    RadioButton R1, R2;
    RadioGroup G;
    String placeid[]=null;
    String placename[]=null;
    ArrayAdapter <String> adapterplace;
    String Name, Hname, Age, Email, Phno, District, Pin, Accno, User, Pass, Cpsw, Gender, place;
    SharedPreferences sh;
    String sh_name = "My Data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.nameEditText);
        hname = findViewById(R.id.adresEditText);
        spplace = findViewById(R.id.placeEditText);
        age = findViewById(R.id.ageEditText);
        email = findViewById(R.id.emailEditText);
        phone = findViewById(R.id.phoneEditText);
        district = findViewById(R.id.disEditText);
        pin = findViewById(R.id.pinEditText);
        accno = findViewById(R.id.accEditText);
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
        placedata pl = new placedata();
        pl.execute();


    }

    private boolean isValidMail(String email) {
        boolean check;
        Pattern p;
        Matcher m;

        String EMAIL_STRING = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        p = Pattern.compile(EMAIL_STRING);

        m = p.matcher(email);
        check = m.matches();

        return check;
    }

    @Override
    public void onClick(View view) {
        Name = name.getText().toString();
        Hname = hname.getText().toString();
        Age = age.getText().toString();
        Phno = phone.getText().toString();
        Email = email.getText().toString();
        District = district.getText().toString();
        Pin = pin.getText().toString();
        Accno = accno.getText().toString();
        User = username.getText().toString();
        Pass = password.getText().toString();
        place=placeid[spplace.getSelectedItemPosition()];
        Cpsw = cpsw.getText().toString();


        if (view == B1) {


            if (Pass.equals(Cpsw)) {

                insertdata id = new insertdata();
                id.execute(Name, Hname, Gender, place, Age, Phno, Email, District, Pin, Accno, User, Pass);

            } else {
                Toast.makeText(this, "confirm password not same", Toast.LENGTH_SHORT).show();
            }


        }

        else if(view==B2){

            phone.setText("");
            email.setText("");
            name.setText("");
            hname.setText("");
            password.setText("");
            cpsw.setText("");
            username.setText("");
            R1.setChecked(false);
            R2.setChecked(false);
            G.setSelected(false);
            accno.setText("");
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

    private class insertdata extends AsyncTask<String, String, String> {

        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb = new WebServiceCaller();
            wb.setSoapObject("Registration");
            wb.addProperty("Name", strings[0]);
            wb.addProperty("Address", strings[1]);
            wb.addProperty("Gender", strings[2]);
            wb.addProperty("Place", strings[3]);
            wb.addProperty("Age", strings[4]);
            wb.addProperty("Email", strings[5]);
            wb.addProperty("Phone", strings[6]);
            wb.addProperty("District", strings[7]);
            wb.addProperty("Pincode", strings[8]);
            wb.addProperty("AccountNo", strings[9]);
            wb.addProperty("User", strings[10]);
            wb.addProperty("Password", strings[11]);
            wb.callWebService();
            return wb.getResponse();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            if (s.equals("true")) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                sh=getSharedPreferences(sh_name,MODE_PRIVATE);
                SharedPreferences.Editor editor=sh.edit();
                editor.putString("user_id",User);
                editor.putString("password",Pass);
                startActivity(intent);
            }

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
                JSONArray jsonArray=new JSONArray(s);
                placeid=new String[jsonArray.length()];
                placename=new String[jsonArray.length()];
                for (int i=0;i<jsonArray.length();i++)
                {
                    JSONObject jsonObject=jsonArray.getJSONObject(i);
                    placeid[i]=jsonObject.getString("pid");
                    placename[i]=jsonObject.getString("namid");
                }
                adapterplace=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,placename);
                adapterplace.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spplace.setAdapter(adapterplace);


            } catch (JSONException e) {
                e.printStackTrace();
            }


        }
    }
}




