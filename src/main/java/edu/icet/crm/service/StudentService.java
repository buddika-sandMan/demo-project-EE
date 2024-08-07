package edu.icet.crm.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Student getStudent(){
        return new Student(
                "Dan",
                25,
                "dan@gmail.com",
                "04454815"
        );
    }
}
