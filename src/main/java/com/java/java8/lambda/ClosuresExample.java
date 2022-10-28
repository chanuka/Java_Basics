package com.java.java8.lambda;

public class ClosuresExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;//effectively final
        doProcess(a, i -> System.out.println(a + b));
    }

    public static void doProcess(int i, Process p) {
        p.process(i);
    }
}

interface Process {
    void process(int i);
}