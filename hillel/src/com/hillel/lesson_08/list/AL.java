package com.hillel.lesson_08.list;

import java.util.ArrayList;
import java.util.List;

public class AL {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        System.out.println(al.isEmpty());
        System.out.println(al.size());

        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");

        System.out.println(al.isEmpty());
        System.out.println(al.size());

        for (String s : al) System.out.print(s + " ");
        System.out.println();

        al.add(1, "add");

        for (String s : al) System.out.print(s + " ");
        System.out.println();

        al.add(2, null);

        for (String s : al) System.out.print(s + " ");
        System.out.println();


        al.remove(null);
        for (String s : al) System.out.print(s + " ");
        System.out.println();

        al.add("aa");
        al.add("aa");
        al.add("12");
        al.add("13");
        for (String s : al) System.out.print(s + " ");
        System.out.println();

        al.removeIf(s -> s.length() > 1);
        for (String s : al) System.out.print(s + " ");
        System.out.println();

    }
}
