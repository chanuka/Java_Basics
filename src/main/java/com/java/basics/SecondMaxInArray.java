package com.java.basics;

public class SecondMaxInArray {
    public static void main(String[] args) {

        int arr[] = {110,4, 7, 23, 24, 55, 23, 5, 6, 59};
        System.out.println("Second Max Value is :" + findSecondMax(arr));

    }

    private static int findSecondMax(int[] arr) {
        int MAX = Integer.MIN_VALUE;
        int SECOND_MAX = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > MAX) {
                SECOND_MAX = MAX;
                MAX = i;
            } else if (i > SECOND_MAX && i != MAX) {
                SECOND_MAX = i;
            }
        }
        return SECOND_MAX;
    }
}
