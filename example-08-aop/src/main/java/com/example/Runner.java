package com.example;

import com.example.beans.HelloBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();

        HelloBean helloBean = context.getBean(HelloBean.class);

        System.out.println(helloBean.formatData("John", "Doe"));

//        try {
//            helloBean.saveData(null);
//        } catch (Exception ignored) {
//            // ignored on purpose
//        }
    }
}
