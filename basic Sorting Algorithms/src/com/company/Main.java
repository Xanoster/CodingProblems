package com.company;

public class Main {
    public static int msearch(int arr[], int key) {
        int n = arr.length;
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[start] <= arr[mid]) {
                if (key >= arr[start] && key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                //if (arr[start] > arr[mid]) {
                    if (key > arr[mid] && key <= arr[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        return -1;
    }
        public static void main(String[] args) {
            int a[] = {4,5,6,7,8,1,2};
            int x=msearch(a,1);
            System.out.println(x);
        }
    }
