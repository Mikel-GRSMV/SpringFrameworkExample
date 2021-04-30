package ru.gerasimov.springexample;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getMusic());
        System.out.println("Singer name: " + music.getSingerName());
    }
}
