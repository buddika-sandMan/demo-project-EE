package edu.icet.crm.controller;

import edu.icet.crm.model.Student;
import edu.icet.crm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
public class studentContoller {

    @Autowired
    StudentService studentService;

    @GetMapping("/get-student")
    public Student getStudent(){
        Student student = studentService.getStudent();
        System.out.println(student);
        return student;
    }

    @GetMapping("/get-allstudents")
    public List<Student> getStudents(){
        StudentService studentService = new StudentService();
        Student student = studentService.getStudent();
        Student student2 = studentService.getStudent();
        System.out.println(student);
        return Arrays.asList(student,student2);
    }
}
