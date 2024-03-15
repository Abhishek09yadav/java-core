package com.learning.core.day10;

import java.io.*;

public class D10P06 {
    public static void main(String[] args) {
        String[] fileNames = {"DavidEnglish.txt", "DavidScience.txt", "DavidComputer.txt"};
        String outputFile = "DavidNotes.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String file : fileNames) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.out.println("Error reading from " + file);
                }
            }
        } catch (IOException e) {
            System.out.println("Error writing to " + outputFile);
        }
    }
}
