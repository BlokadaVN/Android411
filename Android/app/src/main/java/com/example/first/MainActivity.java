package com.example.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Создаем переменную.
//    private TextView textSm;
//    private Button secondBtn;

    private TextView text;
    private Button buttonOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        setContentView(R.layout.first_layout);
//        setContentView(R.layout.second_layout);
//        setContentView(R.layout.dz_android_1);
//        setContentView(R.layout.linear_layout_2);
//        setContentView(R.layout.table_layout);
//        setContentView(R.layout.frame_layout);
//        setContentView(R.layout.scroll_view);
//        setContentView(R.layout.button_panel);
//        setContentView(R.layout.third_layout);
        setContentView(R.layout.android_dz3_nenashev);

//        // Получаем доступ к элементу
//        textSm = findViewById(R.id.textSample);
//        secondBtn = findViewById(R.id.secondBt);
//
//        secondBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textSm.setText("Новое приветствие!");
//                textSm.setTextSize(40);
//            }
//        });

        text = findViewById(R.id.textView1);
        buttonOne = findViewById(R.id.button1);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("Hello Java!");
                text.setTextSize(20);
            }
        });
        text = findViewById(R.id.textView2);
        buttonOne = findViewById(R.id.button2);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("Hello Android!");
                text.setTextSize(20);
            }
        });
    }

//    // Метод для вызова private TextView textSm;
//    public void sayHello(View view) {
//        textSm.setText("Привет!");
//    }
}