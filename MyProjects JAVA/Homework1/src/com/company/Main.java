package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WorkingWithArrays wwarr = new WorkingWithArrays();
        int[][] arr_test = wwarr.CreateArray();
        wwarr.FillingTheArrayRandomly(arr_test);
        wwarr.PrintArray(arr_test);
        wwarr.ToDeduceElementsOfALateralDiagonal(arr_test);
        System.out.print(wwarr.FillArray(-3,12,3));
    }
}
