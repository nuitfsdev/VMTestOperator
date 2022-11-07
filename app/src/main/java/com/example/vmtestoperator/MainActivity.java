package com.example.vmtestoperator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.vmtestoperator.Utils;


public class MainActivity extends AppCompatActivity {

    /*static {
        System.loadLibrary("vmtest3");
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.show);


        Button operator = (Button) findViewById(R.id.operator);
        operator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.isOperatorNameAndroid(textView, getApplicationContext());
            }
        });
    }
}
