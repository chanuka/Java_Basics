package com.java.basics;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    // function reverses the elements of the array
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }

    static void reverse(Integer a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }

    public static void main(String[] args)
    {
        Integer [] arr = {10, 20, 30, 40, 50};
        reverse(arr);

        Integer [] arr2 = {10, 20, 30, 40, 50};

        reverse(arr2, arr2.length);
    }




}
