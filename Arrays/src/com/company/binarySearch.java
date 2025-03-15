package com.company;

public class binarySearch {
    public static int Binary(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            //comparisons
            if (numbers[mid] == key) {
              return mid;
            }
            //right
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
int number[]={3,45,4,12,66,56};
int key=8;
        System.out.println(Binary(number,key));
    }
}
