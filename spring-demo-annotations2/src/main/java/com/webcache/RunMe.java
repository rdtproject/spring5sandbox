package com.webcache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class RunMe {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applContext.xml");
        IMisc misc = applicationContext.getBean("miscStuff", IMisc.class);

        System.out.println(misc.getName());
    }

}
