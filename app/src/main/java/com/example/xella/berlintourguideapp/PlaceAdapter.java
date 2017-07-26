package com.example.xella.berlintourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID place_title
        TextView placeTitleTextView = (TextView) listItemView.findViewById(R.id.place_title);
        // Get the place name from the current Place object and
        // set this text on the place_title TextView
        placeTitleTextView.setText(currentPlace.getPlaceTitle());

        // Find the TextView in the list_item.xml layout with the ID place_description
        TextView placeDescriptionTextView = (TextView) listItemView.findViewById(R.id.place_description);
        // Get the place description from the current Place object and
        // set this text on the place_description TextView
        placeDescriptionTextView.setText(currentPlace.getPlaceDescription());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentPlace.hasImage()) {
            // Set the ImageView to the image resource specified in the current Place
            imageView.setImageResource(currentPlace.getImageResourceID());

            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID place_address
        TextView placeAddressTextView = (TextView) listItemView.findViewById(R.id.place_address);
        // Get the place address from the current Place object and
        // set this text on the place_address TextView
        placeAddressTextView.setText(currentPlace.getPlaceAddress());

        // Find the TextView in the list_item.xml layout with the ID place_phone
        TextView placePhoneTextView = (TextView) listItemView.findViewById(R.id.place_phone);

        if (currentPlace.hasPhone()) {
            placePhoneTextView.setText(currentPlace.getPlacePhone());
        } else {
            placePhoneTextView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID place_price_range
        TextView placePriceRangeTextView = (TextView) listItemView.findViewById(R.id.place_price_range);

        if (currentPlace.hasPriceRange()) {
            placePriceRangeTextView.setText(currentPlace.getPlacePriceRange());
        } else {
            placePriceRangeTextView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID place_working_hours
        TextView placeWorkingHours = (TextView) listItemView.findViewById(R.id.place_working_hours);

        if (currentPlace.hasWorkingHours()) {
            placeWorkingHours.setText(currentPlace.getWorkingHours());
        } else {
            placeWorkingHours.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
