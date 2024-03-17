package com.learning.core.day10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class D10P04 {
    public static void main(String[] args) {
        // Check if the correct number of arguments are provided
        if (args.length != 2) {
            System.out.println("Please Provide file path in arguments");
            return;
        }

        // Get the file paths from the command line arguments
        Path sourcePath = Paths.get(args[0]);
        Path destinationPath = Paths.get(args[1]);

        try {
            // Copy the file with the option to replace if it already exists
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }
    }
}
