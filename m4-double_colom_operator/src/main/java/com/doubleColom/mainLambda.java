package com.doubleColom;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class mainLambda {
    public static void main(String[] args) {



        Predicate<Integer> pred = (p) -> p % 2 == 0;

        Calculate sum= (x,y)-> System.out.println(x+y);

        Calculate sum1 = (x, y) -> Calculator.findSum(x, y);

        // Reference to s static method
        Calculate sum2 = Calculator::findSum;

        sum.calculate(10,20);
        sum1.calculate(20,40);

        Calculator obj= new Calculator();
        Calculate s3= obj::findMultiply;

        Calculate s4= new Calculator()::findMultiply;
        s4.calculate(3,6);


        BiFunction<String, Integer, String > func= (str, i)->str.substring(i);

        BiFunction<String, Integer, String >func1= String::substring;

        Function<Integer, Double> str=new MyClass()::method;
        BiFunction<MyClass, Integer, Double> b1= MyClass::method;

        Consumer<Integer> display= System.out::println;
        Consumer<Integer> display1=i-> System.out.println(i);

        BiFunction<String, Integer, Car> car= Car::new;
        Car benz=car.apply("Benz", 2022);
        System.out.println(benz.getMake()+benz.getModel());


        }

    }

