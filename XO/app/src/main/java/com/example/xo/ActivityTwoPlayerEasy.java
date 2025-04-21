package com.example.xo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityTwoPlayerEasy extends AppCompatActivity {

    private int activePlayer = 1;
    private int[] boxPosition = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    private int totalSelectBoxes = 1;
    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player_easy);

        TextView playerOneName = findViewById(R.id.playerOneName);
        TextView playerTwoName = findViewById(R.id.playerTwoName);
        String getP1 = getIntent().getStringExtra("p1");
        String getP2 = getIntent().getStringExtra("p2");
        playerOneName.setText(getP1);
        playerTwoName.setText(getP2);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
    }
}