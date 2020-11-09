package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class RandArr {
    public void fillingTheArrayAndArithmeticMeanOfAllPairedNumbers(int n){
        List<Integer> list = Stream.generate(() -> (int) Math.round((Math.random() * 9))).limit(n).collect(Collectors.toList());
        list.forEach(System.out::println);
        Optional<Integer> sum = (list.stream().reduce(Integer::sum));
        float arithmeticMean = 0;
        if(sum.isPresent())
        {
            arithmeticMean = (float)sum.get() / n;
        }

        System.out.println("ArithmeticMeanAllPairedNumbers = " + arithmeticMean);


        /*
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

         */
    }
}



