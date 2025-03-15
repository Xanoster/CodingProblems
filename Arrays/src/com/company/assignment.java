package com.company;

public class assignment {

    // question 1
    public static boolean distinct(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // question 2

    // search pivot rotate array modified binary search

    public static int search(int number[], int target) {
        int start = 0;
        int end = number.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (number[mid] == target) {
                   return mid;
                }
               else if (number[start] <=number[mid]) {         //left part is sorted
                    if (target >= number[start] && target < number[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
               else {
                    if (number[start] > number[mid]) {        //right part is sorted
                        if (target <= number[end] && target > number[mid]) {
                            start = mid + 1;
                        } else {
                            end = mid - 1;
                        }
                    }
                }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {3,4,1};
        int x=search(a,1);
        System.out.println(x);
    }
}
