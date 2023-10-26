package com.example.springbootcontainer.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test01 {
    public static String HELLO;

    public static String WORLD;


    @Value("${spring.test.hello}")
    public void setHELLO(String HELLO) {
        Test01.HELLO = HELLO;
    }

    @Value("${spring.test.world}")
    public void setWORLD(String WORLD) {
        Test01.WORLD = WORLD;
    }
}
