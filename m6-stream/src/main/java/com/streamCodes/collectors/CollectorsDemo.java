package com.streamCodes.collectors;

import com.streamCodes.tasks.Dish;
import com.streamCodes.tasks.DishData;
import com.streamCodes.tasks.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 6, 9, 8, 9);

        // toCollection(Supplier) : is used to create a collection using Collector
        List<Integer> numberList = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        System.out.println("---------------------------------------------------------");

        Set<Integer> numberSet = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        System.out.println("To List ------------------------------------------------------");


        //toList()

        List<Integer> numberList2 = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(numberList2);

        System.out.println("To Set  ----------------------------------------------");

        Set<Integer> numberSet2 = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
        System.out.println(numberSet2);

        // toMap(Function, Function): return a Collector interface that gather the input data int a new map

        Map<String, Integer> dishMap = DishData.getAll().stream().collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        System.out.println(dishMap);


        //summingInt(toIntFunction) : returns a Collector that produces tha sum of an Integer-valued function

        Integer sum = DishData.getAll().stream().collect(Collectors.summingInt(Dish::getCalories));

        Long eveCount = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.counting());

        System.out.println(eveCount);

        //averagingInt(ToIntFunction) : returns the average of the integers passed value

        Double calorieAverage = DishData.getAll().stream().collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage);

        // joining() : is used to join various elements of a characters or string array into a single object

        List<String> courses = Arrays.asList("Java", "C#", "Python");

        String str = courses.stream().collect(Collectors.joining(","));
        System.out.println(str);

        // partitioningBy() : is used to partition a stream of objects (of a set of elements ) based on a given predicate

        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream().collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println();

        System.out.println(veggieDish);

        // groupingBy(): is used for grouping objects by some property and storing results in a Map instance.

        Map<Type, List<Dish>> dishType = DishData.getAll().stream().collect(Collectors.groupingBy(Dish::getType));

        System.out.println(dishType);


    }

}
