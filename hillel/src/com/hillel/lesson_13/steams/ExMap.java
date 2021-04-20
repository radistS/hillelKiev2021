package com.hillel.lesson_13.steams;

import com.hillel.lesson_13.streamExample.businessObject.User;
import com.hillel.lesson_13.streamExample.businessObject.enumerators.Sex;
import com.hillel.lesson_13.streamExample.businessObject.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ExMap {
    public static void main(String[] args) {
        List<User> users = UserService.getUserList();
        users.forEach(User::print);

        System.out.println("---------");
        List<String> userFullName =
                users
                .stream()
                .filter(u -> u.getSex().equals(Sex.FEMALE))
//                .peek(u-> u.setFullName(u.getFirstName() + " " + u.getLastName()))
//                .map(User::getFullName) // User ->  () -> String
                .map(u -> {
                    u.setFullName(u.getFirstName() + " " + u.getLastName());
                    return u.getFullName();
                }).sorted()
                .collect(Collectors.toList());

        userFullName.forEach(System.out::println);


//        Map<String, User> collect = users.stream()
//                .peek(u -> u.setFullName(u.getFirstName() + " " + u.getLastName()))
//                .collect(Collectors.toMap(User::getFullName, u -> u));
//
//
//        System.out.println(collect);


        OptionalInt average = users.stream().map(User::getAge).mapToInt(Integer::intValue).max();

        System.out.println(average);

    }


}
