package com.hillel.lesson_07.enumer;

public class SearchSystemRun {
    public static void main(String[] args) {
        SearchSystem ss = SearchSystem.GOOGLE;

        System.out.println(ss);

        System.out.println(ss.country());
        System.out.println(ss.rating());
        System.out.println(ss.url());
    }
}
