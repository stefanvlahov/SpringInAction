package com.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by stefanvlahov on 12/9/16.
 */
@Component
public class SgtPeppers implements CompactDisc {


    public void play() {
        String title = "Sgt. Pepper's Lonely Hearts Club Band";
        String artist = "The Beatles";
        System.out.println("Playing " + title + " by " + artist);
    }
}
