package com.example.xo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class ActivityOnePlayerEasy extends AppCompatActivity {

    private final List<int[]> combinationList = new ArrayList<>();
    private TextView playerOneNameComp;
    private int activePlayer = 1;
    private int[] boxPosition = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player_easy);
        playerOneNameComp = findViewById(R.id.playerOneNameComp);
        String getP1 = getIntent().getStringExtra("p1");
        playerOneNameComp.setText(getP1);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);

        image1.setOnClickListener(view -> {
            if (isBoxSelectTable(0)) {
                gameLogic((ImageView) view, 0);
            }
        });
        image2.setOnClickListener(view -> {
            if (isBoxSelectTable(1)) {
                gameLogic((ImageView) view, 1);
            }
        });
        image3.setOnClickListener(view -> {
            if (isBoxSelectTable(2)) {
                gameLogic((ImageView) view, 2);
            }
        });
        image4.setOnClickListener(view -> {
            if (isBoxSelectTable(3)) {
                gameLogic((ImageView) view, 3);
            }
        });
        image5.setOnClickListener(view -> {
            if (isBoxSelectTable(4)) {
                gameLogic((ImageView) view, 4);
            }
        });
        image6.setOnClickListener(view -> {
            if (isBoxSelectTable(5)) {
                gameLogic((ImageView) view, 5);
            }
        });
        image7.setOnClickListener(view -> {
            if (isBoxSelectTable(6)) {
                gameLogic((ImageView) view, 6);
            }
        });
        image8.setOnClickListener(view -> {
            if (isBoxSelectTable(7)) {
                gameLogic((ImageView) view, 7);
            }
        });
        image9.setOnClickListener(view -> {
            if (isBoxSelectTable(8)) {
                gameLogic((ImageView) view, 8);
            }
        });

        combinationList.add(new int[]{0, 1, 2});
        combinationList.add(new int[]{3, 4, 5});
        combinationList.add(new int[]{6, 7, 8});
        combinationList.add(new int[]{0, 3, 6});
        combinationList.add(new int[]{1, 4, 7});
        combinationList.add(new int[]{2, 5, 8});
        combinationList.add(new int[]{0, 4, 8});
        combinationList.add(new int[]{2, 4, 6});

    }

    private void gameLogic(ImageView imageView, int selectBoxPosition){
        boxPosition[selectBoxPosition]= activePlayer;
    }
    private boolean isBoxSelectTable(int boxPositions) {
        boolean response = false;
        if (boxPosition[boxPositions] == 0) {
            response = true;
        }
        return response;
    }
}