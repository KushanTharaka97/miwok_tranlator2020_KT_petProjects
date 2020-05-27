package com.example.android.miwok_translator2020_kt_petprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //following mehtods are connected with the layout XML in View
    public void openNumbersList(View view){
        Intent i_Numbers = new Intent(this, NumbersActivity.class);
        startActivity(i_Numbers);
    }

    public void openFamilyActivities(View view){
        Intent i_Family=new Intent(this,FamiliActivities.class);
        startActivity(i_Family);
    }

    public void openColors(View view){
        Intent i_colors=new Intent(this,ColorsActivity.class);
        startActivity(i_colors);
    }

    public void openPhrases(View view){
        Intent i_phrases=new Intent(this,PhrasesActivity.class);
        startActivity(i_phrases);
    }
}
