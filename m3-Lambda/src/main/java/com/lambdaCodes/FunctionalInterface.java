package com.lambdaCodes;

import com.lambdaCodes.AppleTask.Apple;
import com.lambdaCodes.AppleTask.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };

        System.out.println("************PREDICATE***************");
        Predicate<Double> biggerThan = a -> a > 20;
        System.out.println(biggerThan.test(34.0));

        System.out.println("************CONSUMER***************");

        Consumer<Integer> number = i -> System.out.println(i);
        number.accept(12);

        System.out.println("************BI CONSUMER***************");
        BiConsumer<Integer, Integer> add= (x,y)-> System.out.println(x+y);
        add.accept(10,20);
        System.out.println("************FUNCTION***************");
        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Love you"));

        System.out.println("************BI FUNCTION***************");
        BiFunction<Integer, Integer, Integer> result= (x,y)->x+y;
        result.apply(12, 12);


        System.out.println("************SUPPLIER***************");
        Supplier<Double>pi= ()->Math.PI;
        pi.get();
        System.out.println(pi.get());
        Supplier<Integer> random= ()->Math.min(12, 13);
        random.get();
        System.out.println(random.get());



    }
}
