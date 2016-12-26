package com.soundsystem;

/**
 * Created by stefanvlahov on 12/19/16.
 */
public class WhiteAlbum implements CompactDisc {

    public void play() {
        String title = "Let It Be";
        String artist = "The Beatles";
        System.out.println("Playing " + title + " by " + artist);
    }
}
