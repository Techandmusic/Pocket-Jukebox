package com.example.android.pocketjukebox;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs){
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //Check is the existing view is being reused, if not then inflate the view
        View songListItem = convertView;
        if (songListItem == null){
            songListItem = LayoutInflater.from(getContext()).inflate(R.layout.song_list_item, parent, false);
        }
        //get the current song object at this position in the list
        Song currentSong = getItem(position);
        //find the textview in song_list_item.xml with ID artist
        TextView artist = (TextView) songListItem.findViewById(R.id.artist);
        //Get the artist name from the current song object
        //then set the text on this view
        artist.setText(currentSong.getArtist());

        //find the TextView in song_list_item.xml with ID title
        TextView title = (TextView) songListItem.findViewById(R.id.title);
        //Get the title from the current song
        //and set the text on this view
        title.setText(currentSong.getTitle());

        //return the list item with 2 text views
        return songListItem;
    }
}
