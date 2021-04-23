package com.hillel.lesson_14.tasksStreams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;

public class Task02 {

    public Task02() {
    }

    //    Во всех вопросительных предложениях текста найти и напечатать без повторений слова заданной длины.
    public static void main(String[] args) {

        String text = "Привет. Как дела? Хорошо. Как как погода? Нормально. Когда в гости?";

        String[] split = text.split("\\?");

        System.out.println(Arrays.deepToString(split));

        int length = 3;

        Set<String> str = new HashSet<>();
        Arrays.stream(split)
                .map(s -> s.split("\\.")[s.split("\\.").length - 1])
                .collect(Collectors.toList())
                .forEach(e -> {
                    Arrays.stream(e.split(" "))
                            .filter(s-> s.length()==length)
                            .forEach(s -> str.add(s.toLowerCase(Locale.ROOT)));
                });


        System.out.println(str);
    }
}
