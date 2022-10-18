package com.java.basics;

public class PrintAsteriskPattern {
    public static void main(String args[]) {

        int i, j, row = 6;
        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        i = 0;
        j = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < row; j++) {
                if (row - i >= row - j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        System.out.println();


        i = 0;
        j = 0;
        for (i = 0; i < row; i++) {
            for (j = 6; j >= 0; j--) {
                if (j > i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
