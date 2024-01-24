package com.example.java.config.context.beans;

public class SpringBean1 {

    private final SpringBean2 springBean2;
    private final SpringBean3 springBean3;

    public SpringBean1(SpringBean2 springBean2, SpringBean3 springBean3) {
        this.springBean2 = springBean2;
        this.springBean3 = springBean3;
    }

    public void printDependencies() {
        System.out.println("List of dependencies for " + getClass().getSimpleName());
        System.out.println(springBean2.getClass().getSimpleName());
        System.out.println(springBean3.getClass().getSimpleName());
    }
}
