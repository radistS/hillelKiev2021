package com.hillel.lesson_06.interfaces;

public class Engl implements Say{
    @Override
    public void sayHello() {
        System.out.println("Say hello en ...");
    }

    @Override
    public void sayGoodBuy() {
        System.out.println("@Override : goodbuyb en ...");
    }
}
