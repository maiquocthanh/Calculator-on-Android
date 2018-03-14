package com.hung.calculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private TextView txtResult;
    private Button btnNumber1, btnNumber2, btnNumber3, btnNumber4, btnNumber5, btnNumber6, btnNumber7, btnNumber8, btnNumber9, btnNumber0, btnAdd, btnSub, btnMulti, btnDiv, btnC, btnEqual;
    float result;
    int number1, number2;
    boolean add, sub, multi, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatorlayout);
        txtResult = (TextView) findViewById(R.id.tv);
        btnNumber1 = (Button) findViewById(R.id.btnnumber1);
        btnNumber2 = (Button) findViewById(R.id.btnnumber2);
        btnNumber3 = (Button) findViewById(R.id.btnnumber3);
        btnNumber4 = (Button) findViewById(R.id.btnnumber4);
        btnNumber5 = (Button) findViewById(R.id.btnnumber5);
        btnNumber6 = (Button) findViewById(R.id.btnnumber6);
        btnNumber7 = (Button) findViewById(R.id.btnnumber7);
        btnNumber8 = (Button) findViewById(R.id.btnnumber8);
        btnNumber9 = (Button) findViewById(R.id.btnnumber9);
        btnNumber0 = (Button) findViewById(R.id.btnnumber0);
        btnAdd = (Button) findViewById(R.id.btnadd);
        btnSub = (Button) findViewById(R.id.btnsub);
        btnMulti = (Button) findViewById(R.id.btnmulti);
        btnDiv = (Button) findViewById(R.id.btndiv);
        btnEqual = (Button) findViewById(R.id.btnequal);
        btnC = (Button) findViewById(R.id.btnc);

        btnNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "1");

            }
        });
        btnNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "2");

            }
        });
        btnNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "3");

            }
        });
        btnNumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "4");

            }
        });
        btnNumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "5");

            }
        });
        btnNumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "6");

            }
        });
        btnNumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "7");

            }
        });
        btnNumber8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "8");

            }
        });
        btnNumber9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "9");

            }
        });
        btnNumber0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(txtResult.getText() + "0");

            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("");

            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(txtResult.getText().toString());
                add = true;
                txtResult.setText(null);


            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(txtResult.getText().toString());
                sub = true;
                txtResult.setText(null);


            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(txtResult.getText().toString());
                multi = true;
                txtResult.setText(null);


            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = Integer.parseInt(txtResult.getText().toString());
                div = true;
                txtResult.setText(null);


            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                DecimalFormat df = new DecimalFormat("0.####");
                number2 = Integer.parseInt(txtResult.getText().toString());
                if (add) {
                    result = number1 + number2;
                    txtResult.setText(String.valueOf(df.format(result)));
                    add = false;

                }
                if (sub) {
                    result = number1 - number2;

                    txtResult.setText(String.valueOf(df.format(result)));
                    sub = false;
                }
                if (multi) {
                    result = number1 * number2;
                    txtResult.setText(String.valueOf(df.format(result)));
                    multi = false;
                }

                try {
                    if (div) {
                        result = (float) number1 / (float) number2;
                        txtResult.setText(String.valueOf(df.format(result)));
                        div = false;

                    }
                } catch (Exception e) {
                    Log.d("Calc", e.getMessage());
                }

            }

        });

    }
}
