package com.company;

import javax.naming.PartialResultException;

public class Main {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int myList[] = {1,5,10,15,20,25,30,35,40,45,50,60,75,80,95,100};

        System.out.printf("Search 1| ");
        bs.binarySearch(myList,100); // Found
        System.out.printf("Search 2| ");
        bs.binarySearch(myList, 47); // Not Found


    }

}
