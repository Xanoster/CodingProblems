package com.company;

public class largest_array {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest value is "+smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {23, 2, 45, 23,34, 93, 45};
        System.out.println("largest value is "+getLargest(numbers));
    }
}
