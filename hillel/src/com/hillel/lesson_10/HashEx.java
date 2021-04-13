package com.hillel.lesson_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class HashEx {
    public static void main(String[] args) {
        Map<User, String> map = new HashMap<>();

        User user = new User("alex", "37");

        map.put(user, "value");

        System.out.println(map.get(user));

        user.setName("fedya");

        System.out.println(map.get(user));

    }
}

class User{
    String name;
    String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserL{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}




