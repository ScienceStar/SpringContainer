package com.example.springbootcontainer.component;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn(value = "test01")
public class Test02 {
    @PostConstruct
    public void init() {
        System.out.println("2：" + Test01.HELLO);
    }

    public Test02() {
        System.out.println("2：" + Test01.WORLD);
    }
}
