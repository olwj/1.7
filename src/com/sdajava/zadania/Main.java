package com.sdajava.zadania;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static <E> void printArray(E[] inArray){
        for(E value: inArray)
        {
            System.out.println(value);
        }
    }

    public static <E> void printList(List<E>myList) {
        for (E value: myList);
    }

    public static void main(String[] args) {

        List <Integer> intList = new ArrayList<Integer>();

        intList.add(2);
        intList.add(21);
        intList.add(32);

         List <String> stringList = new ArrayList<String>();

        stringList.add("czesc");
        stringList.add("romek");
        stringList.add("tomek");
        stringList.add("atomek");

        printList(stringList);




    }
}
