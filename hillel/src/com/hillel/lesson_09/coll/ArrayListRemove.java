package com.hillel.lesson_09.coll;

import java.util.Arrays;

public class ArrayListRemove {
    public static void main(String[] args) {
//        String[] str = {"1","2","3","4","5","6","7","8"}; // size 8
//
//        // remove by index
        int index = 3;
//        System.out.println(Arrays.deepToString(str));
//        System.arraycopy(str, index +1, str, index, str.length - index - 1 ); // size 7
//        str[str.length - 1] = null;
//        System.out.println(Arrays.deepToString(str));
//
//
//        String[] str1 = {"1","2","8","3","4","5","6","7","8"};
//        // remove by value
//        String value = "8";
//        for (int i = 0; i < str1.length; i++){
//            if (str1[i].equals(value)) {
//                index = i;
//                break;
//            }
//        }
//
//        System.out.println(Arrays.deepToString(str1));
//        System.arraycopy(str1, index +1, str1, index, str1.length - index - 1 ); // size 7
//        str1[str1.length - 1] = null;
//        System.out.println(Arrays.deepToString(str1));


        //remove all values
        String[] str1 = {"1","2","8","3","4","5","6","7","8"};
        String[] str2 = new String[str1.length];

        // remove by value
        int count = 0;
        String value = "8";
        System.out.println(Arrays.deepToString(str1));
        for (String s : str1) {
            if (!s.equals(value))
                str2[count++] = s;
        }
        System.out.println(Arrays.deepToString(str2));

    }
}
