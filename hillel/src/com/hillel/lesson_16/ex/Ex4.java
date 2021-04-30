package com.hillel.lesson_16.ex;

public class Ex4 {
    public static void main(String[] args) {
        String str = "BEVERAGEGREEFTE" ;
//        String str = "BEVERAGE" ;
        String [] arr = str.split( "E", 7  );
        System. out .println(String. join ( "." , arr));
    }
}

