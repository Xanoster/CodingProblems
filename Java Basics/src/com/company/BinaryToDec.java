package com.company;

import java.util.Scanner;

public class BinaryToDec {
    public static int binToDec(int binary) {
        int Decimal = 0;
        int pow = 0;
        while (binary > 0) {
            int LastDigit = binary % 10;
            Decimal = Decimal + LastDigit * (int) Math.pow(2, pow);
            pow++;
            binary = binary / 10;
        }
        return Decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        System.out.print("Decimal of " + binary + " is ");
        System.out.println(binToDec(binary));
    }
}
