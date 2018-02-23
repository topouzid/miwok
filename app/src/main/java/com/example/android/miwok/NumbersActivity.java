package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        Intent startupIntent = getIntent();
        String[] wordsArray = new String[10];
        wordsArray[0] = "One";
        wordsArray[1] = "Two";
        wordsArray[2] = "Three";
        wordsArray[3] = "Four";
        wordsArray[4] = "Five";
        wordsArray[5] = "Six";
        wordsArray[6] = "Seven";
        wordsArray[7] = "Eight";
        wordsArray[8] = "Nine";
        wordsArray[9] = "Ten";
        Log.v("NumbersActivity", "Array Index 0 " + wordsArray[0]);
        Log.v("NumbersActivity", "Array Index 1 " + wordsArray[1]);
        Log.v("NumbersActivity", "Array Index 2 " + wordsArray[2]);
        Log.v("NumbersActivity", "Array Index 3 " + wordsArray[3]);
        Log.v("NumbersActivity", "Array Index 4 " + wordsArray[4]);
        Log.v("NumbersActivity", "Array Index 5 " + wordsArray[5]);
        Log.v("NumbersActivity", "Array Index 6 " + wordsArray[6]);
        Log.v("NumbersActivity", "Array Index 7 " + wordsArray[7]);
        Log.v("NumbersActivity", "Array Index 8 " + wordsArray[8]);
        Log.v("NumbersActivity", "Array Index 9 " + wordsArray[9]);

        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");
        Log.v("NumbersActivity", "ArrayList Index 0 " + words.get(0));
        Log.v("NumbersActivity", "ArrayList Index 1 " + words.get(1));
        Log.v("NumbersActivity", "ArrayList Index 2 " + words.get(2));
        Log.v("NumbersActivity", "ArrayList Index 3 " + words.get(3));
        Log.v("NumbersActivity", "ArrayList Index 4 " + words.get(4));
        Log.v("NumbersActivity", "ArrayList Index 5 " + words.get(5));
        Log.v("NumbersActivity", "ArrayList Index 6 " + words.get(6));
        Log.v("NumbersActivity", "ArrayList Index 7 " + words.get(7));
        Log.v("NumbersActivity", "ArrayList Index 8 " + words.get(8));
        Log.v("NumbersActivity", "ArrayList Index 9 " + words.get(9));

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        TextView wordView = new TextView(this);
        wordView.setText(words.get(0));
        rootView.addView(wordView);
    }
}
