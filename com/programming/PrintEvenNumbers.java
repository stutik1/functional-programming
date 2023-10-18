package com.programming;

import java.util.List;

public class PrintEvenNumbers {
    public static void printEvenNumbers(List<Integer> numbers){
        for (int number : numbers)
            if(number%2 ==0){
                System.out.println(number);
            }
    }


    public static boolean isEven(int number){
        return number%2==0;
    }
    public static void printEvenNumbersByFunctional(List<Integer> numbers){
        numbers.stream().filter(PrintEvenNumbers::isEven)
                .forEach(System.out::println);
    }

    public static void printEvenNumbersByLambdaExpression(List<Integer> numbers){
        numbers.stream().filter(number -> number%2==0)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> number =List.of(12,9,13,4,23,20,27,2,8);
        //printEvenNumbers(number);
        //printEvenNumbersByFunctional(number);
        printEvenNumbersByLambdaExpression(number);
    }
}
