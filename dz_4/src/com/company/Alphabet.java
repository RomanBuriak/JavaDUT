package com.company;
import java.io.*;

public class Alphabet {
    public void RaisingTheLettersFromHToT(String s){
        char chOld, chNew;
        chOld = 'h';
        int difference = 'h'-'H';
        chNew = (char)((int)chOld - difference);
        s.replace('h', 'u');//????????????????????????????????/

        System.out.println(s);
    }
}
