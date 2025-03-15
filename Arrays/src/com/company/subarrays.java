package com.company;

public class subarrays {
    public static void printSubarrays(int number[]) {
        int sum = 0;      //each line
        int t = 0;        //triangle
        int total = 0;    //whole sum
        for (int i = 0; i < number.length; i++) { //start
            for (int j = i; j < number.length; j++) { //end
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + number[k];
                    total = total + number[k];
                    System.out.print(number[k] + " ");
                }
                t += sum;
                System.out.print(" = " + sum);
                System.out.println();
            }
            System.out.println("triangle sum is " + t);
            System.out.println();
            t = 0;
        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            max += number[i];
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.println("Total of numbers is " + total);
        System.out.println("Min value is " + min);
        System.out.println("Max value is " + max);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}
