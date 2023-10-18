package com.programming;

import java.util.List;

public class PrintOddNumber {
    public static void printOddNumberByLambdaExpression(List<Integer> numbers){
        numbers.stream().filter(number -> number %2 !=0)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Integer> number =List.of(12,9,13,4,23,20,27,2,8);
        printOddNumberByLambdaExpression(number);
    }
}
