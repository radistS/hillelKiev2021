package com.hillel.lesson_08.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ALandLL {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        LinkedList<String> linked = new LinkedList<>();


        array.add("Str");
        linked.add("Str");


        array.add(1, null);
        linked.add(1, null);

        System.out.println(array.isEmpty());
        System.out.println(linked.isEmpty());

        array.remove(null);
        linked.remove(null);

        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());
    }
}
