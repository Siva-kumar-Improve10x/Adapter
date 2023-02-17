package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ChooseButtonActivity extends AppCompatActivity {

    Button luckyBtn;
    Button locationBtn;
    Button dobBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_button);
        handleinitViews();
        handleLuckyBtn();
        handleLoctionBtn();
        handleDobBtn();
    }

    private void handleDobBtn() {
        dobBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this,SelectDob_Activity.class);
            startActivity(intent);
        });
    }

    private void handleLoctionBtn() {
        locationBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this,LocationActivity.class);
            startActivity(intent);
        });
    }

    private void handleLuckyBtn() {
        luckyBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this,LuckyNumberActivity.class);
            startActivity(intent);
        });
    }

    private void handleinitViews() {
        luckyBtn = findViewById(R.id.lucky_btn);
        locationBtn = findViewById(R.id.location_btn);
        dobBtn = findViewById(R.id.dob_btn);
    }
}