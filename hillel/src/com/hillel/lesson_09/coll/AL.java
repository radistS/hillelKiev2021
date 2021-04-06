package com.hillel.lesson_09.coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AL {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(); // 10

        ArrayList arrList = new ArrayList(15); // 15

        List<Integer> listInteger = new ArrayList<>();

        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);

        int a = 0;
        Integer b = 2;

        System.out.println();

        System.out.println(listInteger);

        System.out.println(listInteger.remove(a));
        System.out.println(listInteger);
        System.out.println(listInteger.remove(b));
        System.out.println(listInteger);

        int c = 1_000_000;
    }
}
