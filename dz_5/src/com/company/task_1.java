package com.company;

public class task_1 {
    public double s = 0;
    boolean tr = false;
    int i = 0;
    double returnWrongNumber(double[] arr){

        while(tr == false){
            if(arr[i] != arr[i+1] && i == 0){
                tr = true;
                s = arr[i];
            }
            else if(arr[i] != arr[i+1] && i != 0){
                tr = true;
                s = arr[i+1];
            }
            else{
                i++;
            }

        }
        return s;
    }
}