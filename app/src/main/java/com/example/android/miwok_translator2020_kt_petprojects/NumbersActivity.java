package com.example.android.miwok_translator2020_kt_petprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //creating arrayList
        ArrayList<String> words = new ArrayList<>();
        words.add(0, "One");
        words.add(1, "Two");
        words.add(2, "Three");
        words.add(3, "Four");
        words.add(4, "Five");
        words.add(5, "Six");
        words.add(6, "Seven");
        words.add(7, "Eight");
        words.add(8, "Nine");
        words.add(9, "Ten");

        //Add a log in verbose to determine the process that ongoing
        //make a for loop to make looping and show Log message to this
        for (int i = 0; i < 10; i++) {
            Log.i("Number Activity", "Index " + i + " is: " + words.get(i));
        }

        //initializing the LinearLayoutView
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        //while loop all show
        int index = 0;
        while (index < words.size()) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
            index = index + 1;
        }
    }
}
