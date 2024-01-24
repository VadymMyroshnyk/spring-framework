package com.example;

import com.example.beans.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();

        SpringBean springBean = context.getBean(SpringBean.class);

        System.out.println(springBean.getAppFileProperty());
        System.out.println(springBean.getJavaHome());
        System.out.println(springBean.getAdditionResult());
        System.out.println(springBean.getCityName());
        System.out.println(springBean.getCurrentDate());
        System.out.println(springBean.getJavaHomeSpel());
    }
}
