package com.company;

public class diamondPattern {
    public static void diamond(int a) {

        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    //2nd half
    for (int i =a; i>=1; i--) {
        for (int j=1;j<=a-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
     diamond(4);
    }
}
