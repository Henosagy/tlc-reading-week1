package com.company;

import java.util.List;

public class Course {
    private Lecturer lecturer;
    private List<Student> studentList;
    private Year year;

    public Course(Lecturer lecturer, List<Student> studentList, Year year) {
        this.lecturer = lecturer;
        this.studentList = studentList;
        this.year = year;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Year getYear() {
        return year;
    }

    public void showStudents(){
        studentList.forEach(t -> System.out.println(t.getName()));
    }

    private void showLectureName(){
        System.out.println(lecturer.getName() + " " + lecturer.getLecture());
    }

    @Override
    public String toString() {
        return "Course{" +
                "lecturer=" + lecturer +
                ", studentList=" + studentList +
                ", year=" + year +
                '}';
    }
}
