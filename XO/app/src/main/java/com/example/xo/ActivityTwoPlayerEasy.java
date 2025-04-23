package com.example.xo;

import static android.content.Intent.getIntent;

import android.os.Bundle;
import android.view.View;
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

public class ActivityTwoPlayerEasy extends AppCompatActivity {

    private TextView playerOneName;
    private TextView playerTwoName;
    private final List<int[]> combinationList = new ArrayList<>();
    private int activePlayer = 1;
    private int[] boxPosition = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    private int totalSelectBoxes = 1;
    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9;
    private int scoreOne = 0;
    private int scoreTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player_easy);

        playerOneName = findViewById(R.id.playerOneName);
        playerTwoName = findViewById(R.id.playerTwoName);
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

        changePlayerTurn(activePlayer);

        image1.setOnClickListener(view -> {
            if (isBoxSelectTable(0)) {
                performAction((ImageView) view, 0);
            }
        });
        image2.setOnClickListener(view -> {
            if (isBoxSelectTable(1)) {
                performAction((ImageView) view, 1);
            }
        });
        image3.setOnClickListener(view -> {
            if (isBoxSelectTable(2)) {
                performAction((ImageView) view, 2);
            }
        });
        image4.setOnClickListener(view -> {
            if (isBoxSelectTable(3)) {
                performAction((ImageView) view, 3);
            }
        });
        image5.setOnClickListener(view -> {
            if (isBoxSelectTable(4)) {
                performAction((ImageView) view, 4);
            }
        });
        image6.setOnClickListener(view -> {
            if (isBoxSelectTable(5)) {
                performAction((ImageView) view, 5);
            }
        });
        image7.setOnClickListener(view -> {
            if (isBoxSelectTable(6)) {
                performAction((ImageView) view, 6);
            }
        });
        image8.setOnClickListener(view -> {
            if (isBoxSelectTable(7)) {
                performAction((ImageView) view, 7);
            }
        });
        image9.setOnClickListener(view -> {
            if (isBoxSelectTable(8)) {
                performAction((ImageView) view, 8);
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

    // Вся логика.
    private void performAction(ImageView imageView, int selectedBoxPosition) { // метод берет картинку и ставит на определенную позицию.
        boxPosition[selectedBoxPosition] = activePlayer;
        imageView.setBackgroundResource(R.drawable.border_button_gray);
        imageView.setScaleType(ImageView.ScaleType.CENTER);

        playerOneName = findViewById(R.id.playerOneName);
        playerTwoName = findViewById(R.id.playerTwoName);

        TextView scoreOneP = findViewById(R.id.scorePlayerOne);
        TextView scoreTwoP = findViewById(R.id.scorePlayerTwo);

        if (activePlayer == 1) {
            imageView.setImageResource(R.drawable.x);

            if (checkResult()) {
                ActivityResult activityResult = new ActivityResult(ActivityTwoPlayerEasy.this, playerOneName.getText().toString() + " winner!", ActivityTwoPlayerEasy.this);
                activityResult.setCancelable(false);
                activityResult.show();

                scoreOne++;
                scoreOneP.setText(String.valueOf(scoreOne));

            } else if (totalSelectBoxes == 9) {
                ActivityResult activityResult = new ActivityResult(ActivityTwoPlayerEasy.this, "Match Draw", ActivityTwoPlayerEasy.this);
                activityResult.setCancelable(false);
                activityResult.show();
            } else {
                changePlayerTurn(2);
                totalSelectBoxes++;
            }

        } else {
            imageView.setImageResource(R.drawable.o);

        if (checkResult()) {
            ActivityResult activityResult = new ActivityResult(ActivityTwoPlayerEasy.this, playerTwoName.getText().toString() + " winner!", ActivityTwoPlayerEasy.this);
            activityResult.setCancelable(false);
            activityResult.show();

            scoreTwo++;
            scoreTwoP.setText(String.valueOf(scoreTwo));

        } else if (totalSelectBoxes == 9) {
            ActivityResult activityResult = new ActivityResult(ActivityTwoPlayerEasy.this, "Match Draw", ActivityTwoPlayerEasy.this);
            activityResult.setCancelable(false);
            activityResult.show();
        } else {
            changePlayerTurn(1);
            totalSelectBoxes++;
        }
    }
}

// Метод проверки кто выиграл.
private boolean checkResult() {
    boolean check = false;
    for (int i = 0; i < combinationList.size(); i++) {
        final int[] comb = combinationList.get(i);
        if (boxPosition[comb[0]] == activePlayer && boxPosition[comb[1]] == activePlayer && boxPosition[comb[2]] == activePlayer) {
            check = true;
        }
    }
    return check;
}

// Метод смены хода игрока.
private void changePlayerTurn(int currentPlayerTurn) {
    activePlayer = currentPlayerTurn;

    LinearLayout playerOneLayoutOuter = findViewById(R.id.playerOneLayoutOuter);
    LinearLayout playerTwoLayoutOuter = findViewById(R.id.playerTwoLayoutOuter);

    if (activePlayer == 1) {
        playerOneLayoutOuter.setBackgroundResource(R.drawable.border_button_active);
        playerTwoLayoutOuter.setBackgroundResource(R.drawable.border_button);
    } else {
        playerTwoLayoutOuter.setBackgroundResource(R.drawable.border_button_active);
        playerOneLayoutOuter.setBackgroundResource(R.drawable.border_button);
    }
}

// метод запрета ставить повторно в ячейку крестик или нолик.
private boolean isBoxSelectTable(int boxPositions) {
    boolean response = false;
    if (boxPosition[boxPositions] == 0) {
        response = true;
    }
    return response;
}

// метод перезапуска игры.
public void restartGame() {
    boxPosition = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
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

    image1.setImageResource(R.drawable.border_button);
    image2.setImageResource(R.drawable.border_button);
    image3.setImageResource(R.drawable.border_button);
    image4.setImageResource(R.drawable.border_button);
    image5.setImageResource(R.drawable.border_button);
    image6.setImageResource(R.drawable.border_button);
    image7.setImageResource(R.drawable.border_button);
    image8.setImageResource(R.drawable.border_button);
    image9.setImageResource(R.drawable.border_button);
}
}