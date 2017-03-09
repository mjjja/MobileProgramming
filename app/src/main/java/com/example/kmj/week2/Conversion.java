package com.example.kmj.week2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Conversion extends AppCompatActivity {
    EditText et1, et2;
    Button bt1, bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);
        init();
    }

    void init(){
        et1 = (EditText)findViewById(R.id.cels);
        et2 = (EditText)findViewById(R.id.fahr);
        bt1 = (Button)findViewById(R.id.fahrcalc);
        bt2 = (Button)findViewById(R.id.celscalc);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempinput = et1.getText().toString();
                double fahr = Float.parseFloat(tempinput)*1.8 + 32;

                Toast.makeText(getApplicationContext(),"화씨 온도는 "+ fahr + "도 입니다.",Toast.LENGTH_SHORT).show();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempinput = et2.getText().toString();
                double cels = (Float.parseFloat(tempinput)-32)/1.8;

                Toast.makeText(getApplicationContext(),"섭씨 온도는 "+ cels + "도 입니다", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
