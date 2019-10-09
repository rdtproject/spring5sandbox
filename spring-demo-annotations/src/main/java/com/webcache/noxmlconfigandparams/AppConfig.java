package com.webcache.noxmlconfigandparams;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Defining methods to expose the beans in Java config
 * Same pojos, dopiero tutaj zamienia sie je w managed beans
 * Nazwy metod to IDENTIFIKATORY BEANOW po ktorych bedzie mozna je znalezc
 */

@Configuration
//@ComponentScan("com.webcache.noxmlconfig2")
@PropertySource("classpath:noxmlconfigresources/sport.properties")
public class AppConfig {

    // define bean for sad fort service
    @Bean
    public IFortuneService sadOrWhatever() {
        return new SadFortuneService();
    }

    // define bean for swim coach and inject dependency
    @Bean
    public ICoach swimSrim() {
        return new SwimCoach(sadOrWhatever());
    }
}
