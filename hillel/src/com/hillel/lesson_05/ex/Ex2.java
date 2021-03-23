package com.hillel.lesson_05.ex;

public class Ex2 {
    public static void main(String[] args)  {
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);


        // int poll = -128 .. 127
        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);

        // string poll
        String str = "test";
        String str1 = new String("test");
        str1 = str1.intern(); // add to string pool

        System.out.println(str == str1); //  link
        System.out.println(str.equals(str1)); // value

    }
}
