package com.soundsystem;

import org.springframework.context.annotation.Bean;
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

    @Bean
    public CompactDisc randomBeatlesCD() {
        int choice = (int) Math.floor(Math.random() * 4);
        if (choice == 0) {
            return new SgtPeppers();
        } else {
            return new WhiteAlbum();
        }
    }
}