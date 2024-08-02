package edu.icet.crm;

import edu.icet.crm.model.Student;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

//        value inject through the setter methods
        student.setName("Manoj");
        student.setEmail("manoj@gmail.com");
        student.setContactNo("0715482654");

//        value inject through the constructor
        Student student1 = new Student(
                "Frank",
                "frank@gmail.com",
                "0778745162"
        );

//        builder approach - return the obj through the setter method
        Student student2 = Student.builder()
                .name("Banner")
                .email("Test")
                .contactNo("0451234")
                .build();

        System.out.println(student1);
        System.out.println(student);
        System.out.println(student2);


    }
}