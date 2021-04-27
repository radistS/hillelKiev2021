package com.hillel.lesson_15;

import com.hillel.lesson_13.streamExample.businessObject.User;

public class Calculate  {
    public static void main(String[] args) {

        Operation operation = (x) -> x * x;

        int result = operation.calculate(10);
        System.out.println(operation.calculate(12));
        System.out.println(result); //30
        Operation operation1 = (x) -> {
            int a = x;
            return a;
        };

        System.out.println(operation1.calculate(15));

        Print print = () -> System.out.println("print");
        print.print();

        {
            print = () -> System.out.println("print from block");
            print.print();
        }

        print.print();

////        System.out.println(operation.calculate(13));
//
//        User uz = new User();
//
//        Usr usr = (u) -> uz;

    }
}


interface Operation {
    int calculate(int x);
}

@FunctionalInterface
interface Print {
    void print();
}


@FunctionalInterface
interface Usr {
    User mod(User user);
}

