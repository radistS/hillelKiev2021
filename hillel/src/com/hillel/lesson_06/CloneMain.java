package com.hillel.lesson_06;

public class CloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest ct = new CloneTest(12);

        CloneTest c = (CloneTest) ct.clone();

        CloneTest c1 = ct;

        System.out.println(ct.i);
        System.out.println(c.i);

        System.out.println("----------");

        System.out.println(ct);
        System.out.println(c);

        ct.i = 13;

        System.out.println(ct.pet);
        System.out.println(c.pet);

    }
}
