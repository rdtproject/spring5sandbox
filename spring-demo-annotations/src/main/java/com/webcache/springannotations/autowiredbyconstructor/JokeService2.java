package com.webcache.springannotations.autowiredbyconstructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JokeService2 implements IJoke {

    @Value("${joke.bad}")
    private String fortuneText;

}
