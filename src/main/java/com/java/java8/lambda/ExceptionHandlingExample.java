package com.java.java8.lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 6, 2};
        int key = 0;
//        performAction(numbers, key);
//        performActionJava8(numbers, key, (v, k) -> System.out.println(v + k));
//        performActionJava8(numbers, key, (v, k) -> System.out.println(v / k));
        performActionJava8(numbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
    }

//    private static void performAction(int[] numbers, int key) {
//        for (int value : numbers) {
//            System.out.println(value + key);
//        }
//    }

    private static void performActionJava8(int[] numbers, int key, BiConsumer<Integer, Integer> myConsumer) {
        for (int value : numbers) {
            myConsumer.accept(value, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k); //this called to performActionJava8
            }catch (ArithmeticException e){
                System.out.println("Arithmetic exception happened");
            }
        };
    }
}
