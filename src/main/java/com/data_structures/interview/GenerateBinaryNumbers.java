package com.data_structures.interview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    String[] generateBinaryNumbers(int n) {
        String[] result = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");

        for (int i = 0; i < n; i++) {
            result[i] = q.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            q.offer(n1);
            q.offer(n2);
        }

        return result;
    }

    public static void main(String[] args) {
        GenerateBinaryNumbers gn = new GenerateBinaryNumbers();
        Arrays.stream(gn.generateBinaryNumbers(5))
                .forEach(System.out :: println);
    }
}
