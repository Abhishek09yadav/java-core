package com.learning.core.day10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class D10P01 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <source_file> <destination_file>");
            System.exit(1);
        }

        String sourcePath = args[0];
        String destinationPath = args[1];

        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);

        try {
            if (!sourceFile.exists()) {
                System.out.println("Error: Source file does not exist.");
                return;
            }

            // Create destination directory if it doesn't exist
            Files.createDirectories(destinationFile.getParentFile().toPath());

            if (destinationFile.exists()) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Destination file already exists. Overwrite? (Yes/No): ");
                String overwrite = scanner.nextLine();

                if (overwrite.equalsIgnoreCase("yes")) {
                    Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("File copied successfully!");
                } else {
                    System.out.println("Copy canceled.");
                }
            } else {
                Files.copy(sourceFile.toPath(), destinationFile.toPath());
                System.out.println("File copied successfully!");
            }
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}