package org.example;

import java.util.Scanner;

public class InitialData implements Runnable {
    public static final char[] ALPHABET = {'а', 'б',
            'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
            'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»',
            ':', '!', '?', ' '};

    public static int keyNumber;
    public static String fileAdress = null;
    public static void setFileAdress(String fileAdress) {
        InitialData.fileAdress = fileAdress;
    }
    public static void setKeyNumber(int keyNumber) {
        InitialData.keyNumber = keyNumber;
    }



    public void run() {
        System.out.println("Введите адрес файла: ");
        Scanner scanner = new Scanner(System.in);
        setFileAdress(scanner.nextLine());
        System.out.println("Введите значение кодировки для зашифровки: ");
        setKeyNumber(scanner.nextInt());
    }
}
