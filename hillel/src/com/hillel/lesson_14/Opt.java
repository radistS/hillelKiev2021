package com.hillel.lesson_14;

import java.util.List;
import java.util.Optional;

public class Opt {
    public static void main(String[] args) {

        List<Double> list = List.of(1.0, 2.0, 3.0, 4.0);
        list = null;

        Double o =  Optional.ofNullable(list)
                    .orElse(List.of(0.0))
                    .stream()
                    .mapToDouble(Double::doubleValue)
                    .average().orElse(0.0);


        System.out.println(o);

        }

    }
