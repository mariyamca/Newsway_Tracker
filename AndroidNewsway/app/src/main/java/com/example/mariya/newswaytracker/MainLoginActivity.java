package com.example.mariya.newswaytracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainLoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==b1) {
            Intent intent=new Intent(MainLoginActivity.this,LoginActivity.class);
            startActivity(intent);
        }
        else {
            Intent i=new Intent(this,PaprboyLoginActivity.class);
            startActivity(i);
        }
    }
}
