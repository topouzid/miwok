package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dimitriostopouzidis on 03/03/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> words) {
//        super(context, R.layout.list_item, words);
        super(context,0, words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /** Check if the existing view is being reused, otherwise inflate the view */
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        /** Get the {@link Word} object located at this position in the list */
        Word currentWord = getItem(position);
        /** Find the TextView in the list_item.xml layout with the ID default_language_text_view */
        TextView defaultTranslationTextView = (TextView) listItemView.findViewById(R.id.default_language_text_view);
        /** Get the default-language translation from the current Word object and
         * set this text on the name TextView
         */
        defaultTranslationTextView.setText(currentWord.getDefaultTranslation());
        /** Find the TextView in the list_item.xml layout with the ID miwok_text_view */
        TextView miwokTranslationTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        /** Get the miwok translation from the current Word object and
         * set this text on the name TextView
         */
        miwokTranslationTextView.setText(currentWord.getMiwokTranslation());
//        return super.getView(position, convertView, parent);
        /** Find the ImageView in the list_item.xml layout with the ID miwok_image_view */
        ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.miwok_image_view);
        /** Get the image resource ID from the current Word object and
         * set this image ID as a resource to the ImageView
         */
        itemImageView.setImageResource(currentWord.getImageResourceID());
        return listItemView;
    }
}
