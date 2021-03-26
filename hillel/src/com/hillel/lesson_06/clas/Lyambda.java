package com.hillel.lesson_06.clas;

public class Lyambda {
    public static void main(String[] args) {
        Logger log = (s) -> System.out.println("message : " + s);

        log.log("a");
        log.log("3");
        log.log("4");

        log = (s) -> System.out.println("message update : " + s);

        log.log("a");
        log.log("3");
        log.log("4");
    }
}
