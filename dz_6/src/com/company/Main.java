package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        //task 2
        StringCalculator sc = new StringCalculator();
        String str = "1+5+8-7*5/4";
        System.out.println(sc.calcStr(str));

        System.out.println();
        //task 2
        WorkWithArray wwa = new WorkWithArray();
        wwa.createArr(4);

        System.out.println();
        System.out.println();
        //task 3
        WorkWithString wws = new WorkWithString();
        wws.userMenu();
    }


}