package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class WorkWithLinkedList {
    Scanner scanner = new Scanner(System.in);
    LinkedList<String> linkedlist = new LinkedList<String>();
    public void AddItem(){
        System.out.println("How many elements do you want to add?");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Enter the word you want to add to the linkedlist: ");
            linkedlist.add(scanner.next());
        }
    }
    public void RemoveItem(){
        linkedlist.remove(linkedlist.size()-1);
        System.out.println("the last added item has been removed");
    }
    public void OutListSize(){
        System.out.print("Currently list size: ");
        System.out.println(linkedlist.size());
    }
    public void CheckContainList(){
        System.out.println("Enter the word you want to check for presence in the list: ");
        String s = scanner.next();
        if (linkedlist.contains(s))
        {
            System.out.println("Linkedlist contains " + s);
        }
    }
}
