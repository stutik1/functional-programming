package com.programming;

import java.util.List;

public class SquareEvenNumbers {
    public static void squareEvenNumbers(List<Integer> numbers){
        numbers.stream()
                .filter(number-> number %2 ==0)
                .map(number ->number*number)
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Integer> number = List.of(2,5,11,20,7);
        squareEvenNumbers(number);
    }
}
