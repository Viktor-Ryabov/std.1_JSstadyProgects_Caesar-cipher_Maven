package org.example;

import org.example.Cipher.CipherEncoder;
import org.example.Cipher.MakeNewAlphabet;

public class Informer implements Runnable {
    public void run() {
        int i = 0;
        System.out.println("Входные данные сформированы: ");
        System.out.println(++i + " Адрес файла: " + Constants.FILEADRESS);
        System.out.println(++i + " Ключ для кодировки: " + Constants.getKEYCIPHERNUMBER());
        System.out.println(++i + " Изначальный алфавит: " + String.valueOf(Constants.ALPHABET));
        System.out.println(++i + " Измененный алфавит для кодировки: " + String.valueOf(Constants.getNEWALPHABET()));
        System.out.println(++i + " char[] NEWALPHABET: " + Constants.getNEWALPHABET());
        System.out.println("-------------");
    }
}
