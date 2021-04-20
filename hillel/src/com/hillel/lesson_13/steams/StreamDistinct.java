package com.hillel.lesson_13.steams;

import com.hillel.lesson_13.streamExample.businessObject.User;
import com.hillel.lesson_13.streamExample.businessObject.service.UserService;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDistinct {
    public static void main(String[] args) {

//        List<String> collect = List.of("1", "2", "1", "4", "1", "6", "1", "8", "1")
//                .stream()
//                .distinct()
//                .collect(Collectors.toList());
//
//        collect.forEach(System.out::println);
//
//        System.out.println("");
//
//        Set<String> collectSet = List.of("1", "2", "1", "4", "1", "6", "1", "8", "1")
//                .stream()
//                .collect(Collectors.toSet());
//
//        collectSet.forEach(System.out::println);

        // list users (age, name, address)

        List<User> users = UserService.getUserList();

//   users.forEach(System.out::println);

        users.stream()
                .sorted((u1, u2) -> u1.getAge().compareTo(u2.getAge()))
//                .peek(System.out::println)
//                .takeWhile(u -> u.getAge() < 15)
                .dropWhile(u -> u.getAge() < 15)
//                .filter(u -> u.getAge() < 15)
                .forEach(System.out::println);

    }
}
