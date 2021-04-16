package com.hillel.lesson_12.validator;

public class UserValidator {

    void validate (User user){
        System.out.println(1);
        //step 1
        if (!user.getEmail().contains("@")){
            throw new EmailException("email not valid ...");
        }

        System.out.println(2);
        //step 2
        if (user.getAge() < 18) {
            throw new AgeException(user.getAge().toString());
        }
        System.out.println(3);

        // step 3
        if (!user.getCountry().toLowerCase().equals("ukraine")){
            throw new RuntimeException("incorrect country");
        }
        System.out.println(4);
    }
}
