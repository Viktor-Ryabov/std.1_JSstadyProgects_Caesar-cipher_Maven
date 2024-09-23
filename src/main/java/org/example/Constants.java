package org.example;

import org.example.Cipher.MakeNewAlphabet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Constants {
    public static final char[] ALPHABET = {'а', 'б',
            'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
            'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»',
            ':', '!', '?', ' '};
    public static int KEYCIPHERNUMBER = 0;
    public static String FILEADRESS = "";
    public static char[] NEWALPHABET;


    //ALPHABET
    public static char[] getALPHABET() {
        return ALPHABET;
    }

    //FILEADRESS
    public static void setFILEADRESS(String FILEADRESS) {
        Constants.FILEADRESS = FILEADRESS;
    }
    public static String getFILEADRESS() {
        return FILEADRESS;
    }

    //KEYCIPHERNUMBER
    public static int getKEYCIPHERNUMBER() {
        return KEYCIPHERNUMBER;
    }
    public static void setKEYCIPHERNUMBER(int KEYCIPHERNUMBER) {
        Constants.KEYCIPHERNUMBER = KEYCIPHERNUMBER;
    }

    //NEWALPHABET
    public static void setNEWALPHABET(char[] NEWALPHABET) {
        Constants.NEWALPHABET = NEWALPHABET;
    }
    public static char[] getNEWALPHABET() {
        return NEWALPHABET;
    }

}
