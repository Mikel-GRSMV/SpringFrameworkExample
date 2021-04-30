package ru.gerasimov.springexample;

import org.springframework.stereotype.Component;

@Component //здесь id будет rockMusic с маленькой буквы
public class RockMusic implements Music{
    @Override
    public String getMusic() {
        return "This Love";
    }

    @Override
    public String getSingerName() {
        return "Maroon 5";
    }
}
