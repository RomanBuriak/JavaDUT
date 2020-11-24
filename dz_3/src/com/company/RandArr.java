package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class RandArr {
    public void fillingTheArrayAndArithmeticMeanOfAllPairedNumbers(int n){




        List<Integer> list = Stream.generate(() -> (int) Math.round((Math.random() * 9))).limit(n).collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println();
        list.stream().filter(x->(x%2)==0).mapToInt((x)->Integer.parseInt((String.valueOf(x)))).average().ifPresent(System.out::println);




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



