package com.webcache.noxmlconfig;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class John implements IDriver {

    @Override
    public String getName() {
        return "John";
    }

    public John() {
        System.out.println("Constructor from John class");
    }

    @PostConstruct
    public void postC() {
        System.out.println("PostConstruct from John class");
    }

    @PreDestroy
    public void preDe() {
        System.out.println("PreDestroy from John class");
    }

}
