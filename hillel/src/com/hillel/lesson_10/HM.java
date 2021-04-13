package com.hillel.lesson_10;

import java.util.HashMap;
import java.util.Map;

public class HM {

    public static void main(String[] args) {
        Map<String, String> sMap = new HashMap<>();

        System.out.println(sMap.size());

        System.out.println(sMap.put("one", "oneone"));

        System.out.println(sMap.size());

        System.out.println(sMap.get("one"));

        System.out.println(sMap.containsKey("one"));
        System.out.println(sMap.containsKey("one1"));

        System.out.println(sMap.containsValue("oneone"));
        System.out.println(sMap.containsValue("oneone1"));

        System.out.println(sMap.remove("one"));

        System.out.println(sMap.size());

        System.out.println(sMap.containsKey("one"));


        sMap.put(null, "NULL");
        System.out.println(sMap.get(null));
        sMap.put(null, "null");
        System.out.println(sMap.get(null));


        sMap.put("1", "1");
        System.out.println(sMap.get("1"));
        sMap.put("1", "11");
        System.out.println(sMap.get("1"));


    }
}
