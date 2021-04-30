package ru.gerasimov.springexample;

public class PopMusic implements Music{
    private PopMusic(){}//ограничим создание объектов класса при помощи слова new

    //это фыбричный метод будет возвращать объект класса PopMusic
    public static PopMusic getPopMusic(){//и теперь когда пользователь вызовет это фабричный метод он получит новый объект
        return new PopMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getMusic() {
        return "Remeber the time";
    }
    @Override
    public String getSingerName() {
        return "Michael Jackson";
    }
}
