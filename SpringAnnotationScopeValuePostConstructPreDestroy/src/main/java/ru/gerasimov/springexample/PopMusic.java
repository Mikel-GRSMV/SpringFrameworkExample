package ru.gerasimov.springexample;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("singleton")
//@Scope("prototype")
public class PopMusic implements Music{

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destroy");
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
