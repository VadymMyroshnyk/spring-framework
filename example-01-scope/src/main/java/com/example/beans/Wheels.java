package com.example.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Wheels {
    void roll() {
        System.out.println("Wheels are rolling");
    }
}
