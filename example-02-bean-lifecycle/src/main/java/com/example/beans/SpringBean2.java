package com.example.beans;

import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PreDestroy;

public class SpringBean2 implements DisposableBean {

    @PreDestroy
    public void preDestroy() {
        System.out.println(getClass().getSimpleName() + "::preDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(getClass().getSimpleName() + "::destroy");
    }

    public void destroyMethod() {
        System.out.println(getClass().getSimpleName() + "::destroyMethod");
    }
}
