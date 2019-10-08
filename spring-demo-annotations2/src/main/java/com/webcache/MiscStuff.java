package com.webcache;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MiscStuff implements IMisc {

    public MiscStuff() {
        System.out.println("Inside MiscStuff constructor");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Predestroy for MiscStuff");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Postconstruct for MiscStuff");
    }


    public String getName() {
        return "Name of MiscStuff";
    }
}
