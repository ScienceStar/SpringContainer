package com.example.springbootcontainer.component;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderComponent2 {

    @Order(1)
    void show1(){
        System.out.println("执行Test01类");
    }

    @Order(2)
    void show2(){
        System.out.println("执行Test01类");
    }
}
