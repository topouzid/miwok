package com.example.android.miwok;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorsFragment extends Fragment {


    public ColorsFragment() {
        // Required empty public constructor
    }

    /**
     * Handles audio focus
     */
    private AudioManager mAudioManager;

    /**
     * Handles the player of all sound files
     */
    private MediaPlayer mediaPlayer;

    /**
     * This listener gets triggered when the {@link MediaPlayer} completes playing the audio file
     */
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        /** Create and setup the {@link AudioManager} to request audio focus */
        mAudioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);

        /**
         * Create ArrayList of type Word, add new Words with default language and translation
         */
        final ArrayList<Word> colorsWords = new ArrayList<Word>();
        colorsWords.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        colorsWords.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        colorsWords.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        colorsWords.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        colorsWords.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
        colorsWords.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        colorsWords.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colorsWords.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        /**
         * Create a WordAdapter with the colorsWords list,
         * set the adapter on the listview
         */
        WordAdapter colors = new WordAdapter(getActivity(), colorsWords, getResources().getColor(R.color.category_colors));
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(colors);
        /** Set a click listener to play the audio when the list item is clicked on */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /** get the {@link Word} object at the current position where the user clicked on */
                Word currentWord = colorsWords.get(position);
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
                    mediaPlayer = MediaPlayer.create(getActivity(), currentWord.getAudioResourceID());
                    /** Start the audio file */
                    mediaPlayer.start();
                    /** Setup a listener on the media player, so that we can stop and release the
                     * media player once the sound has finished playing.
                     */
                    mediaPlayer.setOnCompletionListener(mCompletionListener);
                }
            }
        });

        return rootView;
    }

    /**
     * stops the media player in case the application closes or loses focus
     */
    @Override
    public void onStop() {
        super.onStop();
        // When the activity is stopped, release the media player resources because we won't
        // be playing any more sounds.
        releaseMediaPlayer();
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

    private AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener =
            new AudioManager.OnAudioFocusChangeListener() {
                public void onAudioFocusChange(int focusChange) {
                    if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT) {
                        // Pause playback because your Audio Focus was
                        // temporarily stolen, but will be back soon.
                        // i.e. for a phone call
                        mediaPlayer.pause();
                        mediaPlayer.seekTo(0);
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
                    } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                        // Resume playback, because you hold the Audio Focus
                        // again!
                        // i.e. the phone call ended or the nav directions
                        // are finished
                        // If you implement ducking and lower the volume, be
                        // sure to return it to normal here, as well.
                        mediaPlayer.start();
                    }
                }
            };

}
