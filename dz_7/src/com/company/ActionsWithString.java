package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class ActionsWithString {
    public int getStringLength(String str){
        char[] arrChar = str.toCharArray();
        char[] arrCharString = new char[str.length()];
        ArrayList<String> arrCountWord = new ArrayList<String>();

        int j = 0;
        int i2 = 0;
        for (int i = 0; i < arrChar.length; i++) {
            if(arrChar[i] != ' '){
                arrCharString[i2] = arrChar[i];
                i2++;
            }
            else {
                arrCountWord = new ArrayList<String>(arrCharString).trim();
                j++;
                i2 = 0;
            }


        }
        int maxLength = 0;
        for (int i = 0; i < arrCountWord.size(); i++) {
            if(arrCountWord.get(i).length() > maxLength){
                maxLength = arrCountWord.size();
            }

        }
        return maxLength;
    }
}
