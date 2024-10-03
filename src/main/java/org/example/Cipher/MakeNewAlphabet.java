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
                if ((i + keyNumber) > maxIndex){
                    currentI = (i + keyNumber) - maxIndex;
                }
                newAlphabet[i] = standartAlphabet[currentI];
            } else {
                newAlphabet[i] = standartAlphabet[0];
            }
        }
        return newAlphabet;
    }
}
