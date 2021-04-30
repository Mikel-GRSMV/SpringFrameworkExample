package ru.gerasimov.springexample;

public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

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

    public MusicPlayer() {}
    public void setMusic(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playin: " + music.getMusic());
        System.out.println("Singer name: " + music.getSingerName());
    }
}
