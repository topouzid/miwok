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

        /**
         * Words are stored in an array of size 10
         */
//        String[] wordsArray = new String[10];
//        wordsArray[0] = "One";
//        wordsArray[1] = "Two";
//        wordsArray[2] = "Three";
//        wordsArray[3] = "Four";
//        wordsArray[4] = "Five";
//        wordsArray[5] = "Six";
//        wordsArray[6] = "Seven";
//        wordsArray[7] = "Eight";
//        wordsArray[8] = "Nine";
//        wordsArray[9] = "Ten";
//        Log.v("NumbersActivity", "Array Index 0 " + wordsArray[0]);
//        Log.v("NumbersActivity", "Array Index 1 " + wordsArray[1]);
//        Log.v("NumbersActivity", "Array Index 2 " + wordsArray[2]);
//        Log.v("NumbersActivity", "Array Index 3 " + wordsArray[3]);
//        Log.v("NumbersActivity", "Array Index 4 " + wordsArray[4]);
//        Log.v("NumbersActivity", "Array Index 5 " + wordsArray[5]);
//        Log.v("NumbersActivity", "Array Index 6 " + wordsArray[6]);
//        Log.v("NumbersActivity", "Array Index 7 " + wordsArray[7]);
//        Log.v("NumbersActivity", "Array Index 8 " + wordsArray[8]);
//        Log.v("NumbersActivity", "Array Index 9 " + wordsArray[9]);

        /**
         * Words are stored in an arrayList
         */
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
//        Log.v("NumbersActivity", "ArrayList Index 0 " + words.get(0));
//        Log.v("NumbersActivity", "ArrayList Index 1 " + words.get(1));
//        Log.v("NumbersActivity", "ArrayList Index 2 " + words.get(2));
//        Log.v("NumbersActivity", "ArrayList Index 3 " + words.get(3));
//        Log.v("NumbersActivity", "ArrayList Index 4 " + words.get(4));
//        Log.v("NumbersActivity", "ArrayList Index 5 " + words.get(5));
//        Log.v("NumbersActivity", "ArrayList Index 6 " + words.get(6));
//        Log.v("NumbersActivity", "ArrayList Index 7 " + words.get(7));
//        Log.v("NumbersActivity", "ArrayList Index 8 " + words.get(8));
//        Log.v("NumbersActivity", "ArrayList Index 9 " + words.get(9));

        /**
         * Create the main view
         * @variable rootView
         */
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        /**
         * Manually create textViews one by one,
         * set text, add textViews to main view
         */
//        TextView wordView = new TextView(this);
//        wordView.setText(words.get(0));
//        rootView.addView(wordView);
//
//        TextView wordView2 = new TextView(this);
//        wordView2.setText(words.get(1));
//        rootView.addView(wordView2);

        /**
         * Create the an arrayList of textviews using while loop,
         * add each textview to the main view.
         */
//        int arraySize = words.size();
        int index = 0;
        ArrayList<TextView> wordViewList = new ArrayList<TextView>();
        while (index < words.size()) {
            wordViewList.add(new TextView(this));
            wordViewList.get(index).setText(words.get(index));
            rootView.addView(wordViewList.get(index));
            Log.v("NumbersActivity", "While Loop/ Index: "+index+", ArraySize: "+words.size()+", Word: "+words.get(index));
            index++;
        }

        /**
         * Create an arraylist of textViews using for loop,
         * add each textView to the main view.
         */
//        ArrayList<TextView> wordViewList = new ArrayList<TextView>();
//        for (int index = 0; index < words.size(); index++) {
//            wordViewList.add(new TextView(this));
//            wordViewList.get(index).setText(words.get(index));
//            rootView.addView(wordViewList.get(index));
//            Log.v("NumbersActivity", "For Loop/ Index: "+index+", ArraySize: "+words.size()+", Word: "+words.get(index));
//        }

        /**
         * Create a textView, set word, add to main view,
         * repeat for all words in the list.
         * All textviews have the same name.
         */
//        for (int index = 0; index < words.size(); index++) {
//            TextView newTextView = new TextView(this);
//            newTextView.setText(words.get(index));
//            rootView.addView(newTextView);
//            Log.v("NumbersActivity", "For Loop/ Index: "+index+", ArraySize: "+words.size()+", Word: "+words.get(index));
//        }


    }
}
