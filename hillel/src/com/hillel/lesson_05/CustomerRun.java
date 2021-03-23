package com.hillel.lesson_05;

public class CustomerRun {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = c1;
        c1.setBlock(true);
        System.out.println(c1.toString());
        System.out.println(Integer.toHexString(c1.hashCode()));
        System.out.println(c2.toString());
        System.out.println(Integer.toHexString(c2.hashCode()));
        System.out.println(c3.toString());
        System.out.println(Integer.toHexString(c3.hashCode()));
        System.out.println("----------");
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

    }
}
