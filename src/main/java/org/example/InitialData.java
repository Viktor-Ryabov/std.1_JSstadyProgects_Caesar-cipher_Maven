package org.example;

import org.example.Cipher.MakeNewAlphabet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class InitialData implements Runnable {

    public void run() {
        System.out.println("InitialData: ");
        System.out.println("Введите адрес файла: ");
        Scanner scanner = new Scanner(System.in);
        Constants.setFILEADRESS(scanner.nextLine());
        System.out.println("Введите значение кодировки для зашифровки (от 1 до 36): ");
        Constants.setKEYCIPHERNUMBER(scanner.nextInt());
        System.out.println("-------------");
        System.out.println("ВВод данных закончен.");
        System.out.println("-------------");
        System.out.println("Формируем алфавит шиврофания (в InitialData)... ");
        MakeNewAlphabet makeNewAlphabet = new MakeNewAlphabet(Constants.getALPHABET(), Constants.getKEYCIPHERNUMBER());
        Constants.setNEWALPHABET(makeNewAlphabet.createAndGetANewAlphabet());
        System.out.println("Алфавит шиврофания сформирован...");
        System.out.println("-------------");

    }

}
