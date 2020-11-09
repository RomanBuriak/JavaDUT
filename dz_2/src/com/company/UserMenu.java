package com.company;

import java.io.IOException;

public class UserMenu {
    public void ActionSelection() throws IOException {

        System.out.println("1. Work with an ArrayList");
        System.out.println("2. Work with an LinkedList");
        System.out.println("3. Work with an Serialization and Deserialization");
        System.out.println("4. Work with an Stack");
        System.out.println("5. Work with an Queue");
        System.out.println("Choose what you want:");
        int numberAction = System.in.read();


        switch (numberAction){
            case 1:

                System.out.println("1. Add item to ArrayList");
                System.out.println("2. Remove item from ArrayList");
                System.out.println("3. Print the size of the ArrayList");
                System.out.println("4. Check if the name you entered is in the ArrayList");
                System.out.println("Choose what you want:");
                break;
            case 2:

                System.out.println("1. Add item to LinkedList");
                System.out.println("2. Remove item from LinkedList");
                System.out.println("3. Print the size of the LinkedList");
                System.out.println("4. Check if the name you entered is in the LinkedList");
                System.out.println("Choose what you want:");
                break;
            case 3:
                System.out.println("");
                System.out.println("4. Check if the name you entered is in the LinkedList");
                System.out.println("Choose what you want:");
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }

    public void InstantiatingClasses(){

    }
}
