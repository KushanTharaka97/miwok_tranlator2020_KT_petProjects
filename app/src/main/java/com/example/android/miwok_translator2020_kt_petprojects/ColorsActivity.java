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
        numberList.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
        numberList.add(new Word("green", "weṭeṭṭi", R.drawable.color_green));
        numberList.add(new Word("brown", "ṭakaakki", R.drawable.color_brown));
        numberList.add(new Word("gray", "ṭopoppi", R.drawable.color_gray));
        numberList.add(new Word("black", "kululli", R.drawable.color_black));
        numberList.add(new Word("white", "kelelli",R.drawable.color_white ));
        numberList.add(new Word("dusty yellow", "ṭopiisә",R.drawable.color_dusty_yellow));
        numberList.add(new Word("mustard yellow", "chiwiiṭә",R.drawable.color_mustard_yellow));

        /*I have to assign a adapter to view this according to colourMiwok|colorDefault*/
        WordAdapter numbersAdapter = new WordAdapter(this, numberList);

        //initialize right list
        ListView colorList = findViewById(R.id.colorsList);

        colorList.setAdapter(numbersAdapter);
    }
}
