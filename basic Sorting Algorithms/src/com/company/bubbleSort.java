package com.company;

public class bubbleSort {
    public static void bubblesort(int a[]) {
        // i = turns
        // this is optimised code
        for (int i = 0; i < a.length-1; i++) {
            int swap = 0;
            for (int j = 0; j < a.length -1-i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap = 1;
                }
            }
            if (swap == 0) {
                break;
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
        int a[] = {5, 4, 3, 1, 2};
        bubblesort(a);
        printArr(a);
    }
}
