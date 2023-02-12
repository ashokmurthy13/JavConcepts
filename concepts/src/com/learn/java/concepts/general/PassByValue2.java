package com.learn.java.concepts.general;

public class PassByValue2 {

    public static void main(String[] args) {
        Student student = new Student("Ashok", 25);
        int marks = 25;
        reviewStudent(student, marks);
        System.out.println(marks + "-" + student.marks);
    }

    public static void reviewStudent(Student student, int marks) {
        marks = marks + 10;
        student.marks += marks;
    }
}

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

