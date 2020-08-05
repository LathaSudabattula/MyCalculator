package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1, t2;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bac, bb, bp, bm, bd, bx, bdo, be;
    double n1, n2, res;
    char op = '\0';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        t1 = findViewById(R.id.tv1);
        t2 = findViewById(R.id.tv2);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        be = findViewById(R.id.be);
        bp = findViewById(R.id.bp);
        bm = findViewById(R.id.bm);
        bd = findViewById(R.id.bd);
        bx = findViewById(R.id.bx);
        bdo = findViewById(R.id.bdo);
        bac = findViewById(R.id.bac);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText((t2.getText()) + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText((t2.getText()) + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText((t2.getText()) + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText((t2.getText()) + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText((t2.getText()) + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText((t2.getText()) + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText((t2.getText()) + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText((t2.getText()) + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText((t2.getText()) + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText((t2.getText()) + "0");
            }
        });
        bdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText((t2.getText()) + ".");
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                op = '+';
                n1 = Double.parseDouble(t2.getText().toString());
                t1.setText(t2.getText() + " + ");
                t2.setText("");


            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                op = '-';
                n1 = Double.parseDouble(t2.getText().toString());
                t1.setText(t2.getText() + " - ");
                t2.setText("");
            }
        });
        bx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                        op = '*';
                        n1 = Double.parseDouble(t2.getText().toString());
                        t1.setText(t2.getText() + " X ");
                        t2.setText("");
                    }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                        op = '/';
                        n1 = Double.parseDouble(t2.getText().toString());
                        t1.setText(t2.getText() + " / ");
                        t2.setText("");
                    }

        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    n2 = Double.parseDouble(t2.getText().toString());
                    t1.setText(t1.getText() + " " + t2.getText());
                    if (op == '+') {
                        res = n1 + n2;
                    } else if (op == '-') {
                        res = n1 - n2;
                    } else if (op == '*') {
                        res = n1 * n2;
                    } else {
                        res = n1 / n2;
                    }
                    t2.setText("" + res);
                }

        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("");
                t2.setText("");
                op = '\0';

            }
        });

    }
}
