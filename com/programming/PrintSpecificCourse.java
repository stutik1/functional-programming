package com.programming;

import java.util.List;

public class PrintSpecificCourse {
    public static void printSpecificCourse(List<String> course){
        course.stream()
                .filter(courses -> courses.contains("Spring"))
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<String> courses = List.of("Spring","SpringBoot","AWS","Hibernate","Java","Spring MicroService");
        printSpecificCourse(courses);
    }
}
