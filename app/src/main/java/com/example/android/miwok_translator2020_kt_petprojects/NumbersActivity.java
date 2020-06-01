package com.example.android.miwok_translator2020_kt_petprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //creating arrayList
        ArrayList<Word> words = new ArrayList<Word>();

        //words.add(0, "One")
        words.add(new Word("lutti", "one"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight", "kawinta"));
        words.add(new Word("nine", "wo’e"));
        words.add(new Word("ten", "na’aacha"));



        //Add a log in verbose to determine the process that ongoing
        //make a for loop to make looping and show Log message to this
        for (int i = 0; i < 10; i++) {
            Log.i("Number Activity", "Index " + i + " is: " + words.get(i));
        }

        //created array ada[ter for recyclr view | memory optimization
        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item , words);

        ListView listView = (ListView) findViewById(R.id.list_item);

        listView.setAdapter(itemsAdapter);
    }
}
