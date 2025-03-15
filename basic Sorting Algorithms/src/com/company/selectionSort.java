package com.company;

public class selectionSort {
    public static void selectSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void printArr(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = {5, 4, 3, 2, 1};
        selectSort(a);
        printArr(a);
    }
}
