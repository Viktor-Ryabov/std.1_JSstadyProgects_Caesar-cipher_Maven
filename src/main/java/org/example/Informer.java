package org.example;

import org.example.Cipher.CipherEncoder;
import org.example.Cipher.MakeNewAlphabet;

import java.util.Arrays;

public class Informer implements Runnable {
    public void run() {
        int i = 0;
        System.out.println("Входные данные сформированы: ");
        System.out.println(++i + " Адрес файла: " + Constants.FILEADRESS);
        System.out.println(++i + " Ключ для кодировки: " + Constants.getKEYCIPHERNUMBER());
        System.out.println(++i + " Обычный алфавит: " + Arrays.toString(Constants.getALPHABET()));
        System.out.println(++i + " Новый   алфавит: " + Arrays.toString(Constants.getNEWALPHABET()));
        System.out.println(++i + " char[] NEWALPHABET: " + Constants.getNEWALPHABET());
        System.out.println("-------------");
    }
}
