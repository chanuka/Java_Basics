package com.java.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MyLambdaTestUsingJava8 {
    public static void main(String[] args) {

        List<String> country = Arrays.asList("Russia", "India", "China", "Japan", "", "Ghana");
        List<Integer> intList = Arrays.asList(10, 50, 8, 75, 6);
        Collections.sort(country); // Integer class is implementing Comparable
        country.sort(Comparator.naturalOrder());// String class is implementing Comparable


        List<Person> list = Arrays.asList(
                new Person("Chanuka", "Gunathilaka", 34),
                new Person("Pubudu", "Ranathunga", 35),
                new Person("Indika", "Hewage", 38),
                new Person("Harshana", "Madusanka", 37)
        );

        //Step 1 - Sort the list by last name

        Collections.sort(list, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //Step 2 Create a method that print all the elements in the list
        System.out.println("-----Print all the people-----");
        printConditionally(list,p -> true);

        //Step 3 Create a method that print all people that have last name begins with C
        System.out.println("-----Print all the people with first name starts with C-----");
        printConditionally(list, p -> p.getFirstName().startsWith("C"));

        System.out.println("-----Print all the people with Last name starts with M-----");
        printConditionally(list, p -> p.getLastName().startsWith("M"));

        printConditionallyUsingPredicate(list,p -> p.getLastName().startsWith("H"));

        performConditionallyUsingPredicate(list,p -> p.getLastName().startsWith("H"), p -> System.out.println(p.getLastName()));

    }


    private static void printConditionally(List<Person> list, Condition myCondition) {
        for (Person p : list) {
            if (myCondition.test(p)) {
                System.out.println(p);
            }
        }
    }
    private static void printConditionallyUsingPredicate(List<Person> list, Predicate<Person> myPredicate) {
        for (Person p : list) {
            if (myPredicate.test(p)) {
                System.out.println(p);
            }
        }
    }
    private static void performConditionallyUsingPredicate(List<Person> list, Predicate<Person> myPredicate ,
                                                           Consumer<Person> myConsumer) {
        for (Person p : list) {
            if (myPredicate.test(p)) {
                myConsumer.accept(p);
            }
        }
    }
}

