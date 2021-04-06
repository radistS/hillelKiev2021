package com.hillel.lesson_08;

public class ExtArray {
    public static void main(String[] args) {
        String[] str = new String[10];

        for (int i = 0; i < 20; i++){
            if (i >= str.length){
                String[] strNew = new String[i + (i >> 1)];
                for (int j = 0; j < i; j++) {
                    strNew[j] = str[j];
                }
                str = strNew;
            }
            str[i] = Integer.valueOf(i).toString();

        }

        for (String s : str) System.out.println(s);
    }
}