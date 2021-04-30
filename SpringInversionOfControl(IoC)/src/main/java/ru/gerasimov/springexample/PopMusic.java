package ru.gerasimov.springexample;

public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Rember the time";
    }

    @Override
    public String getSingerName() {
        return "Michael Jackson";
    }
}
