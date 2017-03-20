package com.example.anjal.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b= (Button) findViewById(R.id.button2);
        TextView tv= (TextView)  findViewById(R.id.textView2);
        b.setAllCaps(false);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i= new Intent(this, NextPage.class);
        startActivity(i);
    }
}
