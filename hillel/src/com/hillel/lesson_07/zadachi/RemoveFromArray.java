package com.hillel.lesson_07.zadachi;

public class RemoveFromArray {
    //  Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива
    // (пропусков быть не должно). 1 2 3 4 5 6 4 5 4 (4) -> 1 2 3 5 6 5
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 4, 4, 6, 7, 4};
        for (int i : mass){
            System.out.print(i + " ");
        }
        System.out.println();
        mass = removeFromArray2nd(mass, 4);
//        for (int i : mass){
//            System.out.print(i + " ");
//        }
    }

    public static int[] removeFromArray(int[] in, int value){
        int count = 0;
        for (int i : in){
            if (i == value) count++;
        }

        int[] newMass = new int[in.length - count];
        int tmp = 0;
        for (int i = 0; i < in.length; i++){
            if (in[i] != value){
                newMass[tmp++] = in[i];
            }
        }
        return newMass;
    }

    public static int[] removeFromArray2nd(int[] in, int value){
        int tmp = in.length;
        for (int i = 0; i < tmp; i++){
           if (in[i] == value){
               in[i--] = in[--tmp];
           }
        }

        for (int i : in){
            System.out.print(i + " ");
        }
        return null;
    }
}
