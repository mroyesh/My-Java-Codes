package com.streamCodes;

import java.util.Collection;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        EmployeeData.readAll()
                .map(Employee::getEmpEmail).forEach(System.out::println);

        System.out.println("---------------------------------------------");
        EmployeeData.readAll().map(Employee::getEmpEmail).forEach(System.out::println);

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
