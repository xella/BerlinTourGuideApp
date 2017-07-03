package com.example.xella.berlintourguideapp;

/**
 * Created by Xella on 03-Jul-17.
 */

public class Place {

    private String mPhoneNumber;
    private String mAddress;

    // Image Resource ID for the place
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word*/
    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(String phoneNumber, String address, int imageResourceID) {
        mPhoneNumber = phoneNumber;
        mAddress = address;
        mImageResourceID = imageResourceID;
    }

}
