package com.geeksoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(17);
        list.add(10);
        list.add(46);
        list.forEach(System.out::println);
        //Example which uses Functional Interface and Lambda Expression
        list.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted list:");
        list.forEach(System.out::println);
    }
}
