package com.company;

public class linearSearch {
    public static int Lsearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {23, 4, 5, 2, 21, 45};
        int key = 21;
        System.out.println(Lsearch(numbers, key));
    }
}
