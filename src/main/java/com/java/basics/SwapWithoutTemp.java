package com.java.basics;

public class SwapWithoutTemp {
    public static void main(String a[])
    {
        int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"
                + " x = " + x + ", y = " + y);


        x = 10;
        y = 5;

        // Code to swap 'x' and 'y'
        x = x * y; // x now becomes 50
        y = x / y; // y becomes 10
        x = x / y; // x becomes 5

        System.out.println("After swaping:"
                + " x = " + x + ", y = " + y);


        x = 10;
        y = 5;

        // Code to swap 'x' (1010) and 'y' (0101)
        x = x ^ y; // x now becomes 15 (1111)
        y = x ^ y; // y becomes 10 (1010)
        x = x ^ y; // x becomes 5 (0101)

        System.out.println("After swap: x = "
                + x + ", y = " + y);
    }


}
