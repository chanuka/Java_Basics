package com.java.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Chanuka", "Gunathilaka", 34),
                new Person("Pubudu", "Ranathunga", 35),
                new Person("Indika", "Hewage", 38),
                new Person("Harshana", "Madusanka", 37)
        );

//        performConditionallyUsingPredicate(list,p -> true,p -> System.out.println(p));

        performConditionallyUsingPredicate(list,p -> true,System.out :: println);

//        performConditionallyUsingPredicate(list,p -> p.getLastName().startsWith("H"),
//        p -> System.out.println(p.getLastName()));

    }

    private static void performConditionallyUsingPredicate(List<Person> list, Predicate<Person> myPredicate,
                                                           Consumer<Person> myConsumer) {
        for (Person p : list) {
            if (myPredicate.test(p)) {
                myConsumer.accept(p);
            }
        }
    }
}
