package com.hillel.lesson_08.set;

import java.util.Set;
import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet();

        set.add(12);
        set.add(1);
        set.add(5);
        set.add(3);
        set.add(2);
        set.add(7);

        System.out.println(set);

        Set<String> stringSet = new TreeSet<>();

        stringSet.add("one");
        stringSet.add("One");
        stringSet.add("oNe");
        stringSet.add("two");
        stringSet.add("tWo");
        stringSet.add("Two");

        System.out.println(stringSet);

    }
}
