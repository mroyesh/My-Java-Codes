package com.streamCodes.tasks;

import java.util.Arrays;
import java.util.List;

public class CountTask {

    public static void main(String[] args) {


        List<String> words= Arrays.asList("Java", "DS", "Spring", "C#");
        words.stream().map(str->str.length()).forEach(System.out::println);
    }
}
