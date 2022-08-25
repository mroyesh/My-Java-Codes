package com.streamCodes;

import java.util.Arrays;
import java.util.List;

public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 34, 56, 77, 8);
        list.forEach(System.out::println);
        //list.forEach(x-> System.out.println(x));

        System.out.println("Filter");
        List<Integer> numbers = Arrays.asList(1, 2, 1, 2, 3, 4, 1, 2, 4, 5, 3, 6);
        System.out.println("-------------------");

        numbers.stream().filter(p -> p % 2 == 0).forEach(System.out::println);

        System.out.println("********************   Distinct  ****************");

        numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);


        System.out.println("Limit");

        list.stream().filter(i -> i % 2 == 0).limit(1).forEach(System.out::println);

        System.out.println("Skip");

        list.stream().filter(i -> i % 2 == 0).skip(1).forEach(System.out::println);


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);

        System.out.println("Map");
        list1.stream().filter(i -> i % 2 == 0).map(i -> i * 10).forEach(System.out::println);
        list1.stream().map(e->e*3).forEach(System.out::println);


        System.out.println("---------------------------------------------------");
        list.stream().map(number -> number * 2).filter(i -> i % 2 == 0).forEach(System.out::println);

        System.out.println("-----------------------------------------------------");

        List<String> words = Arrays.asList("Java", "Apple", "Honda", "Developer");
        System.out.println(words.stream().count());



    }
}
