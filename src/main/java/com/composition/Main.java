package com.composition;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Chanuka",1001L);
        String salary = person.getSalary();
        String name = person.getName();
        System.out.println("Name : "+name+" Getting A Salary of : " + salary);

//        BigDecimal payment = new BigDecimal("10.99");
//        System.out.println(String.format("$%.2f", payment));
//
    }
}
