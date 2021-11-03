package com.company;

public class Student {
    private String name;
    private int studentID;
    private Year year;

    public Student(String name, int studentID, Year year) {
        this.name = name;
        this.studentID = studentID;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public Year getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", year=" + year +
                '}';
    }
}
