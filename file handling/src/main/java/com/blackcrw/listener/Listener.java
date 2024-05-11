package com.blackcrw.listener;

import java.io.File;
import java.util.Scanner;

public class Listener {

    public static void information() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");

        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("Get Path   : " + path.getPath());
        System.out.println("Get Parent : " + path.getPath());
        System.out.println("Get Name   : " + path.getName());

        sc.close();
    }

    public static void listFolders() {
        File directory = new File("/");
        File[] folders = directory.listFiles(File::isDirectory);

        if (folders != null) {
            System.out.println("Folders:");
            for (File folder : folders) {
                System.out.println(folder);
            }
        } else {
            System.out.println("[!] Not folder exists in directory!");
        }
    }

    public static void listFiles() {
        File directory = new File("/");
        File[] files = directory.listFiles(File::isFile);

        if (files != null) {
            System.out.println("Files:");
            for (File folder : files) {
                System.out.println(folder);
            }
        } else {
            System.out.println("[!] Not file exists in directory!");
        }
    }
}