package com.company;
import java.util.Scanner;
public class palindrome {
    public static boolean Palindrome(int a){
    int rev=0;
     int b=a;
    while(a>0){
    int LastDigit=a%10;
    rev=rev*10+LastDigit;
    a=a/10;
    }
    if(rev==b){
        return true;
    }
   else{
       return false;
    }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
      if(Palindrome(a)){
          System.out.println("Palindrome");
      }
      else{
          System.out.println("Simple number");
      }
    }
}
