package ru.akhaziev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(TypeMusic typeMusic) {

        switch (typeMusic) {
            case ROCK:
                System.out.println("Playing: " + rockMusic.getSong());
                break;
            case CLASSICAL:
                System.out.println("Playing: " + classicalMusic.getSong());
                break;
        }

    }
}
