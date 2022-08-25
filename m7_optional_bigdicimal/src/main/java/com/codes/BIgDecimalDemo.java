package com.codes;

import java.math.BigDecimal;
import java.util.Formatter;

public class BIgDecimalDemo {
    public static void main(String[] args) {
        double amount1=234.56;
        double amount2= 234.26;

        System.out.println(amount1-amount2);
        BigDecimal b1= new BigDecimal("234.56");
        BigDecimal b2= new BigDecimal("234.26");

        BigDecimal b3= BigDecimal.valueOf(234.56);
        BigDecimal b4= BigDecimal.valueOf(234.26);

        BigDecimal b5= BigDecimal.TEN;

        System.out.println();


        // Do not use equals(). Use compareTo()

        System.out.println(new BigDecimal( "2").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));
        System.out.println(new BigDecimal("1").compareTo(new BigDecimal("2")));




        //System.out.println(b1-b2);
        System.out.println(b1.subtract(b2));




    }
}
