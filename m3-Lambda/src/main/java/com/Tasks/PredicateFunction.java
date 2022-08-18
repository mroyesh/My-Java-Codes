package com.Tasks;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunction {

    public static void main(String[] args) {


        Predicate<Integer> isEven = a -> a % 2 == 0;
        boolean x = isEven.test(300);
        System.out.println(x);

        System.out.println("-----------------------");

        Predicate<Integer> isOdd = n -> n % 2 == 0;
        boolean r1 = isOdd.test(100);
        System.out.println(r1);

        System.out.println("**********************************");

        Predicate<String> isPalindrome = str -> {
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }
            boolean result = str.equalsIgnoreCase(reverse);
            return result;
        };
        isPalindrome.test("Happy");


        System.out.println("---------------------------------");

        Predicate<String> isPalindrome1 = m -> {
            String reverse = "";
            for (int i = m.length() - 1; i >= 0; i--) {
                reverse += m.charAt(i);
            }
            return m.equalsIgnoreCase(reverse);
        };
        boolean str = isPalindrome1.test("Happy");


        System.out.println(str);

        Predicate<Double> isEqual = a -> a.equals(12.0 / 6);
        boolean num = isEqual.test(2.0);
        System.out.println(num);

        System.out.println("-----------------------------------");


        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 1, 2, 3, 4, 5, 6, 4, 3, 2, 1, 3, 5, 6, 6, 5, 6, 7, 5, 6, 3, 2, 1, 4, 5, 6));

        //Predicate<Integer> isEven1= p->p%2==0;
        list1.removeIf(p -> p % 2 == 0);
        System.out.println(list1);


    }
}
