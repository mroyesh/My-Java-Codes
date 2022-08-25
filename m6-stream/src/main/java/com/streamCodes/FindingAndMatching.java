package com.streamCodes;

import com.streamCodes.tasks.Dish;
import com.streamCodes.tasks.DishData;

import java.util.*;
import java.util.stream.IntStream;

public class FindingAndMatching {
    public static void main(String[] args) {


        System.out.println("ALL MATCH");

        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        System.out.println("Any match");
        if ( DishData.getAll().stream().anyMatch(Dish::isVegetarian) ) {
            System.out.println("The menu is vegetarian friendly");

        }

        System.out.println("NONE MATCH");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 3000);
        System.out.println(isHealthy2);


        System.out.println("FIND ANY");

        //DishData.getAll().stream().filter(Dish::isVegetarian).findAny();

        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());


        System.out.println("FIND FIRST");
        Optional<Dish> dish1 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish1.get());


        // PARALLEL STREAM (Async)

        System.out.println(IntStream.range(0, 100).parallel().findAny());
        System.out.println(IntStream.range(0, 100).parallel().findFirst());


        List<String> list1 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");
        List<String> list2 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");

        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny= list2.parallelStream().filter(s -> s.startsWith("J")).findAny();
        System.out.println(findFirst.get());
        System.out.println(findAny.get());


        Optional<String> findFirst2 = list1.stream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny2= list2.stream().filter(s -> s.startsWith("J")).findAny();

        System.out.println(findAny2);
        System.out.println(findFirst2);


        System.out.println("MIN AND MAX");

        Optional<Dish> dMin= DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));

        System.out.println(dMin.get());

        Optional<Dish> dMax= DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax.get());

        int calories= DishData.getAll().stream().map(Dish::getCalories).reduce((a,b)->a+b).get();
        System.out.println(calories);

        List<Integer> numbers= new ArrayList<>(Arrays.asList(12, 21, 12,334,123,4,45));
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum.get());


        System.out.println("COUNT");

       long dishCount= DishData.getAll().stream().count();
        System.out.println(dishCount);








    }
}
