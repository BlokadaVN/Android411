package com.example.xo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityOnePlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player);

        EditText playerOneCom = findViewById(R.id.playerOneCom);
        ImageButton imageButtonEasyCom = findViewById(R.id.imageButtonEasyCom);
        ImageButton imageButtonHardCom = findViewById(R.id.imageButtonHardCom);

        imageButtonEasyCom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namePlayer = playerOneCom.getText().toString();

                if (namePlayer.isEmpty()) {
                    Toast.makeText(ActivityOnePlayer.this, "enter player name", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(ActivityOnePlayer.this, ActivityOnePlayerEasy.class);
                    intent.putExtra("p1", namePlayer);
                    startActivity(intent);
                }
            }
        });
    }
}