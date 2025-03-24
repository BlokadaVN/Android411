package com.example.first;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView mainText = findViewById(R.id.mainText);
        Button btnSecond = findViewById(R.id.buttonSecond);

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfo(mainText.getText().toString()); // Вызов ПопАп для средней кнопки.
            }
        });
    }

    // Метод для первой и третьей кнопки.

    public void btnClick(View view) {
        showInfo(((Button) view).getText().toString());
    }

    // Метод для всплывающего окна Toast

    private void showInfo(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
