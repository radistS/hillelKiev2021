package com.mvn.test;

import java.util.Scanner;

// 1 + 2
// 2 - 3
// 5 / 4
// 10 * 4
public class Run {
    public static void main(String[] args) {
        System.out.println("Calculator -----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("first value :");
        int a = sc.nextInt();
        System.out.println("+ - / *");
        String d = sc.next();
        System.out.println("second value : ");
        int b = sc.nextInt();

        validateOperation(b, d);

        System.out.println(calculate(a, b, d));

    }

    private static int calculate (int a, int b, String d) {
        switch (d){
            case "+": return a + b;
            case "-": return a - b;
            case "/": return a / b;
            case "*": return a * b;
            default: return -1;

        }
    }

    private static void validateOperation(int b, String d){
        if (d.equals("/") && b == 0) {
            System.out.println("Unsupported operation ...");
            System.exit(-1);
        }
    }
}
