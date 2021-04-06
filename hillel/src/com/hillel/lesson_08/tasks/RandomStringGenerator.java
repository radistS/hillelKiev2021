package com.hillel.lesson_08.tasks;

import java.util.Random;

public class RandomStringGenerator {
    private static String str = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++){
            System.out.println(strGenerator(4));
        }
    }

    public static String strGenerator(int n){
        Random random = new Random();
        String cs = "";
        for (int i = 0; i < n; i++){
            cs = cs.concat(String.valueOf(str.charAt(random.nextInt(str.length()))));
        }
        return cs;
    }
}
