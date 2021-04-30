package com.rest.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Student {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    @JsonIgnore
    private String password;

    public Student() {
    }

    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }
}
