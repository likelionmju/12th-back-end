package org.springframework.samples.petclinic.proxy;//package com.example.hello_spring.proxy;
//
//import org.springframework.util.StopWatch;
//
//public class CreditCard implements Payment {
//    Payment cash = new Cash();
//
//    @Override
//    public void pay(int amount) {
//        if (amount > 100) {
//            System.out.printf(amount + "신용 카드");
//        } else {
//            cash.pay(amount);
//        }
//    }
//}
