package com.company;

import java.util.ArrayList;

public class ActionsWithNumbers {

    public ArrayList<Integer> findMultiples(int x, int n){
        ArrayList<Integer> outList = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            outList.add(n * i);
        }
        return outList;
    }
}
