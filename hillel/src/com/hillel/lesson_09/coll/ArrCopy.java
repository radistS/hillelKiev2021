package com.hillel.lesson_09.coll;

public class ArrCopy {
    public static void main(String[] args) {
        int index = 3;

        String[] str1 = new String[6];
        String[] str2 = new String[10];
        String[] str3 = new String[10];


        str1[0] = "1";
        str1[1] = "2";
        str1[2] = "3";
        str1[3] = "4";
        str1[4] = "5";

        for (String s : str1) System.out.print(s + " ");

        // расширение массива
       System.arraycopy(str1, 0, str2, 0, str1.length);
       System.out.println();
       for (String s : str2) System.out.print(s + " ");

       // подготовка места для вставки
       System.arraycopy(str1, index, str2, index + 1, 5 - index);
       System.out.println();
       for (String s : str2) System.out.print(s + " ");
       str2[index] = "100";
       System.out.println();
       for (String s : str2) System.out.print(s + " ");

      }
}
