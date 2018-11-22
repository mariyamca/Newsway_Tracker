package com.example.mariya.newswaytracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button home, vie, edi, ch, prod,viewlist,track,comp,notify,adv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        home = findViewById(R.id.hmbtn);
        vie = findViewById(R.id.viiewbtn);
        edi = findViewById(R.id.editbtn);
        ch = findViewById(R.id.ch1btn);
        prod = findViewById(R.id.prdtbtn);
        track=findViewById(R.id.btn_tarck);
        viewlist=findViewById(R.id.btn_viewlist);
        comp=findViewById(R.id.btn_comp);
        notify=findViewById(R.id.btn_notify);
        adv=findViewById(R.id.btn_adv);
        adv.setOnClickListener(this);
        notify.setOnClickListener(this);
        comp.setOnClickListener(this);
        track.setOnClickListener(this);
        prod.setOnClickListener(this);
        viewlist.setOnClickListener(this);
        home.setOnClickListener(this);
        vie.setOnClickListener(this);
        edi.setOnClickListener(this);
        ch.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == home) {
            Intent i = new Intent(HomeActivity.this, HomeActivity.class);
            startActivity(i);
        } else if (view == vie) {
            Intent i = new Intent(HomeActivity.this, ViewActivity.class);
            startActivity(i);
        } else if (view == edi) {
            Intent i = new Intent(HomeActivity.this, EditActivity.class);
            startActivity(i);

        } else if (view == ch) {
            Intent i = new Intent(HomeActivity.this, PasswordActivity.class);
            startActivity(i);

        }
        else if (view == viewlist) {
            Intent i = new Intent(HomeActivity.this, ViewBookActivity.class);
            startActivity(i);
        }
        else if (view == track) {
            Intent i = new Intent(HomeActivity.this, TrackviewActivity.class);
            startActivity(i);
        }
        else if (view == comp) {
            Intent i = new Intent(HomeActivity.this, ComplaintActivity.class);
            startActivity(i);
        }
        else if (view == notify) {
            Intent i = new Intent(HomeActivity.this, ViewcustNotify.class);
            startActivity(i);
        }
        else if (view == adv) {
            Intent i = new Intent(HomeActivity.this, AdvertiseActivity.class);
            startActivity(i);
        }
        else {
            Intent i = new Intent(HomeActivity.this, ProductplanActivity.class);
            startActivity(i);
        }

    }
}
