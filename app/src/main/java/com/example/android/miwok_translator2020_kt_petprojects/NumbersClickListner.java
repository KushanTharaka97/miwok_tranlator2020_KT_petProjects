package com.example.android.miwok_translator2020_kt_petprojects;

import android.view.View;
import android.widget.Toast;

public class NumbersClickListner implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"Open Numbers",Toast.LENGTH_SHORT).show();
    }
}
