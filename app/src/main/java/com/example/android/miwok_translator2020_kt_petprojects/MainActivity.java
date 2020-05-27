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

    public void openNumbersList(View view){
        Intent i_Numbers = new Intent(this, NumbersActivity.class);
        startActivity(i_Numbers);
    }
}
