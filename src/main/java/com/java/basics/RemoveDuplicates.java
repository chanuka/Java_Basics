package com.java.basics;

import java.util.*;

public class RemoveDuplicates {

    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
//        int[] temp = new int[n];
        int j = 0;
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            linkedHashSet.add(a[i]);
//            if (a[i] != a[i + 1]) {
//                temp[j++] = a[i];
//            }
        }

        for(int value : linkedHashSet){
            System.out.println(value);
        }
//        temp[j++] = a[n - 1];

        // Changing the original array
//        for (int i = 0; i < j; i++) {
//            a[i] = temp[i];
//        }

        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 2,1, 1, 2, 2, 2, 1 , 3};
        int n = a.length;

        n = removeduplicates(a, n);

        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");


        List<Integer> numbers = Arrays.asList(2,1, 1, 2, 2, 2, 1 , 3);

        Set<Integer> hashSet = new LinkedHashSet(numbers);
        ArrayList<Integer> removedDuplicates = new ArrayList(hashSet);

        System.out.println(removedDuplicates);
    }
}
