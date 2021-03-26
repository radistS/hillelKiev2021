package com.hillel.lesson_06.interfaces;

public class Rus implements Say{

    @Override
    public void sayHello() {
        System.out.println("Привет ...");
    }

    @Override
    public void sayGoodBuy() {
        System.out.println("Пока ...");
    }

//    public void print(){
//        System.out.println("print rus");
//    }
//
//    @Override
//    public void sayHello() {
//        System.out.println("Привет rus ...");
//    }
}
