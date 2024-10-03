package org.example;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {

    public void getInputFileData(String adress) throws IOException {
       List<String> lines = Files.readAllLines(Paths.get(adress));
       for (String s: lines){
           System.out.println(s);
       }
    }

//    public void printInputFileData(String fileadress){
//        printInputFileData(fileadress);
//    }
}
