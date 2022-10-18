package com.java.basics;

import java.util.LinkedHashSet;

public class DuplicateElement {
    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {8,1, 2, 3, 4, 2, 7, 8, 8, 2, 3,8,8,1};
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();


        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
//                System.out.println("j:"+j);
                if(arr[i] == arr[j]){
                    set.add(arr[j]);
                break;
                }
            }
        }

        for (int value : set) {
            System.out.println(value);
        }
    }
}
