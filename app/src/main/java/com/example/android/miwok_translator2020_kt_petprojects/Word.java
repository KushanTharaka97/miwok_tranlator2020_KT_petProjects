package com.example.android.miwok_translator2020_kt_petprojects;
import android.view.View;


public class Word{

        private String miWokTranslation;
        private String defaultTranslation;

        //miwok translation method
    public String getMiWokTranslation() {
        return miWokTranslation;
    }
        //default translation method
    public String getDefaultTranslation() {
        return defaultTranslation;
    }
        //contructor
    public Word(String defaultTranslation, String miWokTranslation) {
        this.miWokTranslation = miWokTranslation;
        this.defaultTranslation = defaultTranslation;
    }
}
