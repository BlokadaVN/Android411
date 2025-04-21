package com.example.xo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class ActivityTwoPlayerHard extends AppCompatActivity {

    private int scoreOne = 0;
    private int scoreTwo = 0;
    private final List<int[]> combinationList = new ArrayList<>();
    private int totalSelectBoxes = 1;
    private int activePlayer = 1;
    private TextView playerOneNameHard;
    private TextView playerTwoNameHard;
    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12, image13, image14, image15, image16;
    private int[] boxPosition = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player_hard);

        playerOneNameHard = findViewById(R.id.playerOneNameHard);
        playerTwoNameHard = findViewById(R.id.playerTwoNameHard);

        String pOneHard = getIntent().getStringExtra("p1");
        String pTwoHard = getIntent().getStringExtra("p2");

        playerOneNameHard.setText(pOneHard);
        playerTwoNameHard.setText(pTwoHard);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);
        image10 = findViewById(R.id.image10);
        image11 = findViewById(R.id.image11);
        image12 = findViewById(R.id.image12);
        image13 = findViewById(R.id.image13);
        image14 = findViewById(R.id.image14);
        image15 = findViewById(R.id.image15);
        image16 = findViewById(R.id.image16);

        changePlayerTurn(activePlayer);

        image1.setOnClickListener(view -> {
            if (isBoxSelectTable(0)) {
                actionGame((ImageView) view, 0);
            }
        });
        image2.setOnClickListener(view -> {
            if (isBoxSelectTable(1)) {
                actionGame((ImageView) view, 1);
            }
        });
        image3.setOnClickListener(view -> {
            if (isBoxSelectTable(2)) {
                actionGame((ImageView) view, 2);
            }
        });
        image4.setOnClickListener(view -> {
            if (isBoxSelectTable(3)) {
                actionGame((ImageView) view, 3);
            }
        });
        image5.setOnClickListener(view -> {
            if (isBoxSelectTable(4)) {
                actionGame((ImageView) view, 4);
            }
        });
        image6.setOnClickListener(view -> {
            if (isBoxSelectTable(5)) {
                actionGame((ImageView) view, 5);
            }
        });
        image7.setOnClickListener(view -> {
            if (isBoxSelectTable(6)) {
                actionGame((ImageView) view, 6);
            }
        });
        image8.setOnClickListener(view -> {
            if (isBoxSelectTable(7)) {
                actionGame((ImageView) view, 7);
            }
        });
        image9.setOnClickListener(view -> {
            if (isBoxSelectTable(8)) {
                actionGame((ImageView) view, 8);
            }
        });
        image10.setOnClickListener(view -> {
            if (isBoxSelectTable(9)) {
                actionGame((ImageView) view, 9);
            }
        });
        image11.setOnClickListener(view -> {
            if (isBoxSelectTable(10)) {
                actionGame((ImageView) view, 10);
            }
        });
        image12.setOnClickListener(view -> {
            if (isBoxSelectTable(11)) {
                actionGame((ImageView) view, 11);
            }
        });
        image13.setOnClickListener(view -> {
            if (isBoxSelectTable(12)) {
                actionGame((ImageView) view, 12);
            }
        });
        image14.setOnClickListener(view -> {
            if (isBoxSelectTable(13)) {
                actionGame((ImageView) view, 13);
            }
        });
        image15.setOnClickListener(view -> {
            if (isBoxSelectTable(14)) {
                actionGame((ImageView) view, 14);
            }
        });
        image16.setOnClickListener(view -> {
            if (isBoxSelectTable(15)) {
                actionGame((ImageView) view, 15);
            }
        });

        combinationList.add(new int[]{0, 1, 2});
        combinationList.add(new int[]{1, 2, 3});
        combinationList.add(new int[]{4, 5, 6});
        combinationList.add(new int[]{5, 6, 7});
        combinationList.add(new int[]{8, 9, 10});
        combinationList.add(new int[]{9, 10, 11});
        combinationList.add(new int[]{12, 13, 14});
        combinationList.add(new int[]{13, 14, 15});

        combinationList.add(new int[]{0, 4, 8});
        combinationList.add(new int[]{4, 8, 12});
        combinationList.add(new int[]{1, 5, 9});
        combinationList.add(new int[]{5, 9, 13});
        combinationList.add(new int[]{2, 6, 10});
        combinationList.add(new int[]{6, 10, 14});
        combinationList.add(new int[]{3, 7, 11});
        combinationList.add(new int[]{7, 11, 15});

        combinationList.add(new int[]{0, 5, 10});
        combinationList.add(new int[]{5, 10, 15});
        combinationList.add(new int[]{1, 6, 11});
        combinationList.add(new int[]{4, 9, 14});

        combinationList.add(new int[]{2, 5, 8});
        combinationList.add(new int[]{3, 6, 9});
        combinationList.add(new int[]{6, 9, 12});
        combinationList.add(new int[]{7, 10, 13});

    }

    private void actionGame(ImageView imageView, int selectBoxPosition) {
        boxPosition[selectBoxPosition] = activePlayer;
        imageView.setBackgroundResource(R.drawable.border_button);
        imageView.setScaleType(ImageView.ScaleType.CENTER);

        playerOneNameHard = findViewById(R.id.playerOneNameHard);
        playerTwoNameHard = findViewById(R.id.playerTwoNameHard);

        TextView scoreOneHard = findViewById(R.id.scorePlayerOneHard);
        TextView scoreTwoHard = findViewById(R.id.scorePlayerTwoHard);

        if (activePlayer == 1) {
            imageView.setImageResource(R.drawable.x);

            if (checkResultHard()) {
                ActivityResultHard activityResultHard = new ActivityResultHard(ActivityTwoPlayerHard.this, playerOneNameHard.getText().toString() + " winner!", ActivityTwoPlayerHard.this);
                activityResultHard.setCancelable(false);
                activityResultHard.show();

                scoreOne++;
                scoreOneHard.setText(String.valueOf(scoreOne));

            } else if (totalSelectBoxes == 16) {
                ActivityResultHard activityResultHard = new ActivityResultHard(ActivityTwoPlayerHard.this, "Match Draw", ActivityTwoPlayerHard.this);
                activityResultHard.setCancelable(false);
                activityResultHard.show();
            } else {
                changePlayerTurn(2);
                totalSelectBoxes++;
            }
        } else {
            imageView.setImageResource(R.drawable.o);

            if (checkResultHard()) {
                ActivityResultHard activityResultHard = new ActivityResultHard(ActivityTwoPlayerHard.this, playerTwoNameHard.getText().toString() + " winner!", ActivityTwoPlayerHard.this);
                activityResultHard.setCancelable(false);
                activityResultHard.show();

                scoreTwo++;
                scoreTwoHard.setText(String.valueOf(scoreTwo));
            } else if (totalSelectBoxes == 16) {
                ActivityResultHard activityResultHard = new ActivityResultHard(ActivityTwoPlayerHard.this, "Match Draw", ActivityTwoPlayerHard.this);
                activityResultHard.setCancelable(false);
                activityResultHard.show();
            } else {
                changePlayerTurn(1);
                totalSelectBoxes++;
            }
        }
    }

    private boolean isBoxSelectTable(int boxPositions) {
        boolean response = false;
        if (boxPosition[boxPositions] == 0) {
            response = true;
        }
        return response;
    }

    private void changePlayerTurn(int currentPlayerTurn) {
        activePlayer = currentPlayerTurn;

        LinearLayout playerOneLayoutOuter = findViewById(R.id.playerOneLayoutOuterHard);
        LinearLayout playerTwoLayoutOuter = findViewById(R.id.playerTwoLayoutOuterHard);

        if (activePlayer == 1) {
            playerOneLayoutOuter.setBackgroundResource(R.drawable.border_button_active);
            playerTwoLayoutOuter.setBackgroundResource(R.drawable.border_button);
        } else {
            playerTwoLayoutOuter.setBackgroundResource(R.drawable.border_button_active);
            playerOneLayoutOuter.setBackgroundResource(R.drawable.border_button);
        }
    }

    public void restartGameHard() {
        boxPosition = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        activePlayer = 1;
        totalSelectBoxes = 1;
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);
        image6 = findViewById(R.id.image6);
        image7 = findViewById(R.id.image7);
        image8 = findViewById(R.id.image8);
        image9 = findViewById(R.id.image9);
        image10 = findViewById(R.id.image10);
        image11 = findViewById(R.id.image11);
        image12 = findViewById(R.id.image12);
        image13 = findViewById(R.id.image13);
        image14 = findViewById(R.id.image14);
        image15 = findViewById(R.id.image15);
        image16 = findViewById(R.id.image16);

        image1.setImageResource(R.drawable.border_button);
        image2.setImageResource(R.drawable.border_button);
        image3.setImageResource(R.drawable.border_button);
        image4.setImageResource(R.drawable.border_button);
        image5.setImageResource(R.drawable.border_button);
        image6.setImageResource(R.drawable.border_button);
        image7.setImageResource(R.drawable.border_button);
        image8.setImageResource(R.drawable.border_button);
        image9.setImageResource(R.drawable.border_button);
        image10.setImageResource(R.drawable.border_button);
        image11.setImageResource(R.drawable.border_button);
        image12.setImageResource(R.drawable.border_button);
        image13.setImageResource(R.drawable.border_button);
        image14.setImageResource(R.drawable.border_button);
        image15.setImageResource(R.drawable.border_button);
        image16.setImageResource(R.drawable.border_button);
    }

    private boolean checkResultHard() {
        boolean check = false;
        for (int i = 0; i < combinationList.size(); i++) {
            final int[] comb = combinationList.get(i);
            if (boxPosition[comb[0]] == activePlayer && boxPosition[comb[1]] == activePlayer && boxPosition[comb[2]] == activePlayer) {
                check = true;
            }
        }
        return check;
    }
}