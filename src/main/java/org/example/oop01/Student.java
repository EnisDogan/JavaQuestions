package org.example.oop01;

public class Student {
    String name;
    String surname;
    int schoolNr;
    String classroom;
    Teacher teacher;

    public Student() {
    }

    public Student(String name, String surname, int schoolNr, String classroom, Teacher teacher) {
        this.name = name;
        this.surname = surname;
        this.schoolNr = schoolNr;
        this.classroom = classroom;
        this.teacher = teacher;
    }

    public Student(String name, String surname, int schoolNr) {
        this.name = name;
        this.surname = surname;
        this.schoolNr = schoolNr;
    }
}
