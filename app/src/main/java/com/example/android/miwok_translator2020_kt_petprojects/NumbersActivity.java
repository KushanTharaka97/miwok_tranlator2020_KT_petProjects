package com.example.android.miwok_translator2020_kt_petprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

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

        //debug || Log views verbose: just messages to pass in Logcat

        Log.v("NumbersActivity","Number at index 0: " + englishNumberWords[0]);
        Log.v("NumbersActivity","Number at index 1" + englishNumberWords[1]);
        Log.v("NumbersActivity","Number at index 2: " + englishNumberWords[2]);
        Log.v("NumbersActivity","Number at index 3" + englishNumberWords[3]);
        Log.v("NumbersActivity","Number at index 4: " + englishNumberWords[4]);
        Log.v("NumbersActivity","Number at index 5" + englishNumberWords[5]);
        Log.v("NumbersActivity","Number at index 6: " + englishNumberWords[6]);
        Log.v("NumbersActivity","Number at index 7" + englishNumberWords[7]);
        Log.v("NumbersActivity","Number at index 8: " + englishNumberWords[8]);
        Log.v("NumbersActivity","Number at index 9" + englishNumberWords[9]);

    }
}
