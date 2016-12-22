package com.example.android.tourguide;

/**
 * Created by Jimmy on 12/15/2016.
 */

public class Description {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mDescription, mDescription2;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Public Constructors
    public Description(String Description) {

        mDescription = Description;
    }

    public Description(String Description, int ImageResourceId) {

        mDescription = Description;
        mImageResourceId = ImageResourceId;
    }

    public Description(String Description, String Description2) {

        mDescription = Description;
        mDescription2 = Description2;
    }

    public Description(String Description, String Description2, int ImageResourceId) {

        mDescription = Description;
        mDescription2 = Description2;
        mImageResourceId = ImageResourceId;
    }

    // Getters
    public String getmDescription() {

        return mDescription;
    }

    public String getmDescription2() {

        return mDescription2;
    }

    public int getImageResourceId() {

        return mImageResourceId;
    }

    // Checks to see if there is an image
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
