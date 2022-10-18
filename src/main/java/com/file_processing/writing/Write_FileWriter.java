package com.file_processing.writing;

import java.io.FileWriter;
import java.io.IOException;

public class Write_FileWriter {
    public static void main(String[] args) {

        String text = "Computer Science Portal GeeksforGeeks";

        try {

            try (FileWriter fWriter = new FileWriter("todo.docx")) {

                fWriter.write(text);

                System.out.println(text);

            }

            System.out.println("File is created successfully with the content.");
        }

        catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
