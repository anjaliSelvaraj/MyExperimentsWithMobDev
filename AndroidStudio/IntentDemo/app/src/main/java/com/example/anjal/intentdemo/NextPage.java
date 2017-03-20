package com.example.anjal.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NextPage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);

        Button b= (Button)findViewById(R.id.button);
        TextView tv= (TextView)findViewById(R.id.textView);
        b.setOnClickListener(this);
        b.setAllCaps(false);
    }

    @Override
    public void onClick(View v) {
        Intent i= new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
