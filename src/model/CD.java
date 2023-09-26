/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author patella2
 */
public class CD extends Item{

    private String artist;
    private int noOfTracks;

    // Constructor
    public CD(String title, String artist, int tracks, String playingTime, boolean gotIt, String comment) {
        super(title, playingTime, gotIt, comment);
        this.artist = artist;
        this.noOfTracks = tracks;
    }

    public int getNoOfTracks() {
        return noOfTracks;
    }

    public void setNoOfTracks(int noOfTracks) {
        this.noOfTracks = noOfTracks;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    // Overriding the display method
    @Override
    public String display() {
        return super.display() + ", Artist: " + artist + ", Tracks: " + noOfTracks;
    }
}
