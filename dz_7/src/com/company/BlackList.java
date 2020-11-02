package com.company;

import java.util.*;

public class BlackList {
    public boolean hasNoneLetters(String str){
        ArrayList<Character> blacklist = new ArrayList<>();
        blacklist.add('f');
        blacklist.add('a');
        blacklist.add('c');
        char[] arrChar = str.toLowerCase().toCharArray();
        for (int i = 0; i <arrChar.length ; i++) {
            for (int j = 0; j < blacklist.size(); j++) {
                if(arrChar[i] == blacklist.get(j)){
                    return false;
                }
            }

        }
        return true;
    }
}
