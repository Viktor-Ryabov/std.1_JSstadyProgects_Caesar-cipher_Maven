package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    private static final char[] ALPHABET = {'а', 'б',
            'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
            'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»',
            ':', '!', '?', ' '};

    public static int keyNumber;

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите ");

        for (int i = 0; i < ALPHABET.length; i++) {
            System.out.print(ALPHABET[i] + " ");
        }
    }
}
