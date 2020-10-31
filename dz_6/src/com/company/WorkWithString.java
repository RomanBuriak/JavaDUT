package com.company;

import java.util.Scanner;

public class WorkWithString {
    StringBuilder savedString = new StringBuilder();

    public void userMenu(){
        int choise;
        boolean exit = false;
        while (exit == false){
            System.out.println("Ввести нове значення - 1");
            System.out.println("Вивести на екран всі введені слова - 2");
            System.out.println("Вийти - 3");
            System.out.println("Вибери що хочеш зробити: ");
            Scanner scanner = new Scanner(System.in);
            choise = scanner.nextInt();
            switch (choise){
                case 1:
                    System.out.println("Введіть значення: ");
                    enterValue();
                    break;
                case 2:
                    System.out.println(savedString);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    break;

            }
        }
    }

    private void enterValue(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder addNewString = new StringBuilder();
        addNewString.append(scanner.nextLine());
        String str, str2;
        if(addNewString.charAt(0) == '-'){
            str = savedString.deleteCharAt(0).toString();
            str2 = addNewString.deleteCharAt(0).toString();
            if(str.contains(addNewString.deleteCharAt(0))){
                int index = str2.indexOf(str2);
                savedString.delete(index,addNewString.length()+2);
            }
            else {
                System.out.println("Такого значення немає в рядку");
            }
        }
        else if(addNewString.charAt(0) == '+'){
            savedString.append(addNewString.deleteCharAt(0) + ", ");
        }
        else{
            System.out.println("На початку має стояти + або - ");
        }




    }
}
