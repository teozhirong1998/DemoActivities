package com.example.a16022635.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DemoActivities2 extends AppCompatActivity {

    TextView tvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities2);

        //Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();

        //Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");

        //Get the TextView object
        tvInfo = (TextView)findViewById(R.id.textViewInfo);

        // Display the name & age on the TextView
        tvInfo.setText("You are " + info[0] + ", age " + info[1]);
    }
}
