package com.hillel.lesson_11;

public class UserRun {
    public static void main(String[] args) {
        User user = new User()
                .setId(1)
                .setFirstName("Alex")
                .setLastName("Stepurko")
                .setEmail("test@email.com")
                .setPhone("+380505544558");

        System.out.println(user);
    }
}
