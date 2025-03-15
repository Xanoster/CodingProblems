package com.company;

public class Inverted_half_pyramid_Number {
    public static void Inverted_half(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
Inverted_half(5);
    }
}
