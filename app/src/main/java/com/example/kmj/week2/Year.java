package com.example.kmj.week2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Year extends AppCompatActivity {
    EditText et1,et2;
    Button bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);
        init();
    }

    void init(){
        et1 = (EditText)findViewById(R.id.yeartext);
        et2 = (EditText)findViewById(R.id.agetext);
        bt1 = (Button)findViewById(R.id.agecalc);
        bt2 = (Button)findViewById(R.id.yearcalc);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ageinput = et1.getText().toString();
                int age = 2017 - Integer.parseInt(ageinput) +1;

                Toast.makeText(getApplicationContext(),"당신의 나이는 "+ age + "세입니다",Toast.LENGTH_SHORT).show();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yearinput = et2.getText().toString();
                int year = 2017 - Integer.parseInt(yearinput) +1;

                Toast.makeText(getApplicationContext(),"당신의 태어난 해는 "+ year + "년입니다",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
