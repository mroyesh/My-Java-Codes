package com.streamCodes.tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {


        //Print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");

        //Print the length of the name of each dish
        DishData.getAll().stream()
                .map(dish -> dish.getName().length())
                .forEach(System.out::println);

        System.out.println("----------------------------------------------");

        //Print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 400).limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("--------------------------------------------------");

        //Print all dish name that are below 400 calories in sorted
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);






    }
}
