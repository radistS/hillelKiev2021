package com.rest.example.controller;

import com.rest.example.dto.Student;
import com.rest.example.dto.StudentCreate;
import com.rest.example.service.StudentGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @version 0.0.1
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class StudentController {

    public static List<Student> list = StudentGenerator.studentList();

    @GetMapping("/ping")
    public String ping() {
        return "com/rest/example";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        System.out.println("run GET sudents");
        return list;
    }

    @GetMapping("/student/{uuid}/password")
    public String getStudentsPass(@PathVariable String uuid) {
        return list.stream().filter(s -> s.getId().equals(uuid)).findFirst().get().getPassword();
    }

    @GetMapping("/student/{uuid}")
    public Student getStudents(@PathVariable String uuid) {
        return list.stream().filter(s -> s.getId().equals(uuid)).findFirst().get();
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody StudentCreate studentCreate){
        Student st = StudentGenerator.createStudent(studentCreate);
        list.add(st);
        return st;
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student){
        Student st = list.stream().filter(s -> s.getId().equals(student.getId())).findFirst().get();
        st.setId(student.getId());
        st.setFirstName(student.getFirstName());
        st.setLastName(student.getLastName());
        st.setEmail(student.getEmail());
        return st;
    }

    @DeleteMapping("/student/{uuid}")
    public void deleteStudent(@RequestParam String uuid){
        list = list.stream().filter(s -> !s.getId().equals(uuid)).collect(Collectors.toList());
    }

}
