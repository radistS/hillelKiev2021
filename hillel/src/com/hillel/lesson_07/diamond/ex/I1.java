package com.hillel.lesson_07.diamond.ex;

public interface I1 {
    default void p(){
        System.out.println("Int1");
    }

    default void p1(){
        System.out.println("Int1:p1");
    }
}
