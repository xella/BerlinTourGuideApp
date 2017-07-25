package com.example.xella.berlintourguideapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, parent, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.german_museum_of_technology), getString(R.string.german_museum_of_technology_d), R.drawable.deutschestechnikmuseum_, getString(R.string.german_museum_of_technology_address), getString(R.string.german_museum_of_technology_phone), getString(R.string.german_museum_of_technology_hours)));
        places.add(new Place(getString(R.string.german_historical_museum), getString(R.string.german_historical_museum_d), R.drawable.historicalmuseum, getString(R.string.german_historical_museum_address), getString(R.string.german_historical_museum_phone), getString(R.string.german_historical_museum_hours)));
        places.add(new Place(getString(R.string.berliner_dom), getString(R.string.berliner_dom_d), R.drawable.dom, getString(R.string.berliner_dom_address), getString(R.string.berliner_dom_phone), getString(R.string.berliner_dom_hours)));
        places.add(new Place(getString(R.string.museum_fuer_naturkunde), getString(R.string.museum_fuer_naturkunde_d), R.drawable.naturkundemuseum, getString(R.string.museum_fuer_naturkunde_address), getString(R.string.museum_fuer_naturkunde_phone), getString(R.string.museum_fuer_naturkunde_hours)));
        places.add(new Place(getString(R.string.miniatur_welten), getString(R.string.miniatur_welten_d), R.drawable.loxx, getString(R.string.miniatur_welten_address), getString(R.string.miniatur_welten_phone), getString(R.string.miniatur_welten_hours)));
        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s.
        // The adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in
        // place_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}
