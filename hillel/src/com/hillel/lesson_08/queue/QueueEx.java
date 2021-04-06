package com.hillel.lesson_08.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueEx {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("One");
        deque.add("Two");
        deque.add("Three");
//        deque.add(null);


        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.toString());

    }
}
