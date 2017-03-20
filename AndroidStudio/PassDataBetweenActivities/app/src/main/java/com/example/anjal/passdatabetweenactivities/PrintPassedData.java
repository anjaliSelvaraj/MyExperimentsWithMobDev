package com.example.anjal.passdatabetweenactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.anjal.passdatabetweenactivities.MainActivity.DATA_DEMO;

public class PrintPassedData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_passed_data);
        TextView tv=(TextView)findViewById(R.id.textView);
        Intent i =getIntent();
        String data= i.getStringExtra(MainActivity.DATA_DEMO);
        tv.setText(data);
    }
}
