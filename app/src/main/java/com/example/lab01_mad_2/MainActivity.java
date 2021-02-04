package com.example.lab01_mad_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int counter = 0;

    public void IncrementButton(View v)
    {
        counter ++;
        TextView tv = (TextView) findViewById(R.id.textview);
        tv.setText(Integer.toString(counter));
    }

}