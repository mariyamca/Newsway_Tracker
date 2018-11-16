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

public class PasswordActivity extends AppCompatActivity implements View.OnClickListener {
    EditText  curentpass,newpass, cnpsw;
    Button B1,B2;
    SharedPreferences sh;
    String sh_name = "My Data";
    String Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        curentpass=findViewById(R.id.curtpassEditText);
        newpass=findViewById(R.id.newpassEditText);
        cnpsw=findViewById(R.id.cnfpassEditText);
        B1=findViewById(R.id.subButton);
        B1.setOnClickListener(this);
        sh = getSharedPreferences(sh_name, Context.MODE_PRIVATE);
        Id = sh.getString("id", "");
    }

    @Override
    public void onClick(View view) {
       String curp = curentpass.getText().toString();
       String newp = newpass.getText().toString();
       String cnfp=cnpsw.getText().toString();
        if (newp.equals(cnfp))
       {

        changedata ch=new changedata();
        ch.execute(Id,curp,newp);
       }
        else {
            Toast.makeText(this, "confirm password not same", Toast.LENGTH_SHORT).show();
        }

    }
    private class changedata extends AsyncTask<String, String, String> {


        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb = new WebServiceCaller();
            wb.setSoapObject("changeoperation");
            wb.addProperty("Id", strings[0]);
            wb.addProperty("currentpass", strings[1]);
            wb.addProperty("newpass", strings[2]);
            wb.callWebService();
            return wb.getResponse();

        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(PasswordActivity.this, s, Toast.LENGTH_SHORT).show();
            if (s.equals("success")) {
                Intent intent = new Intent(PasswordActivity.this, LoginActivity.class);
                sh=getSharedPreferences(sh_name,MODE_PRIVATE);

                startActivity(intent);
        }
        else {
                Toast.makeText(PasswordActivity.this, "Incorrect Current Password", Toast.LENGTH_SHORT).show();
            }
    }

    }

}
