package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //task 1
        SortC sc = new SortC();
        List<String> myList = Arrays.asList("a1","b6","c2","c3","c1");
        sc.sort_c(myList);

        System.out.println();
        //task 2
        RandArr ra = new RandArr();
        ra.fillingTheArrayAndArithmeticMeanOfAllPairedNumbers(5);
    }
}
