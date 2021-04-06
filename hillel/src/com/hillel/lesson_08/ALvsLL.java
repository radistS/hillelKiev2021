package com.hillel.lesson_08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ALvsLL {
    public static void main(String[] args) {

        // 1_000_000 in center
        // 1 -> 100_000
        // AL vs LL ????

        // 1. find center : AL - O(1)   LL - O(n)
        // 2. input       : AL - O(n)   LL - O(1)

        List<String> al = new ArrayList<>();
        List<String> ll = new LinkedList<>();

        // collection initialization
        for (int x = 0; x < 1_000_000; x++) {
            al.add("str" + x);
        }

        for (int x = 0; x < 1_000_000; x++) {
            ll.add("str" + x);
        }

        System.out.println("AL size -> " + al.size());
        System.out.println("LL size -> " + ll.size());


        System.out.println(" ======  Array list : result ======");
        long start = System.currentTimeMillis();
        for (int x = 0; x < 10_000; x++) {
            if (x %  1000 == 0) System.out.print("#");
            al.add(al.size()/2,  "str_add_" + x);
        }
        System.out.println();
        System.out.println("AL size -> " + al.size());
        System.out.println("execution time -> " + (System.currentTimeMillis() - start));

        System.out.println(" ======  Linked list : result ======");
        start = System.currentTimeMillis();
        long tmp = start;
        for (int x = 0; x < 10_000; x++) {
            if (x %  1000 == 0) System.out.print("#");
            ll.add(ll.size()/2, "str_add_" + x);
        }
        System.out.println();
        System.out.println("LL size -> " + ll.size());
        System.out.println("execution time -> " + (System.currentTimeMillis() - start));

    }
}
