package com.hillel.lesson_10;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String s = "Мама мыла раму, рама мыла маму";

        Map<String, Integer> wordCount = new HashMap<>();

        s = s.toLowerCase();
        s = s.replace(",", "").replace(".", "").replace("—", "" );

        String[] split = s.split(" ");
        System.out.println("word count = " + split.length);

        for (String word : split){
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }

        System.out.println(wordCount);

        int result = 0;

        for (String key : wordCount.keySet()){
            result += wordCount.get(key);
        }

        System.out.println(result);
        System.out.println(result == split.length);
    }
}
