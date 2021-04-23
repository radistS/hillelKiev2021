package com.hillel.lesson_14.tasksStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Task01 {
    //  Вывести все предложения заданного текста в порядке возрастания количества слов в каждом из них.
    public static void main(String[] args) {

        String text = "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq. a11. b22 b33. vwefsd. csdfsd dsdfs. dsdfsfsfsddfsdfsdfsdfsd d d. vfsdfsdfsdfsdfsd v v v v. d d.";

        Arrays.stream(text.split("\\. "))
                .sorted(Comparator.comparing(s -> (s.split(" ").length))).sorted()
                .forEach(System.out::println);



//st.replaceAll("\\p{P}", "")






    }
}
