package com.example.xella.berlintourguideapp;

/**
 * Created by Xella on 03-Jul-17.
 */

public class Place {

    // Title of the place
    private String mPlaceTitle;

    // Description of the place
    private String mPlaceDescription;

    // Constant value that represents no image was provided for this place
    private static final int NO_IMAGE_PROVIDED = -1;

    // Image resource ID for the place
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    // Address of the place
    private String mPlaceAddress;

    // Phone number of the place
    private String mPlacePhone;

    // Price range of the place
    // Cheap / Medium / Expensive
    private String mPlacePriceRange;

    // Working hours of the place
    private String mPlaceWorkingHours;

    /** Constructs a new Place with initial values
     * (Sights)
     * @param placeTitle is the Place title
     * @param placeDescription is the Place description
     * @param imageResourceID is the drawable image resource id
     * @param placeAddress is the address of the Place
     */
    public Place(String placeTitle, String placeDescription, int imageResourceID, String placeAddress) {
        mPlaceTitle = placeTitle;
        mPlaceDescription = placeDescription;
        mImageResourceID = imageResourceID;
        mPlaceAddress = placeAddress;
    }

    /** Constructs a new Place with initial values
     * (Museums)
     * @param placeTitle is the Place title
     * @param placeDescription is the Place description
     * @param imageResourceID is the drawable image resource id
     * @param placeAddress is the address of the Place
     * @param placePhone is the phone number of the Place
     * @param placeWorkingHours is the working hours of the Place
     */

    public Place(String placeTitle, String placeDescription, int imageResourceID, String placeAddress,
                 String placePhone, String placeWorkingHours) {
        mPlaceTitle = placeTitle;
        mPlaceDescription = placeDescription;
        mImageResourceID = imageResourceID;
        mPlaceAddress = placeAddress;
        mPlacePhone = placePhone;
        mPlaceWorkingHours = placeWorkingHours;
    }

    /**
     * Constructs a new Place with initial values
     * (Parks)
     * @param placeTitle
     * @param placeDescription
     * @param imageResourceID
     * @param placeAddress
     * @param placeWorkingHours
     */
    public Place(String placeTitle, String placeDescription, int imageResourceID, String placeAddress,
                 String placeWorkingHours) {
        mPlaceTitle = placeTitle;
        mPlaceDescription = placeDescription;
        mImageResourceID = imageResourceID;
        mPlaceAddress = placeAddress;
        mPlaceWorkingHours = placeWorkingHours;
    }

    /**
     * Construct a new Place with initiial values
     * (Food)
     * @param placeTitle is the Place title
     * @param placeDescription is the Place description
     * @param placeAddress is the drawable image resource id
     * @param placePriceRange
     * @param placePhone is the phone number of the Place
     * @param placeWorkingHours is the working hours of the Place
     */
    public Place(String placeTitle, String placeDescription, String placeAddress, String placePriceRange,
                 String placePhone, String placeWorkingHours) {
        mPlaceTitle = placeTitle;
        mPlaceDescription = placeDescription;
        mPlaceAddress = placeAddress;
        mPlacePriceRange = placePriceRange;
        mPlacePhone = placePhone;
        mPlaceWorkingHours = placeWorkingHours;
    }

    /**
     * Get the title of the Place
     */
    public String getPlaceTitle() {
        return mPlaceTitle;
    }

    /**
     * Get the description of the Place
     */
    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    /**
     * Get the address of the Place
     */
    public String getPlaceAddress() {
        return mPlaceAddress;
    }

    /**
     * Return the image resource ID of the Place
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     * Returns whether or not there is an image for this Place
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the phone number of the Place
     */
    public String getPlacePhone() {
        return mPlacePhone;
    }

    /**
     * Returns whether or not there is a phone number for this Place
     */
    public boolean hasPhone() {
        return mPlacePhone != null;
    }

    /**
     * Get the working hours of the Place
     */
    public String getWorkingHours() {
        return mPlaceWorkingHours;
    }

    /**
     * Returns whether or not there is a working hours for this Place
     */
    public boolean hasWorkingHours() {
        return mPlaceWorkingHours != null;
    }

    /**
     * Get the price range of the Place
     */
    public String getPlacePriceRange() {
        return mPlacePriceRange;
    }

    /**
     * Returns whether or not there is a price range for this Place
     */
    public boolean hasPriceRange() {
        return mPlacePriceRange != null;
    }
}
