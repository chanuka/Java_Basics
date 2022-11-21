package com.java.basics;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] moesPints = new int[]{9, 8, 7, 6, 1};

        Arrays.sort(moesPints);

        Arrays.stream(moesPints).forEach(System.out::println);

        Simpson[] simpsons = new Simpson[]{new Simpson("Lisa"), new Simpson("Homer")};

        Arrays.sort(simpsons);
        Arrays.stream(simpsons).forEach(System.out::println);
    }
}

class Simpson implements Comparable<Simpson> {
    String name;

    Simpson(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Simpson simpson) {
        return this.name.compareTo(simpson.name);
    }

    @Override
    public String toString() {
        return "Simpson{" +
                "name='" + name + '\'' +
                '}';
    }
}
