import java.io.*;
public class Skipping{
    public static void main(String[] args){
        int digit=1,n=10,s=5;
        System.out.print("Counting till :"+n+" numbers \n 1 ");
        for(int i=1;digit<n;i++){
            i+=5;
            System.out.print(i+" ");
            digit++;
            }
    }
}
/*
OUTPUT--
Counting till :10 numbers 
 1 6 12 18 24 30 36 42 48 54 
=== Code Execution Successful ===
*/