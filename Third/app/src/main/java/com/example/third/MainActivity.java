package com.example.third;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        TextView textColor = findViewById(R.id.textColor);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.radioButton) {
                    textColor.setTextColor(Color.parseColor("#009212"));
                } else if (i == R.id.radioButton2) {
                    textColor.setTextColor(Color.parseColor("#ff6f00"));
                }
            }
        });

        Button chooseColor = findViewById(R.id.changeColor);
        ToggleButton toggleButton = findViewById(R.id.toggleButton);


        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleButton.isChecked()) {
                    chooseColor.setBackgroundColor(Color.parseColor("#009212"));
                } else {
                    chooseColor.setBackgroundColor(Color.parseColor("#ff6f00"));
                }
            }
        });


        Switch mySwitch = findViewById(R.id.switch1);
        mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mySwitch.setTextColor(Color.parseColor("#ff6f00"));
                } else {
                    mySwitch.setTextColor(Color.parseColor("#009212"));
                }
            }
        });


        ConstraintLayout constraintLayout = findViewById(R.id.main);
        SwitchMaterial switchMaterial = findViewById(R.id.switchMaterial);

        switchMaterial.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"UseCompatLoadingForDrawables", "SetTextI18n"})
            @Override
            public void onClick(View view) {
                if (switchMaterial.isChecked()) {
                    switchMaterial.setThumbDrawable(getDrawable(R.drawable.baseline_ac_unit_24));
                    switchMaterial.setText("Turn on Night mode");
                    switchMaterial.setThumbTintList(ColorStateList.valueOf(Color.RED));
                    switchMaterial.setTrackTintList(ColorStateList.valueOf(Color.BLUE));
                    constraintLayout.setBackgroundResource(R.color.bg);
                } else {
                    switchMaterial.setThumbDrawable(getDrawable(R.drawable.baseline_wb_sunny_24));
                    switchMaterial.setText("Turn on Light mode");
                    constraintLayout.setBackgroundResource(R.color.white);
                }
            }
        });


        // Обработчик смены цвета через кнопку.

//        Button chooseColor = findViewById(R.id.changeColor);
//        chooseColor.setOnClickListener(view -> {
//            RadioGroup radioGroup = findViewById(R.id.radioGroup);
//            int checkedButtonIndex = radioGroup.getCheckedRadioButtonId(); // Получаем активную радиокнопку по ID.
//            TextView textColor = findViewById(R.id.textColor);
//
//            if (checkedButtonIndex == R.id.radioButton) {
//                textColor.setTextColor(Color.parseColor("#009212"));
//            } else if (checkedButtonIndex == R.id.radioButton2) {
//                textColor.setTextColor(Color.parseColor("#ff6f00"));
//            }
//        });


        TextView sampleText = findViewById(R.id.sampleText);
        CheckBox boldCheckBox = findViewById(R.id.boldCheckBox);
        CheckBox italicCheckBox = findViewById(R.id.italicCheckBox);

        boldCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    if (italicCheckBox.isChecked()) {
                        sampleText.setTypeface(null, Typeface.BOLD_ITALIC);
                    } else {
                        sampleText.setTypeface(null, Typeface.BOLD);
                    }
                } else {
                    if (italicCheckBox.isChecked()) {
                        sampleText.setTypeface(null, Typeface.ITALIC);
                    } else {
                        sampleText.setTypeface(null, Typeface.NORMAL);
                    }
                }
            }
        });

        italicCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    if (boldCheckBox.isChecked()) {
                        sampleText.setTypeface(null, Typeface.BOLD_ITALIC);
                    } else {
                        sampleText.setTypeface(null, Typeface.ITALIC);
                    }

                } else {
                    if (boldCheckBox.isChecked()) {
                        sampleText.setTypeface(null, Typeface.BOLD);
                    } else {
                        sampleText.setTypeface(null, Typeface.NORMAL);
                    }
                }
            }
        });
    }
}