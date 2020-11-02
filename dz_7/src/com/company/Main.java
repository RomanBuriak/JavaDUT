package com.company;

public class Main {

    public static void main(String[] args) {
        //task 1
        ActionsWithString aws = new ActionsWithString();
        System.out.println(aws.getStringLength("123 123456 1234 123 1 123456"));
        System.out.println();

        //task 2
        RecursiveDigitalRoot rdr = new RecursiveDigitalRoot();
        System.out.println(rdr.getRecursiveDigitalRoot(493193));
        System.out.println();

        //task 3
        Clock cl = new Clock();
        cl.convertTime(3666);
        System.out.println();

        //task 4
        BlackList bl = new BlackList();
        System.out.println(bl.hasNoneLetters("gb"));
        System.out.println();

        //task 5
        ActionsWithNumbers awn = new ActionsWithNumbers();
        System.out.println(awn.findMultiples(4,4));
        System.out.println();

        //task 6
        ActionsWithArrayStrings awas = new ActionsWithArrayStrings();
        String[] strArr = {"123","4567","89"};
        String[] strArrReverse = awas.reverseArrayStrings(strArr);
        for (int i = 0; i < strArrReverse.length; i++) {
            System.out.print(strArrReverse[i] + " ");
        }
        System.out.println();



    }
}
