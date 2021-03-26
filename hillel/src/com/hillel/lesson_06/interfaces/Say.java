package com.hillel.lesson_06.interfaces;

public interface Say {

    static String str = "test";

    static void draw(){
        System.out.println("print");
    }

    void sayHello();

    default void sayGoodBuy() {
        System.out.println("Good buy default.....");
    }

}
