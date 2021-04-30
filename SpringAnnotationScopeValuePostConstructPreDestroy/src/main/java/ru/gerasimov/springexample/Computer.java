package ru.gerasimov.springexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//одна зависимость будет зависеть от другой зависимости
//создадим новый класс
@Component //пометим его как бин
public class Computer {
    private int id;
    private MusicPlayer musicPlayer; //зависимость

    @Autowired
    public Computer(MusicPlayer musicPlayer) { //в качестве зависимости в наш компьютер будем передавать только musicPlayer
        this.id = 1;//те id не будет внедрятся Spring'ом
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", musicPlayer=" + musicPlayer.playMusic() +
                '}';
    }
}
