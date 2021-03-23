package com.hillel.lesson_05.ex;

public class Ex3 {
    public static void show() {
        System.out.println("Static method called");
    }

    public void showNonStatic(){
        System.out.println("Non static method call ");
    }

    public static void main(String[] args) {
        Ex3 obj = null;
        obj.show();

        Ex3.show();

        Ex3 e = new Ex3();
        e.showNonStatic();
    }
}
