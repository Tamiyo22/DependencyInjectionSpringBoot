package com.project.spring.DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal {

    public void speak() {
        System.out.println("Woof");
    }
}
