package com.file_processing.reading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read_BufferedReader { //fast reading among all
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\CBA_IT_3\\Downloads\\qr.txt");

        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;

        while ((st = br.readLine()) != null)
            // Print the string
            System.out.println(st);
    }
}
