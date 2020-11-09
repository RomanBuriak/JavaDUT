package com.company;
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MyArrayList<Integer> mal = new MyArrayList<Integer>();
        MyLinkedList<Integer> mll = new MyLinkedList<Integer>();
        SerializationUtil su = new SerializationUtil();

        mal.add(1);
        mal.add(1);
        mal.add(1);
        mal.remove(1);
        System.out.println(mal.size());
        System.out.println(mal.contains(1));
        System.out.println();



        mll.add(1);
        mll.add(1);
        mll.add(1);
        mll.add(1);
        mll.add(1);
        mll.add(1);
        mll.remove(0);

        System.out.println(mll.size());

        System.out.println(mll.contains(1));

        su.SerializationMethod();
        su.DeserializationMethod();

    }
}

