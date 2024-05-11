package com.blackcrw.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void run() {
        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};

        /* Annotation

        There are two types of usage for "FileWriter()": one without the 'true' parameter, which creates/recreates the file;
        and one with 'true', which appends the words to the end of the file.
         */

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
