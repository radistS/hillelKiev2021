package com.hillel.lesson_06.ex;

public class Ex2 {
    public static void main(String[] args) {
        int x = 0;

        while (x++ < 10){  // while false
//            System.out.println(x);
        }

        String message = x > 10 ? "Grather than" : "false";
        System.out.println(message+","+x);
    }
}
