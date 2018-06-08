package com.example.android.pocketjukebox;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AvailableSongsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.available_songs_activity);

        //Create ArrayList of songs
        final ArrayList<Song> tracks = new ArrayList<Song>();
        tracks.add(new Song("Billy Squier", "The Stroke"));
        tracks.add(new Song("The Jam", "A Town Called Malice"));
        tracks.add(new Song("Imagine Dragons", "Shots"));
        tracks.add(new Song("Joe Satriani", "Ice 9"));
        tracks.add(new Song("Johnny Cash", "Folsom Prison Blues"));
        tracks.add(new Song("Arctic Monkeys", "Do I Wanna Know"));
        tracks.add(new Song("The Crystal Method", "Comin Back"));
        tracks.add(new Song("The Newsboys", "Shine"));
        tracks.add(new Song("Hot Chocolate", "Everyone's a Winner"));
        tracks.add(new Song("Earth, Wind, and Fire", "September"));
        tracks.add(new Song("Stevie Ray Vaughn", "Tightrope"));
        tracks.add(new Song("Mercy Me", "I Can Only Imagine"));
        tracks.add(new Song("Lenny Kravitz", "Let Love Rule"));
        tracks.add(new Song("The Who", "Bargain"));
        tracks.add(new Song("Brooke Frazer", "Shadowfeet"));
        tracks.add(new Song("Massive Attack", "Unfinished Sympathy"));
        tracks.add(new Song("Tina Turner", "You Better Be Good To Me"));

        //Create the ArrayAdapter using context and ArrayList as parameters
        final SongAdapter adapter = new SongAdapter(this, tracks);

        //Find ListView in Activity
        final ListView listView = (ListView) findViewById(R.id.List);

        //Make ListView display list items using ArrayAdapter
        //Call setAdapter method to make this happen
        listView.setAdapter(adapter);

        //OnItemClickListener for song list
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song selectedSong = adapter.getItem(position);
                Intent i = new Intent(AvailableSongsActivity.this, CurrentSongActivity.class);
                i.putExtra("artist", selectedSong.getArtist());
                i.putExtra("title", selectedSong.getTitle());
                startActivity(i);
            }
        });



    }
}
