package com.hillel.lesson_07.diamond.ex;

public class C1 implements I1, I2 {
    @Override
    public void p() {
//        System.out.println("C1");
        I2.super.p();
//        I1.super.p();
    }
}
