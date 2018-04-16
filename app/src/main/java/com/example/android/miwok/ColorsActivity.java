package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /**
         * Create ArrayList of type Word, add new Words with default language and translation
         */
        ArrayList<Word> colorsWords = new ArrayList<Word>();
        colorsWords.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
        colorsWords.add(new Word("green", "chokokki", R.drawable.color_green));
        colorsWords.add(new Word("brown", "ṭakaakki", R.drawable.color_brown));
        colorsWords.add(new Word("gray", "ṭopoppi", R.drawable.color_gray));
        colorsWords.add(new Word("black", "kululli", R.drawable.color_black));
        colorsWords.add(new Word("white", "kelelli", R.drawable.color_white));
        colorsWords.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        colorsWords.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));

        /**
         * Create a WordAdapter with the colorsWords list,
         * set the adapter on the listview
         */
        WordAdapter colors = new WordAdapter(this, colorsWords);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(colors);
    }
}
