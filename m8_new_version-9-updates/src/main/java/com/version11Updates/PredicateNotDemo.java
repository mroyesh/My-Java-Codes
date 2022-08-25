package com.version11Updates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotDemo  {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10, 12, 14);

        Predicate<Integer> even = i -> i % 2 == 0;
        //Predicate<Integer> odd = i -> i % 2 != 0;
        Predicate<Integer>odd = Predicate.not(even);
        List<Integer> evenNumbers= list.stream().filter(Predicate.not(even)).collect(Collectors.toList());


    }
}
