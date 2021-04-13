package com.hillel.lesson_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(5, 0.75f);

        map.put("one", "one");
        map.put("two", "two");
        map.put("four", "two_1");
        map.put(null, "two_1");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> e : entries){
            System.out.println(e.getKey() + " >>> " + e.getValue());
        }
        System.out.println();

        for (String s : map.keySet()){
            System.out.println(s + " >>> " + map.get(s));
        }
        System.out.println();

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}

