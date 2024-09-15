package org.example;

import java.io.*;

public class FileManager implements Runnable {
    public void run() {
        try(BufferedReader reader = new BufferedReader(new FileReader(InitialData.fileAdress))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
