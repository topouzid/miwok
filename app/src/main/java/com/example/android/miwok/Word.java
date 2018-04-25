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

    /** Image Resource ID */
    private int mImageResourceID = NO_IMAGE_AVAILABLE;

    /** Audio Resource ID */
    private int mAudioResourceID;

    /** Image availability */
    private final static int NO_IMAGE_AVAILABLE = -1;

    /**
     * Constructor that has to have exactly the same name as the class
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceID
     * @param audioResourceID
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Constructor that has to have exactly the same name as the class
     * @param defaultTranslation
     * @param miwokTranslation
     * @param audioResourceID
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
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

    /**
     * Method: Get the resource ID of the image to be used
     * @return
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     * Method: Get the resource ID of the audio to be played
     * @return
     */
    public int getAudioResourceID() {
        return mAudioResourceID;
    }

    /**
     * Method: Get status of image availability
     * @return TRUE if there is an image
     * @return FALSE if there is NO image
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_AVAILABLE;
    }

    /**
     * Returns the string representation of the {@link Word} object.
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceID +
                ", mImageResourceId=" + mImageResourceID +
                '}';
    }
}
