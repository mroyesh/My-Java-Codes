package com.Tasks;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {


        MyInterface<Integer> cube = a -> System.out.println(a * a * a);

        System.out.println("------------");


        cube.function(10);

        MyInterface<Integer> oddOrEven = a -> {
            if ( a % 2 == 0 ) {
                System.out.println(a + " is even number");
            } else {
                System.out.println(a + " is odd number");
            }
        };
        oddOrEven.function(20);


        System.out.println("-----------------------");


        MyInterface<String> reverse = str -> {
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
        };
        reverse.function("Wooden Spoon");
        System.out.println();



    }
}
