package com.streamCodes;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println("Print all the emails");

        EmployeeData.readAll().map(Employee::getEmpEmail).forEach(System.out::println);
        System.out.println("---------------------------------------------");
        EmployeeData.readAll().map(Employee::getEmpPhoneNumber)
                .forEach(System.out::println);


        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumber().stream())   // first option
                .forEach(System.out::println);

        EmployeeData.readAll().map(Employee::getEmpPhoneNumber)
                        .flatMap(List::stream).forEach(System.out::println);   // second option


        System.out.println("-----------------------------------------------");

        EmployeeData.readAll().map(Employee::getEmpPhoneNumber).forEach(System.out::println);


        System.out.println("------------------------------------------------");

        EmployeeData.readAll().flatMap(employee -> employee.getEmpPhoneNumber().stream()).forEach(System.out::println);

        System.out.println("----------------------");
        EmployeeData.readAll().map(Employee::getEmpPhoneNumber).flatMap(List::stream).forEach(System.out::println);

        System.out.println("----------------------");
        EmployeeData.readAll().map(Employee::getEmpPhoneNumber).flatMap(Collection::stream).forEach(System.out::println);




    }
}
