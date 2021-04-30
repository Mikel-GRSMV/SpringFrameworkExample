package ru.gerasimov.springexample;

public class RockMusic implements Music{
    @Override
    public String getMusic() {
        return "Maroon 5";
    }

    @Override
    public String getSingerName() {
        return "This Love";
    }
}
