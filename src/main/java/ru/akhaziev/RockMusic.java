package ru.akhaziev;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {

    List<String> rockSongs = new ArrayList<>();

    public RockMusic() {
        rockSongs.add("Rock song 1");
        rockSongs.add("Rock song 2");
        rockSongs.add("Rock song 3");
    }

    @Override
    public String getSong() {
        Random random = new Random();
        int numberOfSong = random.nextInt(rockSongs.size());
        return rockSongs.get(numberOfSong);
    }
}

