package com.improve10x.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SelectDob_Activity extends AppCompatActivity {
    ArrayAdapter adapterDate;
    ArrayAdapter adapterMonth;
    ArrayAdapter adapterYear;
    public String[] date = {"Date","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
    public String[]  month = {"Months","January","February","March","April","May","June","July","August","September","October","November","December"};
    public  String[] year = {"Year","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023"};
Spinner dateSp;
Spinner monthSp;
Spinner yearSp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_dob);
        initViews();
        SetUpAdapter();
        connectAdapter();


    }

    private void connectAdapter() {
        dateSp.setAdapter(adapterDate);
        monthSp.setAdapter(adapterMonth);
        yearSp.setAdapter(adapterYear);
    }

    private void SetUpAdapter() {
         adapterDate = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,date);
         adapterMonth = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,month);
         adapterYear = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,year);
    }

    private void initViews() {
        dateSp = findViewById(R.id.date_sp);
        monthSp = findViewById(R.id.month_sp);
        yearSp = findViewById(R.id.year_sp);

    }
}