package com.company;

import java.util.Arrays; //for sorting
import java.util.Collections;

//for reverse order
public class inbuiltSort {
    public static void printArr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer a[] = {6, 7, 3, 4, 9};
        
        Arrays.sort(a);
        printArr(a);

        System.out.println();

        Arrays.sort(a, Collections.reverseOrder()); //for this int should be Integer
        printArr(a);
    }
}
