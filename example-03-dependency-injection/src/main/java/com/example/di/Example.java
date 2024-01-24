package com.example.di;

class ServiceA {


}

class ServiceB {

    public ServiceA serviceA;

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}

public class Example {

    public static void main(String[] args) {
        ServiceA serviceA = new ServiceA();

        ServiceB serviceB = new ServiceB();
        serviceB.serviceA = serviceA;
    }
}
