package com.hillel.lesson_13.optional;


import com.hillel.lesson_13.streamExample.businessObject.User;

import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        User user = new User();


        User opt = Optional.ofNullable(user).orElse(new User());

        User opt1 = Optional.ofNullable(user).orElseGet(Example::print);

        User opt2 = Optional.ofNullable(user).orElseThrow(() -> new RuntimeException("message"));


        User u1 = Optional.ofNullable(opt2).map(us -> {
            us.setAge(23);
            us.setFirstName("Alex");
            return us;
        }).get();

        System.out.println(u1);

        User uz = new User("test");

        User u2= Optional.ofNullable(opt2)
                .map(u -> uz).get();

        User u4 = new User();
        u4.setAge(50);

        u2 = Optional.of(u4).filter(u -> u.getAge() > 18).orElse(new User());
//
        System.out.println(user);
        System.out.println(u1);
        System.out.println(u2);
////        System.out.println(opt);
////        System.out.println(opt1);
////        System.out.println(opt2);

    }


    public static User  print(){
        System.out.println("test message");
        return new User();
    }
}
