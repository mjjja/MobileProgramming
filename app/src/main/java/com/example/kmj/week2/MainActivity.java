package com.example.kmj.week2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Year,Conversion,Order,Calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Year = (Button)findViewById(R.id.year);
        Conversion = (Button)findViewById(R.id.conversion);
        Order = (Button)findViewById(R.id.order);
        Calculator = (Button)findViewById(R.id.calculator);

        Year.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Year.class);
                startActivity(intent);
            }
        }
        );
        Conversion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Conversion.class);
                startActivity(intent);
            }
        }
        );
        Order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Order.class);
                startActivity(intent);
            }
        }
        );
        Calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Calculator.class);
                startActivity(intent);
            }
        }
        );
    }
}
