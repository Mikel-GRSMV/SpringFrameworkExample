package ru.gerasimov.springexample;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getMusic() {
        return "This love";
    }

    @Override
    public String getSingerName() {
        return "Maroon 5";
    }
}
