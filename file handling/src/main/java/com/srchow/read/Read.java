package com.srchow.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read {
    public static void runOne() {
        File file = new File("in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            if(sc != null){ sc.close(); };
        }
    }

    /*
    Using "Try With Resources" to make code less verbose;
    Instead of using Scanner I use BufferedReader.
    */
    public static void runTwo() {
        try (BufferedReader br = new BufferedReader(new FileReader("in.txt"))){
            String line = br.readLine();

            while(line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
