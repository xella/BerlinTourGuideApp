package com.example.xella.berlintourguideapp;

/**
 * Created by Xella on 03-Jul-17.
 */

public class Place {

    // Title of the place
    private String mPlaceTitle;

    // Description of the place
    private String mPlaceDescription;

    // Image resource ID for the place
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    // Constant value that represents no image was provided for this place
    private static final int NO_IMAGE_PROVIDED = -1;

//    // Phone number of the place
//    private String mPhoneNumber;
//
//    // Address of the place
//    private String mAddress;

    public Place(String placeTitle, String placeDescription, int imageResourceID) {
        mPlaceTitle = placeTitle;
        mPlaceDescription = placeDescription;
        mImageResourceID = imageResourceID;
    }

    public Place(String placeTitle, String placeDescription) {
        mPlaceTitle = placeTitle;
        mPlaceDescription = placeDescription;
    }

    public String getPlaceTitle() {
        return mPlaceTitle;
    }

    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
