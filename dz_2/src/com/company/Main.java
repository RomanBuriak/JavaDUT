package com.company;
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        WorkWithArrayList wwal = new WorkWithArrayList();
        WorkWithLinkedList wwll = new WorkWithLinkedList();
        SerializationUtil su = new SerializationUtil();

        wwal.AddItem();
        wwal.RemoveItem();
        wwal.OutListSize();
        wwal.CheckContainList();

        wwll.AddItem();
        wwll.RemoveItem();
        wwll.OutListSize();
        wwll.CheckContainList();

        su.SerializationMethod();
        su.DeserializationMethod();

    }
}

