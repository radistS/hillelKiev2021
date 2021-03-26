package com.hillel.lesson_06.cw;

public class LongShortNumber {
    public static void main(String[] args) {
        // Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        for (String s : args){
            System.out.print(s +  " ");
        }
        System.out.println();

        int minL = Integer.parseInt(args[0]);
        int maxL = Integer.parseInt(args[0]);

        for (String s : args){

            int value = Integer.parseInt(s);

            if (minL > value) minL = value;
            if (maxL < value) maxL = value;
        }

        System.out.println("min -> " + minL );
        System.out.println("max -> " + maxL );

    }
}
