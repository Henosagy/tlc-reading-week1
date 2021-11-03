package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {

        List<Student> allStudent = List.of(
                new Student("Henry", 100, Year.First),
                new Student("Bismark", 101, Year.First),
                new Student("Agnes", 102, Year.First),
                new Student("Yaw", 103, Year.First),
                new Student("Ruby", 104, Year.First),
                new Student("Okai", 105, Year.Second),
                new Student("Peter", 106, Year.Second),
                new Student("George", 107, Year.Second),
                new Student("Alfred", 108, Year.Second),
                new Student("Afi", 109, Year.Second),
                new Student("Gloria", 110, Year.Third),
                new Student("Dominica", 111, Year.Third),
                new Student("Essel", 112, Year.Third),
                new Student("Essuman", 113, Year.Third),
                new Student("Emmanuel", 114, Year.Third),
                new Student("Jeffrey", 115, Year.Fourth),
                new Student("Amfonia", 116, Year.Fourth),
                new Student("Akonobea", 117, Year.Fourth),
                new Student("Osei", 118, Year.Fourth),
                new Student("David", 119, Year.Fourth)
        );

        var firstYears = allStudent.stream().filter(s -> s.getYear() == Year.First).collect(Collectors.toList());

        var thirdAndFourthYears = allStudent.stream().
                filter(s -> s.getYear() == Year.Third || s.getYear() == Year.Fourth).collect(Collectors.toList());

        var vowelYears = allStudent.stream().
                filter(s -> s.getName().startsWith("A") || s.getName().startsWith("E") ||
                        s.getName().startsWith("I") || s.getName().startsWith("O") || s.getName().startsWith("U")).
                collect(Collectors.toList());

        var vowel = allStudent.stream().
                filter(s -> s.getName().matches("AEIOU")).
                filter(s -> s.getYear().equals(Year.Fourth)).collect(Collectors.toList());

        var vowelFourthYears = vowelYears.stream().filter(s -> s.getYear() == Year.Fourth).collect(Collectors.toList());

        Course introToProgramming = new Course(new Lecturer("Sowah", Lecture.Programming), firstYears, Year.First);
        Course advancedGardening = new Course(new Lecturer("Percy", Lecture.Gardening), thirdAndFourthYears, Year.Fourth);
        Course advancedPhysics = new Course(new Lecturer("Mills", Lecture.Physics), vowel, Year.Fourth);

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
