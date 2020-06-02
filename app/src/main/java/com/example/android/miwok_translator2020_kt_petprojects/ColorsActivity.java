package com.example.android.miwok_translator2020_kt_petprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        /*first have to create a arraylist for the colours,
        I am using previous word object of ArrayList to store the
        colours of Miwok Language*/
        ArrayList<Word> numberList = new ArrayList<Word>();

        /*Now second step is store the list of Names in colours(these words will auto
        store in Word oject when array is running)*/
        numberList.add(new Word("red", "weṭeṭṭi"));
        numberList.add(new Word("green", "weṭeṭṭi"));
        numberList.add(new Word("brown", "ṭakaakki"));
        numberList.add(new Word("gray", "ṭopoppi"));
        numberList.add(new Word("black", "kululli"));
        numberList.add(new Word("white", "kelelli"));
        numberList.add(new Word("dusty yellow", "ṭopiisә"));
        numberList.add(new Word("mustard yellow", "chiwiiṭә"));

        /*I have to assign a adapter to view this according to colourMiwok|colorDefault*/
        WordAdapter numbersAdapter = new WordAdapter(this, numberList);

        //initialize right list
        ListView colorList = findViewById(R.id.colorsList);

        colorList.setAdapter(numbersAdapter);
    }
}
