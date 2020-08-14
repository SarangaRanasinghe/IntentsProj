package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText number3,number4;
    String string1,string2;
    Button plus,minus,multiply,divide;
    TextView textView;
    int Num1,Num2;
    String oper;
    float result;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        number3 = findViewById(R.id.n1idp2);
        number4 = findViewById(R.id.n2idp2);

        plus=findViewById(R.id.button2);
        minus=findViewById(R.id.button3);
        multiply=findViewById(R.id.button4);
        divide=findViewById(R.id.button);
        textView = findViewById(R.id.textView4);

        string1=(getIntent().getStringExtra("N1"));
        string2=(getIntent().getStringExtra("N2"));

        number3.setText(string1);
        number4.setText(string2);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Num1 = Integer.parseInt(number3.getText().toString());
                Num2 = Integer.parseInt(number4.getText().toString());
                oper = "+";
                result = Num1+Num2;
                textView.setText(number3.getText().toString()+ " " + oper +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }

        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Num1 = Integer.parseInt(number3.getText().toString());
                Num2 = Integer.parseInt(number4.getText().toString());
                oper = "-";
                result = Num1-Num2;
                textView.setText(number3.getText().toString()+ " " + oper +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }

        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Num1 = Integer.parseInt(number3.getText().toString());
                Num2 = Integer.parseInt(number4.getText().toString());
                oper = "*";
                result = Num1*Num2;
                textView.setText(number3.getText().toString()+ " " + oper +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }

        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Num1 = Integer.parseInt(number3.getText().toString());
                Num2 = Integer.parseInt(number4.getText().toString());
                oper = "/";
                result = Num1/Num2;
                textView.setText(number3.getText().toString()+ " " + oper +" " +number4.getText().toString() +" = "+String.valueOf(result));
            }

        });

    }
}