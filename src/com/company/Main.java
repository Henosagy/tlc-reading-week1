package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Student student1= new Student("Henry", 100, Year.First);
        Student student2= new Student("Bismark", 101, Year.First);
        Student student3= new Student("Agnes", 102, Year.First);
        Student student4= new Student("Yaw", 103, Year.First);
        Student student5= new Student("Ruby", 104, Year.First);
        Student student6= new Student("Okai", 105, Year.Second);
        Student student7= new Student("Peter", 106, Year.Second);
        Student student8= new Student("George", 107, Year.Second);
        Student student9= new Student("Alfred", 108, Year.Second);
        Student student10= new Student("Afi", 109, Year.Second);
        Student student11= new Student("Gloria", 110, Year.Third);
        Student student12= new Student("Dominica", 111, Year.Third);
        Student student13= new Student("Essel", 112, Year.Third);
        Student student14= new Student("Essuman", 113, Year.Third);
        Student student15= new Student("Emmanuel", 114, Year.Third);
        Student student16= new Student("Jeffrey", 115, Year.Fourth);
        Student student17= new Student("Amfonia", 116, Year.Fourth);
        Student student18= new Student("Akonobea", 117, Year.Fourth);
        Student student19= new Student("Osei", 118, Year.Fourth);
        Student student20= new Student("David", 119, Year.Fourth);


        List<Student> firstYears = Arrays.asList(student1,student2,student3,student4,student5);
        List<Student> secondYears = Arrays.asList(student6,student7,student8,student9,student10);
        List<Student> thirdYears = Arrays.asList(student11,student12,student13,student14,student15);
        List<Student> fourthYears = Arrays.asList(student16,student17,student18,student19,student20);

        List<Student> thirdAndFourthYears = Stream.concat(thirdYears.stream(), fourthYears.stream()).collect(Collectors.toList());
        List<Student> vowelFourthYears = fourthYears.stream().
                filter(t -> t.getName().startsWith("A") || t.getName().startsWith("E") || t.getName().startsWith("I") ||
                        t.getName().startsWith("O") || t.getName().startsWith("U")).collect(Collectors.toList());

        Course introToProgramming = new Course(new Lecturer("Sowah", Lecture.Programming), firstYears, Year.First);
        Course advancedGardening = new Course(new Lecturer("Percy", Lecture.Gardening), thirdAndFourthYears, Year.Fourth);
        Course advancedPhysics = new Course(new Lecturer("Mills", Lecture.Physics), vowelFourthYears, Year.Fourth);

        System.out.println("Intro to Programming Students");
        System.out.println("===============================");
        introToProgramming.showStudents();

        System.out.println("===============================");
        System.out.println("Advanced Gardening Students");
        System.out.println("===============================");
        advancedGardening.showStudents();

        System.out.println("===============================");
        System.out.println("Advanced Physics Students");
        System.out.println("===============================");
        advancedPhysics.showStudents();

    }
}
