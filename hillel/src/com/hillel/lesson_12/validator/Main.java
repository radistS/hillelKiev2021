package com.hillel.lesson_12.validator;

public class Main {
    public static void main(String[] args) {

        try {
            new UserValidator().validate(new
                    User("aa@a.com", 72, "ukraine"));
        } catch (AgeException | EmailException ex) {
            System.out.println(ex.getMessage());
        }
    }
}