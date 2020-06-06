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
        familyList.add(new Word("father", "әpә",R.drawable.family_father));
        familyList.add(new Word("mother ", "әṭa",R.drawable.family_mother));
        familyList.add(new Word("son  ", "angsi",R.drawable.family_son));
        familyList.add(new Word("daughter", "tune",R.drawable.family_daughter));
        familyList.add(new Word("older brother", "taachi",R.drawable.family_older_brother));
        familyList.add(new Word("younger brother", "chalitti",R.drawable.family_younger_brother));
        familyList.add(new Word("older sister", "kolliti",R.drawable.family_older_sister));
        familyList.add(new Word("younger sister", "kolliti",R.drawable.family_younger_sister));
        familyList.add(new Word("grandmother", "ama",R.drawable.family_grandmother));
        familyList.add(new Word("grandfather", "paapa",R.drawable.family_grandfather));

        /*Creating a ArrayAdapter to display the  words in a beautiful list*/
        WordAdapter familyAdapter = new WordAdapter(this, familyList);

        //initialize the list that view
        ListView familyDisplayList = (ListView) findViewById(R.id.familyList);

        //set the adapter
        familyDisplayList.setAdapter(familyAdapter);
    }
}
