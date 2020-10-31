package com.company;

import java.io.Console;

public class WorkWithArray {
    public void createArr(int maxNumb){
        int lenghtArr = maxNumb == 0? 1:maxNumb*2+1;

        int[] mirrorArray = new int[lenghtArr];

        for (int i = 0; i < lenghtArr; i++) {
            mirrorArray[i] = (lenghtArr-1)/2 - i;
            if(i > lenghtArr/2){
                mirrorArray[i] *= -1;
            }

        }

        for (int i = 0; i < mirrorArray.length; i++) {
            System.out.print(mirrorArray[i] + " ");
        }
    }
}
