package edu.icet.crm.service;

import edu.icet.crm.model.Student;

public class StudentService {

    public Student getStudent(){
        return new Student(
                "Dan",
                "dan@gmail.com",
                "04454815"
        );
    }
}
