package com.example.xella.berlintourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.salsabil), getString(R.string.salsabil_d), getString(R.string.salsabil_address), getString(R.string.price_cheap), getString(R.string.salsabil_phone), getString(R.string.salsabil_hours)));
        places.add(new Place(getString(R.string.dolores), getString(R.string.dolores_d), getString(R.string.dolores_address), getString(R.string.price_cheap), getString(R.string.dolores_phone), getString(R.string.dolores_hours)));
        places.add(new Place(getString(R.string.bep_viet), getString(R.string.bep_viet_d), getString(R.string.bep_viet_address), getString(R.string.price_medium), getString(R.string.bep_viet_phone), getString(R.string.bep_viet_hours)));
        places.add(new Place(getString(R.string.zweistrom_land), getString(R.string.zweistrom_land_d), getString(R.string.zweistrom_address), getString(R.string.price_medium), getString(R.string.zweistrom_phone), getString(R.string.zweistrom_hours)));
        places.add(new Place(getString(R.string.khushi), getString(R.string.khushi_d), getString(R.string.khushi_address), getString(R.string.price_expensive), getString(R.string.khushi_phone), getString(R.string.khushi_hours)));

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
