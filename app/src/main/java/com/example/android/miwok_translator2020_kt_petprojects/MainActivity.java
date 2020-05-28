package com.example.android.miwok_translator2020_kt_petprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //send to below
        // NumbersClickListner clickListner=new NumbersClickListner();

        //Find the view that show the number
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //set onclick listner to that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Numbers open", Toast.LENGTH_SHORT).show();
                Intent i_Numbers = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(i_Numbers);
            }
        });

        TextView family = (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Family", Toast.LENGTH_SHORT).show();
                Intent i_Families = new Intent(MainActivity.this, FamiliActivities.class);
                startActivity(i_Families);
            }
        });


    }

    public void openColors(View view) {
        Intent i_colors = new Intent(this, ColorsActivity.class);
        startActivity(i_colors);
    }

    public void openPhrases(View view) {
        Intent i_phrases = new Intent(this, PhrasesActivity.class);
        startActivity(i_phrases);
    }
}
