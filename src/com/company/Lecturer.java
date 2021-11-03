package com.company;

public class Lecturer {
    private String name;
    private Lecture lecture;

    public Lecturer(String name, Lecture lecture) {
        this.name = name;
        this.lecture = lecture;
    }

    public String getName() {
        return name;
    }

    public Lecture getLecture() {
        return lecture;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", lecture=" + lecture +
                '}';
    }
}
