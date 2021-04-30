package ru.gerasimov.springexample;

public class MusicPlayer {
    private Music music;

    private String name;//название нашего плеера
    private int volume;//громкость

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

    //    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    public MusicPlayer() {}

    public void setMusic(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getMusic());
        System.out.println("Singer Name: " + music.getSingerName());
    }
}
