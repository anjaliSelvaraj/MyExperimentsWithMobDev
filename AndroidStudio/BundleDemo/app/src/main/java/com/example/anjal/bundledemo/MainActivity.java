package com.example.anjal.bundledemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static final String FIRST_NAME = "com.example.anjal.bundledemo.firstname" ;
    static final String LAST_NAME = "com.example.anjal.bundledemo.lastname" ;
    Button b;
    EditText e1, e2;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.button);
        e1=(EditText) findViewById(R.id.editText2);
        e2= (EditText)findViewById(R.id.editText);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(this,DisplayActivity.class);

        Bundle b=new Bundle();
        b.putString(FIRST_NAME,e1.getText().toString());
        b.putString(LAST_NAME,e2.getText().toString());

        i.putExtras(b); //Rather than putExtra(), putExtras() is used to attach the bundle to the intent.
        startActivity(i);
    }
}
