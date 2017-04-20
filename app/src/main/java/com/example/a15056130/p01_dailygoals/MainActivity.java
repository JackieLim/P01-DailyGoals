package com.example.a15056130.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button btn = (Button) findViewById(R.id.buttonOk);
    RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
    RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
    RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);
    EditText et = (EditText) findViewById(R.id.editText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get the id of selected radio button in radio group
                int selectedButton1 = rg1.getCheckedRadioButtonId();
                int selectedButton2 = rg2.getCheckedRadioButtonId();
                int selectedButton3 = rg3.getCheckedRadioButtonId();


                RadioButton rb1 = (RadioButton) findViewById(selectedButton1);
                RadioButton rb2 = (RadioButton) findViewById(selectedButton2);
                RadioButton rb3 = (RadioButton) findViewById(selectedButton3);

                String etText = et.getText().toString();
                Intent i = new Intent(MainActivity.this,
                        Summary.class);

                i.putExtra("text", etText);
                i.putExtra("rb01", rb1.getText());
                i.putExtra("rb02", rb2.getText());
                i.putExtra("rb03", rb3.getText());

                startActivity(i);


            }
        });




    }
}
