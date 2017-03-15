package com.example.kmj.week2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.checked;

public class Order extends AppCompatActivity {
    EditText et1,et2,et3;
    CheckBox cb1;
    Button bt1;
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        setTitle("레스토랑 메뉴 주문");
        init();
    }

    void init(){
        et1=(EditText)findViewById(R.id.pizzacount);
        et2=(EditText)findViewById(R.id.spaghetticount);
        et3=(EditText)findViewById(R.id.saladcount);
        cb1=(CheckBox)findViewById(R.id.membershipcard);
        bt1=(Button)findViewById(R.id.pricecalc);
        tv1=(TextView)findViewById(R.id.ordercount);
        tv2=(TextView)findViewById(R.id.orderprice);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = cb1.isChecked();
                String pizzacount=et1.getText().toString();
                int pizza=Integer.parseInt(pizzacount);
                String spaghetticount=et2.getText().toString();
                int spaghetti=Integer.parseInt(spaghetticount);
                String saladcount=et3.getText().toString();
                int salad=Integer.parseInt(saladcount);
                int ordercount=pizza+spaghetti+salad;
                int orderprice=pizza*15000+spaghetti*13000+salad*9000;
                if (checked) orderprice*=0.9;

                tv1.setText(ordercount+"개");
                tv2.setText(orderprice+"원");
            }
        });
    }
}
