package com.example.android.miwok_translator2020_kt_petprojects;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(@NonNull Context context, ArrayList<Word> resource) {
        super(context, 0, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View ListItemView = convertView;
        if (ListItemView == null) {
            ListItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //Get the object located at this position in the list
        Word currentAndroidWord = getItem(position);
        // Find the TextView in the list_item.xml layout with the Miwok Name
        TextView nameMiwokTextView = ListItemView.findViewById(R.id.miwok_txtView);

        // set this text on the name TextView
        nameMiwokTextView.setText(currentAndroidWord.getMiWokTranslation());

        // Find the TextView in the list_item.xml layout with the Default translation
        TextView nameDefaultTextView = ListItemView.findViewById(R.id.dfefault_txtView);

        // set this text on the name TextView
        nameDefaultTextView.setText(currentAndroidWord.getDefaultTranslation());

        return ListItemView;
    }
}
