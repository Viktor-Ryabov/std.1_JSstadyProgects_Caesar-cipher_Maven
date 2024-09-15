package org.example;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class FileManager implements Runnable {
    ArrayList<String> fileData = new ArrayList<>();
    public void run() {
        try(BufferedReader reader = new BufferedReader(new FileReader(InitialData.fileAdress))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line + "\n");
                fileData.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fileData);
    }
}
