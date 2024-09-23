package org.example.Cipher;

import org.example.Constants;

public class MakeNewAlphabet {
    char[] codeAlphabet = Constants.ALPHABET;
    char[] newAlphabet = Constants.ALPHABET;
    String codeAlohabetString = "";
    int keyNumber = Constants.getKEYCIPHERNUMBER();

    public MakeNewAlphabet(char[] codeAlphabet, int keyNumber) {
        this.codeAlphabet = codeAlphabet;
        this.keyNumber = keyNumber;
    }

    public char[] createAndGetANewAlphabet() {
        int maxIndex = Constants.ALPHABET.length - 1;
        int currentI;
        for (int i = 0; i < Constants.ALPHABET.length; i++) {
            currentI = i + keyNumber;
            if(i != Constants.ALPHABET.length - 1){
                if((i + keyNumber) > maxIndex){
                    currentI = (i + keyNumber) - maxIndex;
                }
                newAlphabet[i] = Constants.ALPHABET[currentI];
            } else {
                newAlphabet[i] = Constants.ALPHABET[0];
            }
        }
        System.out.println("method makeNewAlphabet: " + String.valueOf(newAlphabet));
        return newAlphabet;
    }

//testing
//    public static void main(String[] args) {
//        MakeNewAlphabet makeNewAlphabet = new MakeNewAlphabet(Constants.ALPHABET, Constants.getKEYCIPHERNUMBER());
//        makeNewAlphabet.makeNewAlphabetTest();
//    }
//    private void makeNewAlphabetTest() {
//        keyNumber = 10;
//        int maxIndex = Constants.ALPHABET.length - 1;
//        int currentI;
//        for (int i = 0; i < Constants.ALPHABET.length; i++) {
//            currentI = i + keyNumber;
//            if(i != Constants.ALPHABET.length - 1){
//                if((i + keyNumber) > maxIndex){
//                    currentI = (i + keyNumber) - maxIndex;
//                }
//                newAlphabet[i] = Constants.ALPHABET[currentI];
//            } else {
//                newAlphabet[i] = Constants.ALPHABET[0];
//            }
//        }
//        for (int i = 0; i < codeAlphabet.length; i++) {
//            newAlphabet[i] = codeAlphabet[i];
//        }
//        System.out.println("method makeNewAlphabet: " + String.valueOf(newAlphabet));
//
//    }
}
