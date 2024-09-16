package org.example;

import org.example.Cipher.CipherEncoder;
import org.example.Cipher.MakeNewAlphabet;

public class Informer implements Runnable {
    public void run() {
        System.out.println("Входные данные: ");
        System.out.println("1. Адрес файла: " + Constants.FILEADRESS);
        System.out.println("2. Ключ для кодировки: " + Constants.getKEYCIPHERNUMBER());
        System.out.println("3. char[] NEWALPHABET: " + Constants.getNEWALPHABET());
        System.out.println("4. Измененный алфавит для кодировки: " + Constants.getNEWALPHABETSTRING());
        System.out.println("-------------");
    }
}
