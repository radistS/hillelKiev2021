package com.hillel.lesson_15;

public class SingletoneRun {
    public static void main(String[] args) throws InterruptedException {

        Singletone instance = Singletone.getInstance("5");
        System.out.println(instance.getValue());

        Singletone s = Singletone.getInstance("10");

        System.out.println(s.getValue());

        instance = null;
        s = null;

        System.gc();

        Thread.sleep(10000);

        instance = Singletone.getInstance("15");
        System.out.println(instance.getValue());

    }
}
