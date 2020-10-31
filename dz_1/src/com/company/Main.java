package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Завдання 1.");
        WorkingWithArrays wwarr = new WorkingWithArrays();
        int[][] arr_test = wwarr.createArray();
        wwarr.fillingTheArrayRandomly(arr_test);
        wwarr.printArray(arr_test);
        wwarr.toDeduceElementsOfALateralDiagonal(arr_test);
        System.out.println("");
        System.out.println("Завдання 2. Заповнення масиву від begin до end.");
        int[] arr = wwarr.fillArray(0, 10, 2);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}