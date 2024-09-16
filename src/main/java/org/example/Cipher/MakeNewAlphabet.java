package org.example.Cipher;

import org.example.Constants;

public class MakeNewAlphabet {
    char[] codeAlphabet = Constants.ALPHABET;
    String[] codeAplhabetStringEl = new String[codeAlphabet.length];
    int keyNumber;

    public MakeNewAlphabet(char[] codeAlphabet, int keyNumber) {
        this.codeAlphabet = codeAlphabet;
        this.keyNumber = keyNumber;
    }

    public void makeNewAlphabet() {
        for (int i = 0; i < Constants.ALPHABET.length; i++) {
            if(i != Constants.ALPHABET.length - 1){
                codeAlphabet[i] = Constants.ALPHABET[i + keyNumber];
                codeAplhabetStringEl[i] =  Character.toString(codeAlphabet[i]);
            } else {
                codeAlphabet[i] = Constants.ALPHABET[0];
                codeAplhabetStringEl[i] =  Character.toString(codeAlphabet[i]);
            }
        }
    }

    public char[] getCodeAlphabet() {
        return codeAlphabet;
    }

    public String getCodeAlphabetAsString(){
        return String.join(" ", codeAplhabetStringEl);
    }
}
