package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkWithArrayList {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> arrlist = new ArrayList<String>();
    public void AddItem(){
        System.out.println("How many elements do you want to add?");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Enter the word you want to add to the arraylist: ");
            arrlist.add(scanner.next());
        }
    }
    public void RemoveItem(){
        arrlist.remove(arrlist.size()-1);
        System.out.println("the last added item has been removed");
    }
    public void OutListSize(){
        System.out.print("Currently list size: ");
        System.out.println(arrlist.size());
    }
    public void CheckContainList(){
        System.out.println("Enter the word you want to check for presence in the list: ");
        String s = scanner.next();
        if (arrlist.contains(s))
        {
            System.out.println("ArrayList contains " + s);
        }
    }
}
