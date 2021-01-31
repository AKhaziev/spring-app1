package ru.akhaziev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

//    private ClassicalMusic classicalMusic;
//    @Autowired
//        private Music music;
//    private List<Music> musicList = new ArrayList<>();

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

//    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    //    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC
//    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic) {
//        this.classicalMusic = classicalMusic;
//    }

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }

//    public MusicPlayer() {
//    }
//
//        public void setMusic(Music music) {
//        this.music = music;
//    }
//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }

    public String playMusic() {
//        for (Music music : musicList) {
//            System.out.println(music);
        return "Playing: " + classicalMusic.getSong();
//        System.out.println("Playing: " + rockMusic.getSong());
//        }
    }
}
