package com.hillel.lesson_11;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;


@Getter
@ToString
@Accessors(chain = true)
public class User {
    @Setter
    @ToString.Exclude
    private int id;
    @Setter
    private String lastName;
    @Setter
    private String firstName;
    @Setter
    private String email;
    @Setter
    @ToString.Exclude
    private String phone;
}
