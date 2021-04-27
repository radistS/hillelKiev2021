package com.hillel.lesson_15;

public class Singletone {

    private static Singletone instanse;
    private String value;

    private Singletone(String value) {
        this.value = value;
    }

    public static Singletone getInstance(String value){
        if (instanse == null){
            instanse = new Singletone(value);
        }
        return instanse;
    }

    public String getValue() {
        return value;
    }
}
