package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class LocationActivity extends AppCompatActivity {
    public String[] location = {"States","Arunachal Pradesh","Assam","Bihar","Chattisgarh"};
    Spinner locationSp;
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        handleInitViews();
        setAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        locationSp.setAdapter(adapter);

    }

    private void setAdapter() {
         adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,location);
    }

    private void handleInitViews() {
        locationSp = findViewById(R.id.location_sp);
    }
}