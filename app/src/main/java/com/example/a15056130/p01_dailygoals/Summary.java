package com.example.a15056130.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {
    TextView tvSummary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);



        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String text = i.getStringExtra("text");
        String rb01 = i.getStringExtra("rb01");
        String rb02 = i.getStringExtra("rb02");
        String rb03 = i.getStringExtra("rb03");
        // Get the TextView object
        

        // Display the name and age on the TextView
        tvSummary.setText("" + rb01+"\n"+ text +"\n"+ rb02 + "\n"+ rb03);
    }

}
