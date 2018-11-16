package com.example.mariya.newswaytracker;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ComplaintActivity extends AppCompatActivity implements View.OnClickListener {
    EditText com;
    Button sub,can;
    String Comp;
    String sh_name = "My Data";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);
        com=findViewById(R.id.complainttxt);
        sub=findViewById(R.id.subButton);
        can=findViewById(R.id.canButton) ;
        can.setOnClickListener(this);
        sub.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Comp=com.getText().toString();
        if(view==sub)
        {
            if(Comp.equals(""))
            {
                com.setError("Enter your complaints");
            }
            else{

                SharedPreferences sh = getSharedPreferences(sh_name, MODE_PRIVATE);
                String  id1 = sh.getString("id", " ");

                insertdata id=new insertdata();


                id.execute(Comp,id1);
            }
        }
        else if(view==can){
            com.setText("");

        }
    }
    private class insertdata extends AsyncTask<String,String,String> {

        @Override
        protected String doInBackground(String... strings) {
            WebServiceCaller wb=new WebServiceCaller();
            wb.setSoapObject("CustComplaints");
            wb.addProperty("com", strings[0]);
            wb.addProperty("custid",strings[1]);

            wb.callWebService();
            return wb.getResponse();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Toast.makeText(ComplaintActivity.this,s,Toast.LENGTH_SHORT).show();
        }
    }
}

