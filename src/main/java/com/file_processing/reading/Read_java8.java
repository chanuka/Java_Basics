package com.file_processing.reading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Read_java8 {
    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\CBA_IT_3\\Downloads\\qr.txt");

//        try (Stream<String> stream = Files.lines(path)) {
//            stream.forEach(System.out::println);
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(new File("C:\\Users\\CBA_IT_3\\Downloads\\qr.txt")))) {
            reader.lines().forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

//        String content = null;
//        try {
//            content = Files.lines(Paths.get("C:\\Users\\CBA_IT_3\\Downloads\\qr.txt"))
//                    .collect(Collectors.joining(System.lineSeparator()));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(content);
    }
}
