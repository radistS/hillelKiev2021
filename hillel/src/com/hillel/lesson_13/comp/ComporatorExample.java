package com.hillel.lesson_13.comp;

import com.hillel.lesson_13.streamExample.businessObject.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComporatorExample {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User("Ivan"));
        userList.add(new User("Sveta"));
        userList.add(new User("Anna", "",34));
        userList.add(new User("Alex", "1",12));
        userList.add(new User("Alex", "12",43));
        userList.add(new User("Alex", "3",43));
        userList.add(new User("Petr", "",44));

        Comparator<User> userComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };

        Comparator<User> ageComparator = Comparator.comparing(User::getAge);

        Comparator<User> lastNameComporator = (User u1, User u2) -> u1.getLastName().compareTo(u2.getLastName());

        userList.forEach(u -> System.out.println(u));
        System.out.println();

        userList.sort(userComparator.thenComparing(ageComparator.thenComparing(lastNameComporator)));

//        userList.sort(ageComparator.thenComparing(userComparator));

        userList.forEach(System.out::println);
    }
}


