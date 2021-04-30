package com.rest.example.service;

import com.rest.example.dto.Student;
import com.rest.example.dto.StudentCreate;
import org.apache.catalina.User;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudentGenerator {

    /**
     *
     * @return
     */
    public static List<Student> studentList() {
        List<Student> students = new ArrayList<>();

        students.add(new Student(UUID.randomUUID().toString(), "Ivan", "Ivanov")
                .setEmail("Ivan.Ivanov@hellil.com").setPassword(generatePassword()));
        students.add(new Student(UUID.randomUUID().toString(), "Petr", "Petrov")
                .setEmail("Pert.Petrov@hellil.com").setPassword(generatePassword()));
        students.add(new Student(UUID.randomUUID().toString(), "Sidr", "Sidorov")
                .setEmail("Sidr.Sidorov@hellil.com").setPassword(generatePassword()));

        return students;
    }

    /**
     * Generate new student
     *
     * @param firstName - FN
     * @param lastName - LN
     * @return {@link List} of {@link Student}
     */
    public static Student getStudent(String firstName, String lastName){
        Student st =  new Student(UUID.randomUUID().toString(), firstName, lastName);
        return st.setEmail(generateEmail(st)).setPassword(generatePassword());
    }

    public static Student createStudent(StudentCreate student){
        return getStudent(student.getFirstName(), student.getLastName());
    }


    private static String generateEmail (Student user){
        return user.getLastName().concat(".").concat(user.getFirstName()).concat("@hillel.com");
    }

    private static String generatePassword(){
        return RandomStringUtils.randomAlphabetic(8);
    }
}
