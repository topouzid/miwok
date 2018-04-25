package com.example.android.miwok;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    /**
     * Handles audio focus
     */
    private AudioManager mAudioManager;

    /** Handles the player of all sound files */
    private MediaPlayer mediaPlayer;

    /** This listener gets triggered when the {@link MediaPlayer} completes playing the audio file */
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /** Create and setup the {@link AudioManager} to request audio focus */
        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

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
//        ArrayList<String> words = new ArrayList<String>();
//        words.add("One");
//        words.add("Two");
//        words.add("Three");
//        words.add("Four");
//        words.add("Five");
//        words.add("Six");
//        words.add("Seven");
//        words.add("Eight");
//        words.add("Nine");
//        words.add("Ten");

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("Two", "otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("Three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("Four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("Five", "massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("Six", "temmokka", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("Seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("Eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("Nine", "wo'e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("Ten", "na'aacha", R.drawable.number_ten, R.raw.number_ten));
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
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

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
//        int index = 0;
//        ArrayList<TextView> wordViewList = new ArrayList<TextView>();
//        while (index < words.size()) {
//            wordViewList.add(new TextView(this));
//            wordViewList.get(index).setText(words.get(index));
//            rootView.addView(wordViewList.get(index));
//            Log.v("NumbersActivity", "While Loop/ Index: "+index+", ArraySize: "+words.size()+", Word: "+words.get(index));
//            index++;
//        }

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

        /**
         * Create an ArrayAdapter to show a list to a ListView in XML
         * @type simple_list_item_1
         * @input words ArrayList
         */
//        ArrayAdapter<String> wordViewAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
//        ListView listView = (ListView) findViewById(R.id.list);
//        listView.setAdapter(wordViewAdapter);
        /** Same but using grid, changed to xml are needed*/
//        GridView gridView = (GridView) findViewById(R.id.grid);
//        gridView.setAdapter(wordViewAdapter);

        /**
         * Create an ArrayAdapter to show a dual list using list_item
         */
//        ArrayAdapter<Word> wordViewAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, words);
//        ListView listView = (ListView) findViewById(R.id.list);
//        listView.setAdapter(wordViewAdapter);

        /** Use our own WordAdapter instead of ArrayAdapter */
        WordAdapter adapter = new WordAdapter(this, words, getResources().getColor(R.color.category_numbers));
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        /** Set a click listener to play the audio when the list item is clicked on */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /** get the {@link Word} object at the current position where the user clicked on */
                Word currentWord = words.get(position);
                /** Release media player in case it was already playing another audio file */
                releaseMediaPlayer();
                /** Request audio focus so in order to play the audio file. The app needs to play a
                 * short audio file, so we will request audio focus with a short amount of time
                 * with AUDIOFOCUS_GAIN_TRANSIENT.
                 */
                int result = mAudioManager.requestAudioFocus(mAudioFocusChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    // We have audio focus now

                    /** Create and setup the {@link MediaPlayer} for the audio resource associated with
                     * the word at the current position
                     */
                    mediaPlayer = MediaPlayer.create(NumbersActivity.this, currentWord.getAudioResourceID());
                    /** Start the audio file */
                    mediaPlayer.start();
                    /** Setup a listener on the media player, so that we can stop and release the
                     * media player once the sound has finished playing.
                     */
                    mediaPlayer.setOnCompletionListener(mCompletionListener);
                }
            }
        });
//        listView.setBackgroundColor(getResources().getColor(R.color.category_numbers));


    }
    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();
            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
            // Regardless of whether or not we were granted audio focus, abandon it. This also
            // unregisters the AudioFocusChangeListener so we don't get anymore callbacks.
            mAudioManager.abandonAudioFocus(mAudioFocusChangeListener);
        }
    }

    /** stops the media player in case the application closes or loses focus */
    @Override
    protected void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer();
    }

    private AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener =
            new AudioManager.OnAudioFocusChangeListener() {
                public void onAudioFocusChange(int focusChange) {
                    if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT) {
                        // Pause playback because your Audio Focus was
                        // temporarily stolen, but will be back soon.
                        // i.e. for a phone call
                        mediaPlayer.pause();
                        mediaPlayer.seekTo(0);
                        Toast toast = Toast.makeText(NumbersActivity.this, "Paused due to phone call", Toast.LENGTH_LONG);
                        toast.show();
                    } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
                        // Stop playback, because you lost the Audio Focus.
                        // i.e. the user started some other playback app
                        // Remember to unregister your controls/buttons here.
                        // And release the kra — Audio Focus!
                        // You’re done.
                        mediaPlayer.stop();
                        mediaPlayer.release();
                    } else if (focusChange ==
                            AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                        // Lower the volume, because something else is also
                        // playing audio over you.
                        // i.e. for notifications or navigation directions
                        // Depending on your audio playback, you may prefer to
                        // pause playback here instead. You do you.
                        mediaPlayer.pause();
                        Toast toast = Toast.makeText(NumbersActivity.this, "Paused due to short notification", Toast.LENGTH_SHORT);
                        toast.show();
                    } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                        // Resume playback, because you hold the Audio Focus
                        // again!
                        // i.e. the phone call ended or the nav directions
                        // are finished
                        // If you implement ducking and lower the volume, be
                        // sure to return it to normal here, as well.
                        mediaPlayer.start();
                        Toast toast = Toast.makeText(NumbersActivity.this, "Audio resuming...", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            };
}
