package com.java.java8.lambda;

public class MyRunnableExample {

    public static void main(String[] args) {
        Thread myThead = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed Inside Runnable");
            }
        });
        myThead.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("Printed Inside Lambda Runnable"));
        myLambdaThread.run();
    }
}
