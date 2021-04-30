package ru.gerasimov.springexample;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{
    @Override
    public String getMusic() {
        return "Remeber the time";
    }

    @Override
    public String getSingerName() {
        return "Michael Jackson";
    }
}
