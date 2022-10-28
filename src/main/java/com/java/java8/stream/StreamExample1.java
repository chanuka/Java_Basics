package com.java.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {

        List<Person> list = Arrays.asList(
                new Person("Chanuka", "Gunathilaka", 34),
                new Person("Pubudu", "Ranathunga", 35),
                new Person("Indika", "Hewage", 38),
                new Person("Harshana", "Madusanka", 37),
                new Person("Sachithra", "Gunarathne", 27)
        );

        list.stream().
                filter(p -> p.getLastName().startsWith("G")).
                forEach(p -> System.out.println(p.getFirstName()));
        long count = list.stream().
                filter(p -> p.getLastName().startsWith("G")).
                count();
        System.out.println(count);
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

