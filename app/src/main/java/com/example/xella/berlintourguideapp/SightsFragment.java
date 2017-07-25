package com.example.xella.berlintourguideapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, parent, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.east_side_gallery), getString(R.string.east_side_gallery_d), R.drawable.eastsidegallery, getString(R.string.east_side_gallery_address)));
        places.add(new Place(getString(R.string.brandenburg_gate), getString(R.string.brandenburg_gate_d), R.drawable.brandenburgertor, getString(R.string.brandenburg_gate_address)));
        places.add(new Place(getString(R.string.alexanderplatz), getString(R.string.alexanderplatz_d), R.drawable.alexanderplatz, getString(R.string.alexanderplatz_address)));
        places.add(new Place(getString(R.string.unter_den_linden), getString(R.string.unter_den_linden_d), R.drawable.unterdenlinden, getString(R.string.unter_den_linden_address)));
        places.add(new Place(getString(R.string.fernsehturm), getString(R.string.fernsehturm_d), R.drawable.tvtower ,getString(R.string.fernsehturm_address)));
        places.add(new Place(getString(R.string.berlin_hbf), getString(R.string.berlin_hbf_d), R.drawable.hauptbahnhof, getString(R.string.berlin_hbf_address)));
        places.add(new Place(getString(R.string.siegessauele), getString(R.string.siegessauele_d), R.drawable.siegessaeule, getString(R.string.siegessauele_address)));
        places.add(new Place(getString(R.string.hackescher_hoefe), getString(R.string.hackescher_hoefe_d), R.drawable.hackeschermarkt, getString(R.string.hackescher_hoefe_address)));
        places.add(new Place(getString(R.string.oberbaum_bruecke), getString(R.string.oberbaum_bruecke_d), R.drawable.oberbaumbruecke, getString(R.string.oberbaum_bruecke_address)));

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
