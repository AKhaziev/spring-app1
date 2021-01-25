package ru.akhaziev;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {

    List<String> classicalSongs = new ArrayList<>();

    public ClassicalMusic() {
        classicalSongs.add("Classical song 1");
        classicalSongs.add("Classical song 2");
        classicalSongs.add("Classical song 3");
    }

    public String getSong() {
        Random random = new Random();
        int numberOfSong = random.nextInt(classicalSongs.size());
        return classicalSongs.get(numberOfSong);
    }
}
