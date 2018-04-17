package com.example.a16022635.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvAge;
    EditText etName;
    EditText etAge;
    Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the EditText that user keys in name
        etName = (EditText) findViewById(R.id.editTextName);

        //Get the EditText that user keys in age
        etAge = (EditText) findViewById(R.id.editTextAge);

        // Get the button and set the OnClickListener
        btnDone = (Button) findViewById(R.id.buttonDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Put the name and age into an array
                String[] info = {etName.getText().toString(), etAge.getText().toString()};

                // Create an intent to start another activity called DemoActivities (which we would create later)
                Intent i = new Intent(MainActivity.this, DemoActivities2.class);

                // Pass the String array holding the name & age to new activity
                i.putExtra("info", info);

                // Start the new activity
                startActivity(i);
            }
        });
    }
}
