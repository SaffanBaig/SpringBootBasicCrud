package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student saffan = new Student(
                    "Saffan",
                    "saffan@gmail.com",
                    LocalDate.of(1998, NOVEMBER, 5)
            );
            Student arsalan = new Student(
                    "Arsalan",
                    "arsalan@gmail.com",
                    LocalDate.of(1997, NOVEMBER, 5)
            );
            repository.saveAll(
                    List.of(saffan, arsalan)
            );

        };
    }
}
