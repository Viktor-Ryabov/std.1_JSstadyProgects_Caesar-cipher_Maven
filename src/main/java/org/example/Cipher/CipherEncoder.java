package org.example.Cipher;

import org.example.Constants;

import java.util.Arrays;

public class CipherEncoder implements Runnable {
    String text;
    int keyNumber;
    static String resultText = "";

    public static String getResultText() {
        return resultText;
    }

    public CipherEncoder(String text, int keyNumber) {
        this.text = text;
        this.keyNumber = keyNumber;
    }

    public static boolean isCharAtInitialAlphabet(char currentKey){
        return Arrays.binarySearch(Constants.ALPHABET, currentKey) >= 0;
    }

    public void run() {

        String[] textArr = null;
        for (int i = 0; i < text.length(); i++) {
            if (isCharAtInitialAlphabet(text.charAt(i))) {
                int indexInInitialAlphabet = Arrays.asList(Constants.ALPHABET).indexOf(text.charAt(i));
                textArr = text.split("");
                textArr[i] = String.valueOf(Constants.NEWALPHABET[indexInInitialAlphabet]);
            }
        }
        resultText = Arrays.toString(textArr);
    }
}
