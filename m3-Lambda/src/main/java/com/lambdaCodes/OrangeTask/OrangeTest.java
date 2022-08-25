package com.lambdaCodes.OrangeTask;

import com.lambdaCodes.AppleTask.Color;

import javax.print.attribute.standard.OrientationRequested;
import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {

        List<Orange> inventory = new ArrayList<Orange>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100, Color.RED));
        inventory.add(new Orange(200, Color.GREEN));
        inventory.add(new Orange(50, Color.RED));

        System.out.println("----------------------------------------");

        OrangeFormatter orangeWeight = orange -> "An orange of " + orange.getWeight() + "g";
        prettyPrintApple(inventory, orangeWeight);// we can print in other way as well
        prettyPrintApple(inventory, orange -> "An orange of " + orange.getWeight() + "g");

        System.out.println("---------------------------------------------------------");

        OrangeFormatter fancyFormatter = orange -> {
          String str = orange.getWeight() > 200 ? "Heavy " : "Light";
            return "A " + str + " " + orange.getColor() + " orange";
        };
        prettyPrintApple(inventory, fancyFormatter);

    }
    private static void prettyPrintApple(List<Orange> inventory, OrangeFormatter formatter) {
        for (Orange orange : inventory) {
            System.out.println(formatter.accept(orange));
        }
    }
}





