package com.example.anjal.bundledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        tv=(TextView) findViewById(R.id.textView4);

        tv.setText(" ");

        Intent i=getIntent();
        Bundle b=i.getExtras();
        
        String fn= b.getString(MainActivity.FIRST_NAME);
        String ln=b.getString(MainActivity.LAST_NAME);
        tv.setText("Hi "+fn +" " +ln);
    }
}
