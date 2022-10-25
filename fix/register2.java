package com.example.fix;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class register2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Registrasi Kelas PBP C");
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String name = intent.getStringExtra( "NAME");
        String place = intent.getStringExtra("PLACE");
        String date =  intent.getStringExtra( "DATE");
        TextView nhasil = findViewById(R.id.hasil);
        nhasil.setText("Nama: " +name+ "\nTempat Lahir: " +place+ "\nTanggal Lahir: " +date);
    }
}