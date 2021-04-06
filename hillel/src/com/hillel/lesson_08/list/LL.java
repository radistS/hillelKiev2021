package com.hillel.lesson_08.list;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList();

        ll.add("a");

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        ll.add("bb") ;

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());


        System.out.println(ll.contains("a"));
        System.out.println(ll.contains("cc"));
    }
}
