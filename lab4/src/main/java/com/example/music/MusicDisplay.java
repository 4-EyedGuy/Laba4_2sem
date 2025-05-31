package com.example.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicDisplay {

    @Qualifier("rock")
    @Autowired
    private MusicGenre genre;

    public MusicDisplay() {

    }

    public void show() {
        System.out.println("Now playing: " + genre.getType());
    }

    public void init() {
        System.out.println("MusicDisplay initialized!");
    }

    public void cleanup() {
        System.out.println("MusicDisplay destroyed!");
    }

    public void setGenre(MusicGenre genre) {
        this.genre = genre;
        System.out.println("Genre injected via setter: " + genre.getType());
    }
}
