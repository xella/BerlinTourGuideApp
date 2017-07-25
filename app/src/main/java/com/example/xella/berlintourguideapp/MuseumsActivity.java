package com.example.xella.berlintourguideapp;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("German Museum of Technology", getString(R.string.german_museum_of_technology_d), R.drawable.deutschestechnikmuseum_, "Trebbiner Straße 9, 10963 Berlin", "+49 30 90254-0","9AM - 5:30PM"));
        places.add(new Place("German Historical Museum", getString(R.string.german_historical_museum_d), R.drawable.historicalmuseum, "Unter den Linden 2, 10117 Berlin", "+49 30 20304-0","10AM - 6PM"));
        places.add(new Place("Berlin Cathedral", getString(R.string.berliner_dom_d), R.drawable.dom,"Am Lustgarten, 10178 Berlin", "+49 30 20269136", "11AM - 4PM"));
        places.add(new Place("Museum für Naturkunde", getString(R.string.museum_fuer_naturkunde_d), R.drawable.naturkundemuseum, "Invalidenstraße 43, 10115 Berlin","+49 30 20938591", "9:30AM - 6PM"));
        places.add(new Place("LOXX Miniatur Welten Berlin", getString(R.string.miniatur_welten_d), R.drawable.loxx, "Grunerstraße 20, 10179 Berlin"));

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
