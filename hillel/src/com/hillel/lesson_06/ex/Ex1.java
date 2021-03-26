package com.hillel.lesson_06.ex;

public class Ex1 {
    public static void main(String[] args) {
        Salmon s = new Salmon();
        System.out.println(s.getCount());
    }
}

class Salmon{
    private int count; // 0 default value

    public Salmon() {
//        count = 4;
        this.count = 4;
    }

    public int getCount() {
        return count;
    }
}
