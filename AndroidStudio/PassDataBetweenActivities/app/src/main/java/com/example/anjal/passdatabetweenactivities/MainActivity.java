    package com.example.anjal.passdatabetweenactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        static String DATA_DEMO = "com.example.anjal.passbetweenactivities.DATA" ;
        //DATA_DEMO should be a unique key.
        EditText e;

        @Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b= (Button)findViewById(R.id.button);
            e= (EditText) findViewById(R.id.editText);

        b.setAllCaps(false);
        b.setOnClickListener(this);

    }
    @Override
    protected  void onStart()
    {
        super.onStart();
        e.setText(" ");

    }

        @Override
        public void onClick(View v) {
            Intent i=new Intent(this, PrintPassedData.class);

            String data=e.getText().toString();
            //An Intent can carry data types as key-value pairs called extras.
            // Your key is a public constant EXTRA_MESSAGE because the next activity uses the key to retrieve the text value.
            i.putExtra(DATA_DEMO,data);
            startActivity(i);
        }
    }
