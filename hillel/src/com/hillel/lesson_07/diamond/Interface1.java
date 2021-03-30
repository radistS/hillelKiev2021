package com.hillel.lesson_07.diamond;

public interface Interface1 {
    default void print() {
        System.out.println("Interface 1");
    }

    void print1();

    void print2();

    void print3();
}
