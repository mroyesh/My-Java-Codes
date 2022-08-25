package com.genericsCode.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int count = countIf(list, new OddPredicate());
        System.out.println(count);

        /*List<Integer> list = Arrays.asList(1, 2, 3, 4);
        int count = countIf(list, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }
    private static <T> int countIf(List<T> c, UnaryPredicate<T> p){
        int count = 0;
        for (T element : c) {
            if(p.test(element)){
                ++count;
            }}
        return count;*/
    }

    private static<T> int countIf(List<T> list, UnaryPredicate<T> unaryPredicate) {
        int count=0;
        for (T each : list) {
            if(unaryPredicate.test(each)){
                ++count;
        }}
        return count;
    }


}
