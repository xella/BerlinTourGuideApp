package com.example.xella.berlintourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.botanical_garden), getString(R.string.botanical_garden_d), R.drawable.botanischergarten, getString(R.string.botanical_garden_address), getString(R.string.botanical_garden_hours)));
        places.add(new Place(getString(R.string.tiergarten), getString(R.string.tiergarten_d), R.drawable.tiergarten, getString(R.string.tiergarten_address), getString(R.string.tiergarten_hours)));
        places.add(new Place(getString(R.string.tempelhofer_feld), getString(R.string.tempelhofer_feld_d), R.drawable.tempelhoferfeld, getString(R.string.tempelhofer_feld_address), getString(R.string.tempelhofer_feld_hours)));
        places.add(new Place(getString(R.string.mauerpark), getString(R.string.mauerpark_d), R.drawable.mauerpark, getString(R.string.mauerpark_address), getString(R.string.mauerpark_hours)));
        places.add(new Place(getString(R.string.park_am_gleisdreieck), getString(R.string.park_am_gleisdreieck_d), R.drawable.parkamgleisdreieck, getString(R.string.park_am_gleisdreieck_address), getString(R.string.park_am_gleisdreieck_hours)));
        places.add(new Place(getString(R.string.viktoriapark), getString(R.string.viktoriapark_d), R.drawable.viktoriapark, getString(R.string.viktoriapark_address), getString(R.string.viktoriapark_hours)));
        places.add(new Place(getString(R.string.britzer_garten), getString(R.string.britzer_garten_d), R.drawable.britzergarten, getString(R.string.britzer_garten_address), getString(R.string.britzer_garten_hours)));
        places.add(new Place(getString(R.string.gaerten_der_welt), getString(R.string.gaerten_der_welt_d), R.drawable.gartenderwelt, getString(R.string.gaerten_der_welt_address), getString(R.string.gaerten_der_welt_hours)));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s.
        // The adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(this, places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in
        // place_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
