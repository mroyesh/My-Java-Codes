package com.doubleColom;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        // Zero Argument constructor


        Supplier<Car> str = Car::new;
        str.get().getMake();

        System.out.println(str.get().getModel());


        Function<Integer, Car> fi= Car::new;

        //One argument constructor
        Function<Integer, Car>car= model->new Car(model);
        Function<Integer, Car>car1= Car::new;

        //Two arg constructor

        BiFunction<String, Integer, Car> car3= Car::new;
        car3.apply("Honda", 2014);
        Car honda = car3.apply("BMW", 2022);
        System.out.println(honda.getMake()+" "+ honda.getModel());




    }


}
