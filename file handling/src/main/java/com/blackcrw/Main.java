package com.blackcrw;

import java.io.*;
import java.util.Scanner;

import com.blackcrw.listener.Listener;
import com.blackcrw.read.Read;

public class Main {
    public static void main(String[] args) {
        Listener.listFiles();
        Listener.listFolders();

        Listener.information();
    }
}