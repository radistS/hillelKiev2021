package com.hillel.lesson_12.exception;

public class TF {
    public static void main(String[] args) {
        validate();
    }

    private static void validate() {
        try {
            System.out.println("1");
            throw new RuntimeException();
//            System.exit(1);



        } finally {
            System.out.println("2");
        }

    }
}


