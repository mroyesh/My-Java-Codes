package com.doubleColom;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class mainLambda {
    public static void main(String[] args) {


        //Predicate<Integer> pred = (p) -> p % 2 == 0 ? true : false;

        //Calculate sum= (x,y)-> System.out.println(x+y);

        Calculate sum = (x, y) -> Calculator.findSum(x, y);
        Calculate sum1 = Calculator::findSum;

        sum.calculate(10,20);
        sum1.calculate(20,40);

        Calculator obj= new Calculator();
        Calculate s3= obj::findMultiply;

        Calculate s4= new Calculator()::findMultiply;


        BiFunction<String, Integer, String > func= (str, i)->str.substring(i);

        BiFunction<String, Integer, String >func1= String::substring;

        Function<Integer, Double> str=new MyClass()::method;
        BiFunction<MyClass, Integer, Double> b1= MyClass::method;
    }
}
