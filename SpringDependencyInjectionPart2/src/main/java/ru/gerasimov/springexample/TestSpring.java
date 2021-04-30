package ru.gerasimov.springexample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = context.getBean("popMusicBean", PopMusic.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);//создали объект и передали исполнителя

        MusicPlayer musicPlayer = context.getBean("popMusicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();

    }
}
