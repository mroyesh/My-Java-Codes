package com.lambdaCodes.AppleTask;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));
        inventory.forEach(apple -> System.out.println(apple));
        inventory.forEach(System.out::println);// same as above with shorter method

        System.out.println("*******************************");

        //AppleHeavyPredicate abc = new AppleHeavyPredicate();
        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
        System.out.println(heavyApple);

        List<Apple> greenApple = filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApple);


        ApplePredicate weightApple = apple -> apple.getWeight()>200;
        filterApples(inventory,weightApple);

        ApplePredicate weightApple1= apple -> apple.getWeight()>200;
        System.out.println(weightApple1);

        ApplePredicate colorApple= apple -> apple.getColor().equals(Color.GREEN);
        filterApples(inventory,colorApple);
    }
    //Task
    //Convert to ready functional interface
    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){
        List<Apple> result= new ArrayList<>();
        for (Apple apple : inventory) {
            if(applePredicate.test(apple)){
                result.add(apple);
            }

        }
        return result;



    }
}
