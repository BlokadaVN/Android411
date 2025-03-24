package com.example.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView result;
    private EditText num1, num2;
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        result = findViewById(R.id.result);
        num1 = findViewById(R.id.editNumber1);
        num2 = findViewById(R.id.editNumber2);
        button = findViewById(R.id.calcSum);
        button1 = findViewById(R.id.calcMin);
        button2 = findViewById(R.id.calcUmn);
        button3 = findViewById(R.id.calcDel);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float number1 = Float.parseFloat(num1.getText().toString()); // Перевод строки в число.
                Float number2 = Float.parseFloat(num2.getText().toString()); // Перевод строки в число.
                result.setText("Result: " + number1 + " + " + number2 + " = " + String.valueOf(number1 + number2)); // Перевод числа в строку.
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float number1 = Float.parseFloat(num1.getText().toString());
                Float number2 = Float.parseFloat(num2.getText().toString());
                result.setText("Result: " + number1 + " - " + number2 + " = " + String.valueOf(number1 - number2));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float number1 = Float.parseFloat(num1.getText().toString());
                Float number2 = Float.parseFloat(num2.getText().toString());
                result.setText("Result: " + number1 + " * " + number2 + " = " + String.valueOf(number1 * number2));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float number1 = Float.parseFloat(num1.getText().toString());
                Float number2 = Float.parseFloat(num2.getText().toString());
                result.setText("Result: " + number1 + " / " + number2 + " = " + String.valueOf(number1 / number2));
            }
        });
    }
}