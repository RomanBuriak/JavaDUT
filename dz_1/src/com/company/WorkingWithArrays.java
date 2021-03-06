package com.company;
import java.util.Scanner;
import java.util.Random;

public class WorkingWithArrays {
    int[][] createArray(){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Количество столбцов и строк:");
        n = in.nextInt();
        boolean correct_number_of_rows_and_columns = false;
        while(correct_number_of_rows_and_columns != true) {
            if (n <= 0) {
                System.out.println("Количество не должно равнятся 0 или быть отрицательным. Попробуй еще!");
                System.out.print("Количество столбцов и строк:");
                n = in.nextInt();
            } else {
                correct_number_of_rows_and_columns = true;
            }
        }
        return new int[n][n];
        /*
        int m, n;
        System.out.print("Количество рядков:");
        m = in.nextInt();
        System.out.print("Количество столбцов:");
        n = in.nextInt();

        boolean array_is_square_or_not = false;
        while(array_is_square_or_not != true){
            if(m != n){
                System.out.print("Введите количество строк:");
                m = in.nextInt();
                System.out.print("Введите количество столбцов:");
                n = in.nextInt();

                System.out.print("Количество строк и столбцов должно быть одинаковым. Попробуй еще!");
            }
            else{
                array_is_square_or_not = true;
            }
        }



        return new int[m][n];

         */

    }
    void fillingTheArrayRandomly(int[][] arr){
        int min = 0, max = 9;
        Random r = new Random();

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt((max - min) + 1) + min;
            }
        }
    }
    void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    void toDeduceElementsOfALateralDiagonal(int[][] arr){
        System.out.println("Парні елементи побічної діагоналі: ");
        for (int i = 0; i < arr.length; i++){
            if((arr[i][arr[i].length - i - 1] % 2) == 0){
                System.out.print(arr[i][arr[i].length - i - 1] + " ");
            }
        }
    }
    //2hw
    int[] fillArray(int begin, int end, int step){

        int length_array;
        if(begin == 0){
            length_array = end / step + 1;
        }
        else if(begin < 0){
            length_array = ((begin * (-1)) / step) + ((end / step) + 1);
        }
        else{
            length_array = end / step;
        }
        int[] array_of_steps = new int[length_array];
        for (int i = 0; i < array_of_steps.length; i++) {
            array_of_steps[i] = begin + (step * i);
        }
        return array_of_steps;
    }
}