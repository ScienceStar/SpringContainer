package com.example.springbootcontainer.component;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    @Autowired
    private B b;

    public A(){
        System.out.println("执行A的构造函数，此时b还未被注入，b=" + b);
    }

    @PostConstruct
    public void init(){
        System.out.println("@PostConstruct注解此方法，会在对象b注入完成之后自动调用此方法，b=" + b);
    }
}
