package com.programming;

import java.util.List;

public class PrintSpecificSize {
    public static void printSpecificSize(List<String> course){
        course.stream()
                .filter(courses->courses.length() >=4)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<String> course = List.of("Spring","Spring Boot","AWS","Hibernate","Java");
        printSpecificSize(course);
    }
}
