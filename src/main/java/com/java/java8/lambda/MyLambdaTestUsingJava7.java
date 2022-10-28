package com.java.java8.lambda;

import java.util.*;

public class MyLambdaTestUsingJava7 {
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
//        Collections.sort(list);

        Collections.sort(list, new Comparator<Person>() { //one way is attach inline comparator to sort
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //Step 2 Create a method that print all the elements in the list
        System.out.println("-----Print all the people-----");
        printAll(list);

        //Step 3 Create a method that print all people that have last name begins with C
        System.out.println("-----Print all the people with first name starts with C-----");
//        printAllByName(list, "C");
        printConditionally(list, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });
        System.out.println("-----Print all the people with Last name starts with M-----");
//        printAllByName(list, "C");
        printConditionally(list, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("M");
            }
        });
    }

    private static void printAll(List<Person> list) {
        for (Person p : list) {
            System.out.println(p);
        }
    }

    private static void printAllByName(List<Person> list, String s) {
        for (Person p : list) {
            if (p.getFirstName().startsWith(s)) {
                System.out.println(p);
            }
        }
    }

    private static void printConditionally(List<Person> list, Condition myCondition) {
        for (Person p : list) {
            if (myCondition.test(p)) {
                System.out.println(p);
            }
        }
    }
}

class Person implements Comparable<Person> { // one way to implement Comparable interface to sort

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName, age);
//    }

    @Override
    public int compareTo(Person o) {
        return this.lastName.compareTo(o.lastName);
    }
}

interface Condition {
    boolean test(Person p);
}
