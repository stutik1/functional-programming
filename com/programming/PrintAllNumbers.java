package com.programming;

import java.util.List;

public class PrintAllNumbers {
    public static void print(int number) {
        System.out.println(number);
    }
    public static void printAllNumbersInListStructured(List<Integer> numbers) {
        numbers.stream().forEach(PrintAllNumbers::print);
    }
//        for (int number:numbers);
//        System.out.println(numbers);
//    }

    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12,9,13,4,23,20,27));
    }

}
