package com.hillel.lesson_07.diamond.ex;

public interface I2 {
    default void p(){
        System.out.println("Int2");
    }

    default void p2(){
        System.out.println("Int2:p2");
    }
}
