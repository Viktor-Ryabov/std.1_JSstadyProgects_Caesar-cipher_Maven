package org.example.Cipher;

import org.example.Constants;
import org.example.FileManager;
import org.example.InitialData;

public class Cipher {
    char[] incomeArray;
    public Cipher(char[] incomeArray) {
        this.incomeArray = incomeArray;
    }

    CipherEncoder cipherEncoder = new CipherEncoder(FileManager.fileDataToString, Constants.getKEYCIPHERNUMBER());


}
