package com.company;

public class maxSubarray {

    //Bruteforce method

    public static void maxSubarray_Bruteforce(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += number[k];
                }
                System.out.println(currSum);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("\nMAX sum is " + maxSum);
    }

    //Prefix method
    public static void maxSubarray_Prefix(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
//for prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j <number.length; j++) {
                //i=start j=end
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("MAX sum is " + maxSum);
    }

    // KADANS ALGORITHM

    public static void maxSubarray_Kadans(int number[]){
            int maxSum=Integer.MIN_VALUE;
            int currSum=0;

            for(int i=0;i< number.length;i++){
               currSum+=number[i];

                //positive array
//                if(currSum<0){
//                    currSum=0;

                    //both positive and negative
                   if(currSum<number[i]){
                       currSum=number[i];
                }
                maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("Max sum is "+maxSum);
    }
    public static void main(String[] args) {
        int number[] = {-3, -2, 6, 1, 3};
        maxSubarray_Kadans(number);
    }
}
