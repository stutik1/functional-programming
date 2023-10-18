package com.programming;

import java.util.List;

public class PrintAllCourse {
    public static void printAllCourseByLambda(List<String> course){
        course.stream()
        .forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<String> courses = List.of("Spring","Spring Boot","AWS","Hibernate","Java");
        printAllCourseByLambda(courses);
    }
}
