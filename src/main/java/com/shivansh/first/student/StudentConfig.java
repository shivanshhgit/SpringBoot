package com.shivansh.first.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student shivansh = new Student("Shivansh",
                    "shivanshbansal21@gmail.com",
                    LocalDate.of(2003, Month.SEPTEMBER, 29),
                    21);
            Student testStudent = new Student("TestStudent",
                    "teststudent@gmail.com",
                    LocalDate.of(2003, Month.SEPTEMBER, 29),
                    21);
            studentRepository.saveAll(List.of(shivansh, testStudent));
        };
    }
}
