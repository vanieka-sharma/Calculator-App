package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button divide;
    private Button multiply;
    private Button zero;
    private Button clear;
    private Button equal;
    private TextView info;
    private TextView result;
    private final char ADD = '+';
    private final char SUB = '-';
    private final char MULTIPLY = '*';
    private final char DIVIDE = '%';
    private final char EQU = 0;
    private double val1;
    private double val2;
    private char ACTION;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               compute();
               ACTION = ADD;
               result.setText(String.valueOf(val1) + "+") ;
               info.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = SUB;
                result.setText(String.valueOf(val1) + "-") ;
                info.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = MULTIPLY;
                result.setText(String.valueOf(val1) + "*") ;
                info.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = DIVIDE;
                result.setText(String.valueOf(val1) + "%") ;
                info.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = EQU;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1)) ;
                info.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(info.getText().length() > 0){
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length()-1));
                }
                else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });




    }
    private void setupUIViews(){
        one = (Button)findViewById(R.id.b1);
        two = (Button)findViewById(R.id.b2);
        three = (Button)findViewById(R.id.b3);
        four = (Button)findViewById(R.id.b4);
        five = (Button)findViewById(R.id.b5);
        six = (Button)findViewById(R.id.b6);
        seven = (Button)findViewById(R.id.b7);
        eight = (Button)findViewById(R.id.b8);
        nine = (Button)findViewById(R.id.b9);
        zero = (Button)findViewById(R.id.b0);
        add = (Button)findViewById(R.id.badd);
        sub = (Button)findViewById(R.id.bsub);
        multiply = (Button)findViewById(R.id.bmultiply);
        divide = (Button)findViewById(R.id.bdivide);
        one = (Button)findViewById(R.id.b1);
        equal = (Button)findViewById(R.id.bequal);
        clear = (Button)findViewById(R.id.bclear);
        info = (TextView) findViewById(R.id.tvControl);
        result = (TextView) findViewById(R.id.tvDisplay);
    }

    private void compute(){
        if(!Double.isNaN(val1)){
         val2 = Double.parseDouble(info.getText().toString());

         switch(ACTION){
             case ADD:
                 val1 = val1 + val2;
                 break;
             case SUB:
                 val1 = val1 - val2;
                 break;
             case MULTIPLY:
                 val1 = val1 * val2;
                 break;
             case DIVIDE:
                 val1 = val1 % val2;
                 break;
             case EQU:
                 break;
         }
        }
        else{
            val1 = Double.parseDouble(info.getText().toString());
        }
    }
}