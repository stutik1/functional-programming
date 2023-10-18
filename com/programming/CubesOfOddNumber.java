package com.programming;

import java.util.List;

public class CubesOfOddNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,5,7,4,6,11);

        numbers.stream()
                .filter(number->number%2 !=0)
                .map(number->number*number*number)
                .forEach(System.out::println);
    }
}
