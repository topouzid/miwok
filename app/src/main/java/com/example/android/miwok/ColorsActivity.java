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
        colorsWords.add(new Word("red", "weṭeṭṭi"));
        colorsWords.add(new Word("green", "chokokki"));
        colorsWords.add(new Word("brown", "ṭakaakki"));
        colorsWords.add(new Word("gray", "ṭopoppi"));
        colorsWords.add(new Word("black", "kululli"));
        colorsWords.add(new Word("white", "kelelli"));
        colorsWords.add(new Word("dusty yellow", "ṭopiisә"));
        colorsWords.add(new Word("mustard yellow", "chiwiiṭә"));

        /**
         * Create a WordAdapter with the colorsWords list,
         * set the adapter on the listview
         */
        WordAdapter colors = new WordAdapter(this, colorsWords);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(colors);
    }
}
