package com.java.basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class SortAString {

    public static void main(String[] args) {

        String str = "geeksforgeeks";

        char arr[] = str.toCharArray();

        char temp;

        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        System.out.println(arr);


        // method 02-------------------------------------------------------
        String inputString = "geeksforgeeks";
        String outputString = sortString(inputString);

        System.out.println("Input String : " + inputString);
        System.out.println("Output String : "
                + outputString);

        // method 03-------------------------------------------------------

        String inputString3 = "GeeksforGeeks";
        String outputString3 = sortStringUsingComparator(inputString3);

        System.out.println("Input String : " + inputString3);
        System.out.println("Output String : " + outputString3);

        // method 04-------------------------------------------------------
        String inputString4 = "GeeksforGeeks";
        String outputString4 = sortStringJava8(inputString4);

        System.out.println("Input String : " + inputString4);
        System.out.println("Output String : " + outputString4);
    }

    public static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static String sortStringUsingComparator(String inputString) {

        Character tempArray[] = new Character[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {
            tempArray[i] = inputString.charAt(i);
        }

        Arrays.sort(tempArray, new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return Character.compare(
                        Character.toLowerCase(c1),
                        Character.toLowerCase(c2));
            }
        });

        StringBuilder sb = new StringBuilder(tempArray.length);

        for (Character c : tempArray)
            sb.append(c.charValue());

        return sb.toString();
    }

    public static String sortStringJava8(String inputString){
        return inputString.toLowerCase().chars()
                .sorted()
                .collect(StringBuilder :: new ,StringBuilder :: appendCodePoint,StringBuilder :: append)
                .toString();
    }
}
