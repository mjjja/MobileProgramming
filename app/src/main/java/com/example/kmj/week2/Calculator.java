package com.example.kmj.week2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.kmj.week2.R.id.number1;
import static com.example.kmj.week2.R.id.number2;

public class Calculator extends AppCompatActivity {
    EditText et1,et2;
    Button bt1,bt2,bt3,bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        setTitle("계산기");
        init();
    }

    void init(){
        et1 = (EditText)findViewById(number1);
        et2 = (EditText)findViewById(R.id.number2);
        bt1 = (Button)findViewById(R.id.add);
        bt2 = (Button)findViewById(R.id.subtract);
        bt3 = (Button)findViewById(R.id.multiply);
        bt4 = (Button)findViewById(R.id.divide);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean empty1=false,empty2=false;
                int number1=0,number2=0;
                String n1 = et1.getText().toString();
                if (n1.isEmpty()) {
                    empty1 = true;
                }else{
                    number1 = Integer.parseInt(n1);
                }
                String n2 = et2.getText().toString();
                if (n2.isEmpty()) {
                    empty2 = true;
                }else{
                    number2 = Integer.parseInt(n2);
                }
                boolean empty = (empty1 || empty2);

                if (empty) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    if (empty1) {
                        et1.requestFocus();
                    }else{
                        et2.requestFocus();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "더하기 계산 결과는 " + (number1 + number2) + "입니다", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean empty1=false,empty2=false;
                int number1=0,number2=0;
                String n1 = et1.getText().toString();
                if (n1.isEmpty()) {
                    empty1 = true;
                }else{
                    number1 = Integer.parseInt(n1);
                }
                String n2 = et2.getText().toString();
                if (n2.isEmpty()) {
                    empty2 = true;
                }else{
                    number2 = Integer.parseInt(n2);
                }
                boolean empty = (empty1 || empty2);

                if (empty) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    if (empty1) {
                        et1.requestFocus();
                    }else{
                        et2.requestFocus();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "더하기 계산 결과는 " + (number1 - number2) + "입니다", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean empty1=false,empty2=false;
                int number1=0,number2=0;
                String n1 = et1.getText().toString();
                if (n1.isEmpty()) {
                    empty1 = true;
                }else{
                    number1 = Integer.parseInt(n1);
                }
                String n2 = et2.getText().toString();
                if (n2.isEmpty()) {
                    empty2 = true;
                }else{
                    number2 = Integer.parseInt(n2);
                }
                boolean empty = (empty1 || empty2);

                if (empty) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    if (empty1) {
                        et1.requestFocus();
                    }else{
                        et2.requestFocus();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "더하기 계산 결과는 " + (number1 * number2) + "입니다", Toast.LENGTH_SHORT).show();
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean empty1=false,empty2=false;
                int number1=0,number2=0;
                String n1 = et1.getText().toString();
                if (n1.isEmpty()) {
                    empty1 = true;
                }else{
                    number1 = Integer.parseInt(n1);
                }
                String n2 = et2.getText().toString();
                if (n2.isEmpty()) {
                    empty2 = true;
                }else{
                    number2 = Integer.parseInt(n2);
                }
                boolean empty = (empty1 || empty2);
                double divided = number1/number2;


                if (empty) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    if (empty1) {
                        et1.requestFocus();
                    }else{
                        et2.requestFocus();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "나누기 계산 결과는 " + (int)divided + "입니다", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
