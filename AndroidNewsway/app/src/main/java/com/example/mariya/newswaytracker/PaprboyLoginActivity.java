package com.example.mariya.newswaytracker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PaprboyLoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText Uname, Passw;
    Button login, newuser;
    SharedPreferences sh;
    String sh_name = "My Data";
    String id = "", psw = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paprboy_login);
        setContentView(R.layout.activity_login);
        Uname = findViewById(R.id.unameEditText);
        Passw = findViewById(R.id.pswEditText);
        login = findViewById(R.id.logButton);
        newuser = findViewById(R.id.newButton);
        login.setOnClickListener(this);
        newuser.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == login) {
            String a = Uname.getText().toString();
            String b = Passw.getText().toString();
            PaprboyLoginActivity.selectdata sd = new PaprboyLoginActivity.selectdata();
            sd.execute(a, b);

        } else {
            Intent intent = new Intent(PaprboyLoginActivity.this, PaperboyActivity.class);
            startActivity(intent);
        }
    }

    private class selectdata extends AsyncTask<String, String, String> {
        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb=new WebServiceCaller();
            wb.setSoapObject("seloperation");
            wb.addProperty("username",strings[0]);
            wb.addProperty("password",strings[1]);
            wb.callWebService();
            return wb.getResponse();
        }
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(PaprboyLoginActivity.this, s, Toast.LENGTH_SHORT).show();
            if (s.equals("false"))
            {
                Toast.makeText(PaprboyLoginActivity.this,"Failed to Login",Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(PaprboyLoginActivity.this,"Login user id:"+s,Toast.LENGTH_SHORT).show();

                sh=getSharedPreferences(sh_name, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sh.edit();
                editor.putString("id",s);
                editor.commit();
                Intent in=new Intent(PaprboyLoginActivity.this,HomepaperActivity.class);
                startActivity(in);
            }

        }
    }


}
