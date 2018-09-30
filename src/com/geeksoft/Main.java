package com.geeksoft;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //Lambda Expression =>
        List<Integer> numbers = new ArrayList<>();
        for (int i = 100; i <= 120; i++) {
            numbers.add(i);
        }
        //foreach
        numbers.forEach(System.out::println);
        int result = 0;
        for (int i : numbers) {
            result += i;
        }



        // Streams Example
        List resultList = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        resultList.forEach(System.out::println);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int a) {
        return a % 2 == 0;
    }
}
