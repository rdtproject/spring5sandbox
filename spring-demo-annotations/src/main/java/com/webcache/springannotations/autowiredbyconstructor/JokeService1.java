package com.webcache.springannotations.autowiredbyconstructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JokeService1 implements IJoke {

    @Value("${joke.good}")
    private String fortuneText;


}
