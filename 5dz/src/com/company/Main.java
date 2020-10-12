package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //task 1
        task_1 t = new task_1();
        task_1 t_2 = new task_1();
        double[] arr = new double[]{1, 1, 1, 2, 1, 1};
        double[] arr_2 = new double[]{0, 0, 0.55, 0, 0};
        System.out.println(t.returnWrongNumber(arr));
        System.out.println(t_2.returnWrongNumber(arr_2));

        //task2
        task_2 t_3 = new task_2();
        int[] arr_3 = new int[]{7, 0, 8, 1, 6, 2, 3, 5};
        int[] arr_4 = t_3.sortArray(arr_3);
        for (int i = 0; i < arr_4.length; i++) {
            System.out.print(arr_4[i] + " ");
        }

    }


}
