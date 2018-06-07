package com.example.android.pocketjukebox;



public class Song {
    //String value
    private String mArtist;
    //String value
    private String mTitle;

    //Constructor method takes two String parameters
    public Song(String artist, String title) {
        mArtist = artist;
        mTitle = title;
    }

    //accessor aka "getter" methods
    public String getArtist(){
        return mArtist;
    }

    public String getTitle() {
        return mTitle;
    }


}
