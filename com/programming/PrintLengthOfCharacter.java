package com.programming;

import java.util.List;

public class PrintLengthOfCharacter {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring","SpringBoot","AWS","Hibernate","Java","Spring MicroService");

        courses.stream()
                .map(course->course + " :" + course.length())
                .forEach(System.out::println);
    }
}
