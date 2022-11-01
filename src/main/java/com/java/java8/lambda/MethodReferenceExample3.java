package com.java.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceExample3 {
    public static void main(String[] args) throws Exception {
        List<String> strings = new ArrayList<>();
        MethodReferenceExample3 example = new MethodReferenceExample3();

        Functional methodRef = MethodReferenceExample3::method;
        methodRef.funct("a string", strings);
        System.out.println("List now contains: " + strings);

        Functional lambda = (String s, List<String> l) -> {
            example.method(s, l);
        };
        lambda.funct("another string", strings);
        System.out.println("List now contains: " + strings);
    }

    interface Functional {
        void funct(String value, List<String> list);
    }

    private static void method(String value, List<String> toAddTo) {
        System.out.println("adding-- for the second time");
        toAddTo.add(value);
    }
}