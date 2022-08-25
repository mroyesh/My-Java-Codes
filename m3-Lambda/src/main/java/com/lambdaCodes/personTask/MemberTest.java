package com.lambdaCodes.personTask;

import com.lambdaCodes.personTask.Person;
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        Person p1 = new Person("Yasin", 33, Gender.MALE);
        Person p2 = new Person("Ali", 35, Gender.MALE);
        Person p3 = new Person("Nazgul", 22, Gender.FEMALE);
        Person p4 = new Person("Reza", 35, Gender.MALE);
        List<Person> personList = Arrays.asList(p1, p2, p3, p4);

        CheckMember checkMember = p -> p.getGender() == Gender.FEMALE && p
                .getAge() >= 18 && p.getAge() <= 25;
        test(personList, checkMember);
    }


    private static void test(List<Person> personList, CheckMember memberTest) {
        List<Person> result = new ArrayList<>();
        for (Person person : personList) {
            if ( memberTest.test(person) ) {
                result.add(person);
            }

        }
        System.out.println(result);
    }
}
