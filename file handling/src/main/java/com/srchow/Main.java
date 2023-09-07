package com.srchow;

import com.srchow.listener.Listener;
import com.srchow.read.Read;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Listener.listFiles();
        Listener.listFolders();

        Listener.information();
    }
}