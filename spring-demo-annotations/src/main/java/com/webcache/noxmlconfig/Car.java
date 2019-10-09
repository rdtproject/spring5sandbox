package com.webcache.noxmlconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Car implements IVehicle {

    @Autowired
    private IDriver driver;

    public Car() {
        System.out.println("Constructor from Car class");
    }

    @PostConstruct
    public void postC() {
        System.out.println("PostConstruct from Car class");
    }

    @PreDestroy
    public void preDe() {
        System.out.println("PreDestroy from Car class");
    }

    public String getName() {
        return "Car";
    }

    public String getDriversName() {
        return driver.getName();
    }


}
