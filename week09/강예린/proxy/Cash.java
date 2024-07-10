package com.spring.proxy;

public class Cash implements Payment{

    @Override
    @LogExecutionTime
    public void pay(int amount) {
        System.out.println("현금결제: "+ amount);
    }
}
