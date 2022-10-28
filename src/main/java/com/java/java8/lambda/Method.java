package com.java.java8.lambda;

public class Method {
    public void perform() {
        System.out.println("This is perform test...");
    }

    public int multiply(int a) {
        return a * 5;
    }

    public static void main(String[] args) {
        Method m = new Method();
        m.perform();

        // Replacing by lambda
        MyPrintFunctionalInterface myPerformLambdaFunction = () -> System.out.println("This is lambda test...");
        myPerformLambdaFunction.print();

        MyMultiplyFunctionalInterface myMultiplyLambdaFunction = (int a) ->  { return a * 5; };
        System.out.println(myMultiplyLambdaFunction.multiply(8));

        MyMultiplyFunctionalInterface myMultiplyLambdaFunction2 = (int a) -> a * 5;
        System.out.println(myMultiplyLambdaFunction2.multiply(4));
        MyAddFunctionalInterface myAddLambdaFunction = (int a , int b ) -> a + b;
        System.out.println(myAddLambdaFunction.add(4,5));

        MySafeDivideFunctionalInterface mySafeDivideLambdaFunction = (int a , int b ) -> {
            if(b == 0) return 0;
            return a/b;
        };
        System.out.println(mySafeDivideLambdaFunction.divide(40,5));

        MyStringLengthFunctionalInterface myStringLambdaFunction3 = (String s ) -> s.length();
        System.out.println(myStringLambdaFunction3.getLength("Java"));


    }
}
@FunctionalInterface
interface MyPrintFunctionalInterface{
    void print();
}
@FunctionalInterface
interface MyMultiplyFunctionalInterface{
    int multiply(int a);
}
@FunctionalInterface
interface MyAddFunctionalInterface{
    int add(int a,int b);
}
@FunctionalInterface
interface MySafeDivideFunctionalInterface{
    int divide(int a,int b);
}
@FunctionalInterface
interface MyStringLengthFunctionalInterface{
    int getLength(String s);
}
