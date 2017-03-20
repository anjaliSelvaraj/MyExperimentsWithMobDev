package com.example.anjal.singleactivitydemo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);
        b.setAllCaps(false); // By default, text in android buttons are all in uppercase. This statement set it to false
        b.setOnClickListener(this);

        /*b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv= (TextView) findViewById(R.id.textview);
                tv.setText("");
            }
        });*/
    }
    public void onClick(View v) {
        TextView tv= (TextView) findViewById(R.id.textview);
        tv.setText(" ");
    }
}
