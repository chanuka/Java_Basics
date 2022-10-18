package com.data_structures;

public class TwoDArray {
    public static void main(String[] args) {

        int rows = 10, columns = 5;
        String[][] marks = new String[rows][columns];

        // initializing the array elements using for loop
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                marks[i][j] = String.format("%02d", i + j);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(marks[i][j] + "    ");
            }
            System.out.println("");
        }
    }
}
