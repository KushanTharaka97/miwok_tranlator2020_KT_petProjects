package com.example.android.miwok_translator2020_kt_petprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamiliActivities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        /*First we have to create ArrayList ,we can't use
         Array because Array is static but ArrayList is Dynamic
         In this operation I am creating ArrayList which has object as the datatype
         [Object:Word class]*/
        ArrayList<Word> familyList = new ArrayList<Word>();

        /*After that have to add family words to the familyList ArrayList that created aove*/
        familyList.add(new Word("father", "әpә"));
        familyList.add(new Word("mother ", "әṭa"));
        familyList.add(new Word("son  ", "angsi"));
        familyList.add(new Word("daughter", "tune"));
        familyList.add(new Word("older brother", "taachi"));
        familyList.add(new Word("younger brother", "chalitti"));
        familyList.add(new Word("older sister", "kolliti"));
        familyList.add(new Word("younger sister", "kolliti"));
        familyList.add(new Word("grandmother", "ama"));
        familyList.add(new Word("grandfather", "paapa"));

        /*Creating a ArrayAdapter to display the  words in a beautiful list*/
        WordAdapter familyAdapter = new WordAdapter(this, familyList);

        //initialize the list that view
        ListView familyDisplayList = (ListView) findViewById(R.id.familyList);

        //set the adapter
        familyDisplayList.setAdapter(familyAdapter);
    }
}
