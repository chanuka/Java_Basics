package com.file_processing.writing;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write_FileOutputStream {
    public static void main(String[] args) {
        // Assign the file content
        String fileContent = "Welcome to geeksforgeeks";
        FileOutputStream outputStream = null;

        // Try block to check if exception occurs
        try {

            // Step 1:  Create an object of FileOutputStream
            outputStream = new FileOutputStream("todo.txt");

            // Step 2: Store byte content from string
            byte[] strToBytes = fileContent.getBytes();

            // Step 3: Write into the file
            outputStream.write(strToBytes);

            System.out.print("File is created successfully with the content.");
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
        }
        finally {
            // Step 4: Close the object
            if (outputStream != null) {
                try {
                    // Closing the file connections
                    outputStream.close();
                }
                catch (IOException e) {
                    System.out.print(e.getMessage());
                }
            }
        }
    }
}
