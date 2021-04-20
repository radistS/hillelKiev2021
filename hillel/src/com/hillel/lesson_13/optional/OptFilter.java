package com.hillel.lesson_13.optional;

import com.hillel.lesson_13.streamExample.businessObject.User;

import java.util.Optional;

public class OptFilter {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(17);

        User user1 = Optional.of(user).filter(u -> u.getAge() < 18).orElse(new User());

        System.out.println(user1);
    }

}
