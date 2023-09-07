package com.srchow.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void run() {
        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};

        /* Anotação

        Existem dois tipos de uso para o "FileWriter()" um é sem o true que será para criar/recriar o arquivo;
        com true que será para incluir as palavras ao final do arquivo.
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
