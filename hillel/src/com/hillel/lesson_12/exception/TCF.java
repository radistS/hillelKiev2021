package com.hillel.lesson_12.exception;

public class TCF {

    public static void main(String[] args) {
        try{
            System.out.println(1);
            throw new NullPointerException();
        }
        catch (Exception e){
            System.out.println(2);
        }
        finally {
            System.out.println(3);
        }
    }

}
