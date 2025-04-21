package com.example.xo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityTwoPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);

        EditText playerOne = findViewById(R.id.playerOne);
        EditText playerTwo = findViewById(R.id.playerTwo);
        ImageButton imageButtonEasy = findViewById(R.id.imageButtonEasy);
        ImageButton imageButtonHard = findViewById(R.id.imageButtonHard);

        imageButtonEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getPlayerOneName = playerOne.getText().toString();
                String getPlayerNameTwo = playerTwo.getText().toString();

                if (getPlayerOneName.isEmpty() || getPlayerNameTwo.isEmpty()) {
                    Toast.makeText(ActivityTwoPlayer.this, "Enter name player", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(ActivityTwoPlayer.this, ActivityTwoPlayerEasy.class);
                    intent.putExtra("p1", getPlayerOneName);
                    intent.putExtra("p2", getPlayerNameTwo);
                    startActivity(intent);
                }
            }
        });

        imageButtonHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getPlayerOneName = playerOne.getText().toString();
                String getPlayerNameTwo = playerTwo.getText().toString();

                if (getPlayerOneName.isEmpty() || getPlayerNameTwo.isEmpty()) {
                    Toast.makeText(ActivityTwoPlayer.this, "Enter name player", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(ActivityTwoPlayer.this, ActivityTwoPlayerHard.class);
                    intent.putExtra("p1", getPlayerOneName);
                    intent.putExtra("p2", getPlayerNameTwo);
                    startActivity(intent);
                }
            }
        });
    }
}