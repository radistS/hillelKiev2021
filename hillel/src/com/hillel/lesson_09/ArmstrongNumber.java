package com.hillel.lesson_09;

import java.util.Scanner;

//Напишите Java-программу для проверки является ли введенное число - числом Армстронга.
//Прежде всего, нам нужно понять, что такое число Армстронга. Число Армстронга это число, значение которого
// равно сумме цифр, из которых оно состоит, возведенных в степень, равную количеству цифр в этом числе.
// Как пример - число 371:
//    371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
//
public class ArmstrongNumber {
    public static void main(String[] args) {
//        Scanner cs = new Scanner(System.in);
//        Integer number = cs.nextInt();

//        System.out.println(isArmstrongNumber(number));

        printArmstrongNumber(100);
    }

    private static void printArmstrongNumber(int num){
        int count = 0;
        int gen = 10;
        while (count != num){
            if (isArmstrongNumber(gen++)){
                System.out.println(gen);
                count++;
            }
        }
    }

    private static boolean isArmstrongNumber(int number){
        String str = String.valueOf(number);
        int pow = str.length();
        int total = 0;
        for (String s : str.split("")){
            total += Math.pow(Double.parseDouble(s), pow);
        }
        return total == number;
    }
}
