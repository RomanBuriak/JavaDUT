package com.company;

public class RecursiveDigitalRoot {
    public int getRecursiveDigitalRoot(int n){

        if(n == 0){
            return 0;
        }
        else{
            return (n % 10 + getRecursiveDigitalRoot(n/10)) < 10? n % 10 + getRecursiveDigitalRoot(n/10): getRecursiveDigitalRoot(n % 10 + getRecursiveDigitalRoot(n/10));
        }
    }
}
