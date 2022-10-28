package com.java.java8.lambda;

public class Greeter {
    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        MyLambdaInf myGreeterLambda = () -> System.out.println("Hello World..");
        myGreeterLambda.foo();

        Greeting myGreeterLambda2 = () -> System.out.println("Hello World..Lambda");
        myGreeterLambda2.perform();


//        MyTypeInferenceLambdaInf typeInferenceLambdaInf = (String s) -> s.length();
        MyTypeInferenceLambdaInf typeInferenceLambdaInf = s -> s.length();
        System.out.println(typeInferenceLambdaInf.getLength("my Foot"));

    }
}

interface MyLambdaInf {
    void foo();
}
@FunctionalInterface
interface MyTypeInferenceLambdaInf {
    int getLength(String s);
}