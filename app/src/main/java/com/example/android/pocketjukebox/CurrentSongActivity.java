package com.example.android.pocketjukebox;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CurrentSongActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_song);

        //TextView variables
        TextView currentArtist = (TextView) findViewById(R.id.artist);

        TextView currentTitle = (TextView) findViewById(R.id.song_title);

        //receiver intent from Available songs activity with string variables
        Intent addSong = getIntent();
        String addArtist = addSong.getStringExtra("artist");
        String addTitle = addSong.getStringExtra("title");

        //Set string variables from intent to TextViews
        currentArtist.setText(addArtist);
        currentTitle.setText(addTitle);

        //onClickListener for Home Screen button
        Button home = (Button) findViewById(R.id.home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goHome = new Intent(CurrentSongActivity.this, MainActivity.class);
                startActivity(goHome);
            }
        });
    }
}
