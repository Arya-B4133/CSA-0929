import java.io.*;
import java.util.Scanner;
public class Main{
    public static int fib(int n){
        if (n==0||n==1){
            return n;
        }else{
            return n=fib(n-1)+fib(n-2);
        }                 
    }
    public static void main(String[] args){
        int n=10;
        System.out.println("---FIBONACCI SERIES---");
        for(int i=0;i<=10;i++){
            System.out.print(fib(i)+" ");
        }System.out.println();
        System.out.println("The fibonacci number at the "+n+"th index is "+fib(n-1));
        
    }
}
/*
OUTPUT
---FIBONACCI SERIES---
0 1 1 2 3 5 8 13 21 34 55 
The fibonacci number at the 10th index is 34
*/