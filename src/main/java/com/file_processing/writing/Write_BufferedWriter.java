package com.file_processing.writing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_BufferedWriter {
    public static void main(String[] args) {

        String text = "Computer Science Portal GeeksforGeeks";

        try {

            // Step 1: Create an object of BufferedWriter
            try (BufferedWriter f_writer = new BufferedWriter(new FileWriter("todo.txt"))) {

                // Step 2: Write text(content) to file
                f_writer.write(text);

                System.out.print(text);
                System.out.print("File is created successfully with the content.");

            }
        }

        catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
