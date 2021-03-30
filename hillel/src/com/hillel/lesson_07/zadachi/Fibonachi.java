package com.hillel.lesson_07.zadachi;

// Выведите на экран первые n членов последовательности Фибоначчи.
public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(fibon(50));
    }

    private static int fibon(int n){
        if (n == 0 || n == 1 ) return 1;
        return fibon(n - 1) + fibon( n - 2);
    }
}
