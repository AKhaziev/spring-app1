package ru.akhaziev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(firstMusicPlayer);
        firstMusicPlayer.playMusic();
        System.out.println("-----------------------------------------------------");
        System.out.println(secondMusicPlayer);
        secondMusicPlayer.playMusic();
        System.out.println("-----------------------------------------------------");
        System.out.println(firstMusicPlayer == secondMusicPlayer);
        System.out.println("-----------------------------------------------------");
        firstMusicPlayer.setVolume(10);
        System.out.println("Volume of first MusicPlayer = " + firstMusicPlayer.getVolume());
        System.out.println("Volume of second MusicPlayer = " + secondMusicPlayer.getVolume());
        System.out.println("-----------------------------------------------------");
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("musicClassicalBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        context.close();
    }
}
