package com.example.first;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
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
//                showInfo(mainText.getText().toString(), btnSecond); // Вызов ПопАп для средней кнопки.
                showInfoAlert("Вы хотите закрыть приложение?"); // Вызов окна с подсказкой.
            }
        });
    }

    // Метод для первой и третьей кнопки.

    public void btnClick(View view) {
        showInfo(((Button) view).getText().toString(), (Button) view);

    }

    // Метод для всплывающей подсказки Toast

    private void showInfo(String text, Button btn) {
        btn.setText("Уже нажали.");
        btn.setBackgroundTintList(ColorStateList.valueOf(Color.LTGRAY)); // После нажатия меняется фон кнопки.
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    // Метод всплывающего окна.

    private void showInfoAlert(String text) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity3.this);
        builder.setTitle("Заголовок окна.")
                .setMessage(text)
                .setCancelable(false)
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                }); // Закрытие окна.

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
