package com.example;

import com.example.beans.Gearbox;
import com.example.beans.Wheels;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
            System.out.println(context.getBean(Gearbox.class));
            System.out.println(context.getBean(Gearbox.class));
            System.out.println(context.getBean(Gearbox.class));
            System.out.println(context.getBean(Gearbox.class));

            System.out.println(context.getBean(Wheels.class));
            System.out.println(context.getBean(Wheels.class));
            System.out.println(context.getBean(Wheels.class));
            System.out.println(context.getBean(Wheels.class));
        }
    }
}
