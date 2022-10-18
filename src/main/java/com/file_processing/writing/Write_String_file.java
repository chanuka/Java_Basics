package com.file_processing.writing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Write_String_file {
    public static void main(String[] args) throws IOException {
        // Assigning the content of the file
        String text = "Welcome to geekforgeeks\nHappy Learning!";

        // Defining the file name of the file
        Path fileName = Path.of("todo.txt");

        // Writing into the file
        Files.writeString(fileName, text);

        // Reading the content of the file
        String file_content = Files.readString(fileName);

        // Printing the content inside the file
        System.out.println(file_content);
    }
}
