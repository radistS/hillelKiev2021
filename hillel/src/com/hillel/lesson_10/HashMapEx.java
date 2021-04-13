package com.hillel.lesson_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(16, 0.75f); // 13 -> 32 bucket

        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        System.out.println(map.size());

        System.out.println(map.containsKey("k1"));
        System.out.println(map.containsValue("v1"));

        System.out.println("--------");
        System.out.println(map.get("k1"));
        System.out.println(map.remove("k1"));
        System.out.println(map.get("k1"));
        System.out.println("-------");
        System.out.println(map.get("k2"));
        map.put("k2", "v3");
        System.out.println(map.get("k2"));

//        map.put(null, null);
        map.put(null, "aaaa");

        System.out.println(map.get(null));

    }


}
