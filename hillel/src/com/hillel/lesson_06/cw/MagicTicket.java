package com.hillel.lesson_06.cw;

import java.util.Scanner;

/*
    Input: 54585
    Output: false

    Input: 123231
    Output: true
*/

public class MagicTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(value);

        String strValue = String.valueOf(value);

        if (strValue.length() % 2 != 0)
            System.out.println(false);
        else {
            String[] split = strValue.split("");

            int left = 0;
            int right = 0;

            for (int i = 0; i < split.length /2; i++){
                left += Integer.parseInt(split[i]);
                right += Integer.parseInt(split[split.length - i - 1]);
            }
            System.out.println(left == right);
        }
        }

    }

