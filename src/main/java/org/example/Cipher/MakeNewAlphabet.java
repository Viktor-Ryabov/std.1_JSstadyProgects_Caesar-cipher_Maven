package org.example.Cipher;

import org.example.Constants;

public class MakeNewAlphabet {
    char[] standartAlphabet = Constants.getALPHABET();
    char[] newAlphabet = Constants.getALPHABET().clone();
    int keyNumber = Constants.getKEYCIPHERNUMBER();

    public MakeNewAlphabet(char[] standartAlphabet, int keyNumber) {
        this.standartAlphabet = standartAlphabet;
        this.keyNumber = keyNumber;
    }

    public char[] createAndGetANewAlphabet() {
        int maxIndex = standartAlphabet.length - 1;
        int currentI;
        for (int i = 0; i < standartAlphabet.length; i++) {
            currentI = i + keyNumber;
            if(i != standartAlphabet.length - 1){
                if((i + keyNumber) > maxIndex){
                    currentI = (i + keyNumber) - maxIndex;
                }
                newAlphabet[i] = standartAlphabet[currentI];
            } else {
                newAlphabet[i] = standartAlphabet[0];
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
