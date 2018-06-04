package com.example.android.pocketjukebox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find button add songs
        Button addSong = (Button) findViewById(R.id.add_button);

        //set onClick listener with intent to navigate to list of available songs
        addSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addIntent = new Intent(MainActivity.this, AvailableSongsActivity.class);
                //start the new activity
                startActivity(addIntent);
            }
        });


    }
}
