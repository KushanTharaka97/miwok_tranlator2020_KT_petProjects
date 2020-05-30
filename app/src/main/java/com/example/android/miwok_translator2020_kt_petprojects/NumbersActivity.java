package com.example.android.miwok_translator2020_kt_petprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //creating new array for the English Numbers
        String[] englishNumberWords = new String[10];

        //Store English Numbers in englishNumberWords Array
        englishNumberWords[0] = "One";
        englishNumberWords[1] = "Two";
        englishNumberWords[2] = "Three";
        englishNumberWords[3] = "Four";
        englishNumberWords[4] = "Five";
        englishNumberWords[5] = "Six";
        englishNumberWords[6] = "Seven";
        englishNumberWords[7] = "Eight";
        englishNumberWords[8] = "Nine";
        englishNumberWords[9] = "Ten";

    }
}
