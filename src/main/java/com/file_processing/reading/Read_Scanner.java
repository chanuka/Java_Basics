package com.file_processing.reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_Scanner {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\CBA_IT_3\\Downloads\\qr.txt");
        Scanner sc = new Scanner(file);

//        while (sc.hasNextLine())
//            System.out.println(sc.nextLine());

        // we just need to use \\Z as delimiter
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
    }
}
