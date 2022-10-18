package com.file_processing.reading;

import java.io.FileReader;
import java.io.IOException;

public class Read_FileReader {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:\\Users\\CBA_IT_3\\Downloads\\qr.txt");

        int i;
        // Holds true till there is nothing to read
        while ((i = fr.read()) != -1)

            System.out.print((char)i);
    }
}
