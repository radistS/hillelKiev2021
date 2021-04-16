package com.hillel.lesson_12.exception;

public class Exc {
    public static void main(String[] args) {
        System.out.println(1);
        if(true)
            throw new RuntimeException();
        System.out.println(2);
    }
}
