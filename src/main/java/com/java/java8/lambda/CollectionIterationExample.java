package com.java.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Chanuka", "Gunathilaka", 34),
                new Person("Pubudu", "Ranathunga", 35),
                new Person("Indika", "Hewage", 38),
                new Person("Harshana", "Madusanka", 37)
        );

        for(int i = 0; i< list.size();i++) //external iterators
            System.out.println(list.get(i));
        for( Person p : list)
            System.out.println(p);
        list.forEach(p -> System.out.println(p));//internal iterators
        list.forEach(System.out :: println);
    }
}
