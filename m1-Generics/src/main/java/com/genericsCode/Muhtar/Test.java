package com.genericsCode.Muhtar;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        Integer[] number = {1, 2, 3, 4, 5, 6};
        Double[] scores = {50.0, 60.0, 68.0, 70.0};
        String[] names = {"Ali", "Aziz", "Hadi", "Yasin"};
        Shape[] shapes = {null, null};

        Generics.printEach(number);
        Generics.printEach(scores);


        ArrayList<Integer> score= new ArrayList<>(Arrays.asList(40,50,60,70));
        Generics.printEach(score);


        System.out.println("-------------------------------------");

        GenericsInClass<Integer> num=new GenericsInClass<>();
        num.printEach(number);


    }

}
