package com.streamCodes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {

    public static void main(String[] args) {

        // Creating Stream from Array

        String[] courses = {"Java", "Python", "C#", "C++", "Ruby"};
        Stream<String> coursesStream = Arrays.stream(courses);

        //Creating Stream from Collectiont

        List<String> courseList = Arrays.asList("Java", "Python", "C#", "C++", "Ruby");

        Stream<String> courseListStream = courseList.stream();

    }
}