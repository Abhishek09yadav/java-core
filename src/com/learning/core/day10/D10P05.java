package com.learning.core.day10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class D10P05 {
    public static void main(String[] args) {
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a string: ");
            String input = reader.readLine();


            File file = new File("io.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(input);
            writer.close();


            long fileSize = file.length();
            System.out.println("Size of the file: " + fileSize + " bytes");

            System.out.println("Contents of the file:");
            BufferedReader fileReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
            fileReader.close();

            boolean isDeleted = file.delete();
            if (isDeleted) {
                System.out.println("File 'io.txt' deleted successfully.");
            } else {
                System.out.println("Failed to delete the file 'io.txt'.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}