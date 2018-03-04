package com.example.android.miwok;

/**
 * Created by dimitriostopouzidis on 02/03/2018.
 */

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for this word.
 */
public class Word {

    /** Default translation of the word */
    private String mDefaultTranslation;

    /** Miwok translation of the word */
    private String mMiwokTranslation;

    /**
     * Constructor that has to have exactly the same name as the class
     * @param defaultTranslation
     * @param miwokTranslation
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Method: Get the default translation of the word
     * @return
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Method: Get the Miwok translation of the word
     * @return
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
