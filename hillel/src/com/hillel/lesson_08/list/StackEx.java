package com.hillel.lesson_08.list;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println(stack.add("One"));
        System.out.println(stack.add("Two"));
        stack.add(0, "Three");

        System.out.println(stack.toString());

        System.out.println("----------");
        // [ stack -> element]
        System.out.println(stack.peek()); // take without remove from top
        System.out.println(stack);
        System.out.println(stack.pop()); // take and remove from top
        System.out.println(stack);

//        //  [element -> stack]
//        stack.push("Four");
//        stack.add("Five");
//        System.out.println(stack);
//        System.out.println(stack.peek());

    }
}
