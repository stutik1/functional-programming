package com.programming;

import java.util.List;

public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,4,6,10,50);
        numbers.stream()
                .map(number->number*number)
                .forEach(System.out::println);
    }
}
