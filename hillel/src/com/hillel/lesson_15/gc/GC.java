package com.hillel.lesson_15.gc;

import com.hillel.lesson_12.exception.ThrowsException;

import java.util.Objects;

public class GC {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== START ===");
        Person person = new Person("User 1");
        Person person1 = new Person("User 2");

        person = null;
        person1 = null;

        System.gc();

        Thread.sleep(10_000);

        System.out.println(Objects.nonNull(person));
        System.out.println(Objects.nonNull(person1));

        System.out.println("=== FINISH ==");
    }
}
