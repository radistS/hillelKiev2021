package com.hillel.lesson_14.tasksStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task04 {
    // В некотором предложении текста слова заданной длины заменить указанной подстрокой,
    // длина которой может не совпадать с длиной слова.
    public static void main(String[] args) {
        String text = """
                	Далеко-далеко за словесными горами в стране гласных и согласных живут рыбные тексты. Вдали от всех живут они в буквенных домах на берегу Семантика большого языкового океана. Маленький ручеек Даль журчит по всей стране и обеспечивает ее всеми необходимыми правилами. Эта парадигматическая страна, в которой жаренные члены предложения залетают прямо в рот. Даже всемогущая пунктуация не имеет власти над рыбными текстами, ведущими безорфографичный образ жизни. Однажды одна маленькая строчка рыбного те
                """;

        String subString = "TEST_VALUE";
        int worldLength = 6;
        int number = 254;

        String[] split = text.split("\\. ");

        if (number >= split.length)
            throw new RuntimeException("Text shotter...");

        List<String> collect = Arrays.stream(split[number - 1].split(" "))
//                .filter(s -> s.length() == worldLength)
                .map(s -> {
                            if (s.length() == worldLength)
                                s = subString;
                            return s;
                        }

                ).collect(Collectors.toList());

        StringBuilder tempText = new StringBuilder();

        collect.forEach(s -> tempText.append(s).append(" "));

        split[number - 1] = tempText.toString();

        StringBuilder result = new StringBuilder();


        Arrays.stream(split).forEach(s -> result.append(s).append(". "));

        System.out.println(result.toString().trim());

    }
}
