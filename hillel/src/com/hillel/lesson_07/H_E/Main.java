package com.hillel.lesson_07.H_E;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("1","2", 2);
        Student student2 = new Student("1","2", 2);

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student1.equals(student2));
        System.out.println(student1 == student2);
    }
}
