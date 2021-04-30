package ru.gerasimov.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
//    @Autowired
//    private Music music;
//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
    //или
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
    //или вообще внедряем только переменную

    //попробуем внедрить сразу две зависимости в наш MusicPlayer c помощью аннотации


//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public void playMusic (){
//        System.out.println("Playing: " + music.getMusic());
//        System.out.println("Singer name: " + music.getSingerName());
//    }
    //попробуем внедрить сразу две зависимости в наш MusicPlayer c помощью аннотации
    private PopMusic popMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(PopMusic popMusic, RockMusic rockMusic) {
        this.popMusic = popMusic;
        this.rockMusic = rockMusic;
    }
    public String playMusic(){
        return "Playing: " + popMusic.getMusic();
//        System.out.println("Playing: " + popMusic.getMusic());
//        System.out.println("Singer name: " + popMusic.getSingerName());
//        System.out.println("Playing: " + rockMusic.getMusic());
//        System.out.println("Singer name: "+ rockMusic.getSingerName());
    }
}
