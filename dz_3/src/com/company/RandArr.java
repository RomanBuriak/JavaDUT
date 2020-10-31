package com.company;

public class RandArr {
    public void fillingTheArrayAndArithmeticMeanOfAllPairedNumbers(int n){
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 9));
            System.out.println(array[i]);
        }
        int countSum = 0;
        int countElements = 0;
        for (int i = 0; i < array.length; i++) {
            if((array[i] % 2) == 0){
                countSum += array[i];
                countElements++;
            }
        }
        float arithmeticMean = countSum / countElements;
        System.out.println("ArithmeticMeanAllPairedNumbers = " + arithmeticMean);
    }



}
