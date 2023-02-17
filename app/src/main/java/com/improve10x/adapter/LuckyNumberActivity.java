package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class LuckyNumberActivity extends AppCompatActivity {

    public  String[] number = {"Start","1","2","3","4","5","6","7","8","9","10"};
    Spinner luckyNumberSp;
    Button submitLuckyNumBtn;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);
        initViews();
        setAdapter();
        connectAdapter();
        handleSubmitBtn();

    }

    private void handleSubmitBtn() {
        submitLuckyNumBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Ok Ok", Toast.LENGTH_SHORT).show();

        });
    }

    private void connectAdapter() {
        luckyNumberSp.setAdapter(adapter);

    }

    private void setAdapter() {
        adapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,number);
    }

    private void initViews() {
        luckyNumberSp = findViewById(R.id.luckynumbersp);
        submitLuckyNumBtn = findViewById(R.id.submitluckynum_btn);
    }





}
