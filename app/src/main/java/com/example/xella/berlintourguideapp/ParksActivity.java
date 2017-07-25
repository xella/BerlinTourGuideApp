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
        places.add(new Place("Botanical Garden", getString(R.string.botanical_garden_d), R.drawable.botanischergarten, "Königin-Luise-Straße 6-8, 14195 Berlin","9AM - 6PM"));
        places.add(new Place("Tiergarten", getString(R.string.tiergarden_d), R.drawable.tiergarten, "Straße des 17. Juni 100, 10557 Berlin","24/7"));
        places.add(new Place("Tempelhofer Field", getString(R.string.tempelhofer_feld_d), R.drawable.tempelhoferfeld, "Tempelhofer Damm, 12101 Berlin","6AM - 10:30PM"));
        places.add(new Place("Mauerpark", getString(R.string.mauerpark_d), R.drawable.mauerpark, "Gleimstraße 55, 10437 Berlin","24/7"));
        places.add(new Place("Park am Gleisdreieck", getString(R.string.park_am_gleisdreieck_d), R.drawable.parkamgleisdreieck, "Möckernstraße 26, 10963 Berlin","24/7"));
        places.add(new Place("Viktoriapark", getString(R.string.viktoriapark_d), R.drawable.viktoriapark, "Kreuzbergstraße 15, 10965 Berlin","24/7"));
        places.add(new Place("Britzer Garten", getString(R.string.britzer_garten_d), R.drawable.britzergarten, "Sangerhauser Weg 1, 12349 Berlin","9AM - 7:30PM"));
        places.add(new Place("Gärten der Welt", getString(R.string.gaerten_der_welt_d), R.drawable.gartenderwelt, "Eisenacher Str. 99, 12685 Berlin","9AM - 8PM"));

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
