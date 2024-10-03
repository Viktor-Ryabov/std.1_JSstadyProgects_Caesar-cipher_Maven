package org.example;

import org.example.Cipher.CipherEncoder;
import org.example.Cipher.MakeNewAlphabet;

import java.io.IOException;
import java.util.Arrays;

public class Informer implements Runnable {
    public void run() {
        System.out.println("Informer: ");

        int i = 0;
        System.out.println("Входные данные сформированы: ");
        System.out.println(++i + " Адрес файла: " + Constants.FILEADRESS);
        System.out.println(++i + " Ключ для кодировки: " + Constants.getKEYCIPHERNUMBER());
        System.out.println(++i + " Обычный алфавит: " + Arrays.toString(Constants.getALPHABET()));
        System.out.println(++i + " Новый   алфавит: " + Arrays.toString(Constants.getNEWALPHABET()));
        System.out.println(++i + " char[] NEWALPHABET: " + Constants.getNEWALPHABET());
        System.out.println("-------------");
        System.out.println("Содержимое исходного файла: ");
        try {
            new FileManager().getInputFileData(Constants.getFILEADRESS());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-------------");
    }
}
