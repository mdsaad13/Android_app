package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt_result;
    EditText    ed_Text1, ed_Text2;
    Button btn_add, btn_sub, btn_mul, btn_div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Ui Initializing */
        txt_result = (TextView) findViewById(R.id.result);
        ed_Text1 = (EditText) findViewById(R.id.ed_text1);
        ed_Text2 = (EditText) findViewById(R.id.ed_text2);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_div = (Button) findViewById(R.id.btn_div);

/*Extracting the text from EditText and Assigning to variable and Click actions for Buttons*/
        btn_add.setOnClickListener(v ->{
            int a = Integer.parseInt(ed_Text1.getText().toString());
            int b = Integer.parseInt(ed_Text2.getText().toString());
            String r = "Result = " + add(a,b);
            txt_result.setText(r);
        });
        btn_sub.setOnClickListener(v -> {
            int a = Integer.parseInt(ed_Text1.getText().toString());
            int b = Integer.parseInt(ed_Text2.getText().toString());
            String r = "Result = " + sub(a,b);
            txt_result.setText(r);
        });

        btn_mul.setOnClickListener(v ->{
            int a = Integer.parseInt(ed_Text1.getText().toString());
            int b = Integer.parseInt(ed_Text2.getText().toString());
            String r = "Result = " + mul(a,b);
            txt_result.setText(r);
        });
        btn_div.setOnClickListener(v -> {
            int a = Integer.parseInt(ed_Text1.getText().toString());
            int b = Integer.parseInt(ed_Text2.getText().toString());
            String r = "Result = " + div(a,b);
            txt_result.setText(r);
        });
    }
    /* add and sub Functions */
    private int add(int a, int b){
        return a + b;
    }
    private int sub(int a,int b){
        return a - b;
    }
    private int mul(int a,int b){
        return a * b;
    }
    private int div(int a,int b){
        return a / b;
    }
}