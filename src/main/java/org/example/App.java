package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) throws InterruptedException {

        InitialData initialData = new InitialData();
        initialData.run();

        Informer informer = new Informer();
        informer.run();

//        FileManager fileManager = new FileManager();
//        fileManager.run();
    }
}
