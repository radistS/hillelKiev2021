package com.hillel.lesson_09.ex;

public class Ex4 {
    public static void main(String[] args) {
        String s = "Hello";
        String t = new String(s);

        if ("Hello".equals(s)) System.out.println(1); //true
        if (t == s) System.out.println(2); //false
        if (t.equals(s)) System.out.println(3); // true
        if ("Hello" == s) System.out.println(4); //true
        if ("Hello" == t) System.out.println(5); //false
    }
}
