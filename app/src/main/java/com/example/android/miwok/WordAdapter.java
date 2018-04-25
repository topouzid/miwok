package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by dimitriostopouzidis on 03/03/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    /** Resource ID for the background of this list */
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
//        super(context, R.layout.list_item, words);
        super(context,0, words);
        mColorResourceId = colorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /** Check if the existing view is being reused, otherwise inflate the view */
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
//            listItemView.setBackgroundColor(mColorResourceId);
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
        /** If there is no image provided, hide the ImageView */
        if (!currentWord.hasImage()) {
//            Log.v("WordAdapter", "POS: " + position + " - ImageResourceID = " + currentWord.getImageResourceID());
            itemImageView.setVisibility(View.GONE);
        } else {
//            Log.v("WordAdapter", "POS: " + position + " - ImageResourceID = " + currentWord.getImageResourceID());
            /** Get the image resource ID from the current Word object and
             * set this image ID as a resource to the ImageView
             */
            itemImageView.setImageResource(currentWord.getImageResourceID());
            /** Set the view as VISIBLE again because the views are getting recycled and
             * might be invisible from a previous Word object */
            itemImageView.setVisibility(View.VISIBLE);
        }
        /** Find the LinearLayout of the text (both translated and original) with the ID text_container */
        LinearLayout linearLayoutForText = (LinearLayout) listItemView.findViewById(R.id.text_container);
        /** Set the background color of the container */
        linearLayoutForText.setBackgroundColor(mColorResourceId);
        return listItemView;
    }
}
