package com.hillel.lesson_08.ex;

public class Ex5 {
    private final static String RESULT ="2cfalse";
    public static void main(String[] args) {
        String a = "";
        a += 2; //2
        a += 'c'; //2c
        a += false; // 2cfalse

        a = a.intern(); // put to string poll
        if (a == RESULT) System.out.println("=="); // ==
        if (a.equals(RESULT)) System.out.println("equals"); // equals
    }
}
