package com.shivansh.first.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L,
                        "Shivansh",
                        "shivanshbansal21@gmail.com",
                        LocalDate.of(2003, Month.SEPTEMBER, 29),
                        21));
    }
}
