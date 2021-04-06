package com.hillel.lesson_08.set;

import java.util.HashSet;
import java.util.Set;

public class HSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.add("One"));
        System.out.println(set.add("Two"));
        System.out.println(set.add("Three"));
        System.out.println(set.add("Three"));
        System.out.println(set.add("Four"));
        System.out.println(set.add("Five"));
        System.out.println(set.add("Six"));

        System.out.println(set.size());

        for (String atr : set) System.out.println(atr);


    }
}
