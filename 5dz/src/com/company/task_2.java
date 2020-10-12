package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class task_2 {
    Queue<Integer> list_of_odd_numbers = new LinkedList<>();
    int[] array_of_sorted_odd_numbers;
    int[] sortArray(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            if((arr[i] % 2) != 0){
                list_of_odd_numbers.add(arr[i]);
            }

        }
        array_of_sorted_odd_numbers = new int[list_of_odd_numbers.size()];

        for (int i = 0; i < array_of_sorted_odd_numbers.length; i++) {
            array_of_sorted_odd_numbers[i] = list_of_odd_numbers.poll();
        }

        for(int i = array_of_sorted_odd_numbers.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++) {
                if (array_of_sorted_odd_numbers[j] > array_of_sorted_odd_numbers[j + 1]) {
                    int tmp = array_of_sorted_odd_numbers[j];
                    array_of_sorted_odd_numbers[j] = array_of_sorted_odd_numbers[j + 1];
                    array_of_sorted_odd_numbers[j + 1] = tmp;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i] % 2) != 0){
                arr[i] = array_of_sorted_odd_numbers[count];
                count++;
            }
        }


        return arr;
    }
}
