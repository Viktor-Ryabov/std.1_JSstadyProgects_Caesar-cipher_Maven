package org.example;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class FileManager implements Runnable {
    public static String fileDataToString = "";
    public void run() {
        try(BufferedReader reader = new BufferedReader(new FileReader(Constants.FILEADRESS))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line + "\n");
                fileDataToString += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(fileDataToString);
    }
}
