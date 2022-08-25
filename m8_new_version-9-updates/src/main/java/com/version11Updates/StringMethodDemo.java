package com.version11Updates;

public class StringMethodDemo {
    public static void main(String[] args) {
        var str= "Mike\n Ozzy\n Tom\nEmmy";

        str.lines().forEach(System.out::println);
    }
}
