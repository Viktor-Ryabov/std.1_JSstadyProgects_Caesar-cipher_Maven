package org.example.Cipher;

import org.example.Constants;

public class MakeNewAlphabet {
    char[] codeAlphabet = Constants.ALPHABET;
    String codeAlohabetString = "";
    int keyNumber;

    public MakeNewAlphabet(char[] codeAlphabet, int keyNumber) {
        this.codeAlphabet = codeAlphabet;
        this.keyNumber = keyNumber;
    }

    public void makeNewAlphabet() {
        for (int i = 0; i < Constants.ALPHABET.length; i++) {
            if(i != Constants.ALPHABET.length - 1){
                codeAlphabet[i] = Constants.ALPHABET[i + keyNumber];
            } else {
                codeAlphabet[i] = Constants.ALPHABET[0];
            }
        }
    }

    public char[] getCodeAlphabet() {
        return codeAlphabet;
    }

    public String printCodeArray(){
        for (int i = 0; i < codeAlphabet.length; i++) {
            codeAlohabetString += String.valueOf(codeAlphabet[i]) + " ";
        }
        return codeAlohabetString;
    }
}
