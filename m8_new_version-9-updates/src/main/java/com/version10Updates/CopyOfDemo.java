package com.version10Updates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {

    public static void main(String[] args) {
        List<Integer> numberList= Arrays.asList(2,4,6,8,10);
        List<Integer> unmodifiableLIst2= List.of(2,4,6,8);
        List<Integer> unmodifiableList= List.copyOf(numberList);
        System.out.println("test");

    }
}
