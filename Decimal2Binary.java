import java.io.*;
public class Decimal2Binary{
    public static void main(String[] args){
        int[] arr=new int[1000];
        int i=0, j=0, n=8;
        int temp=n;
        while ( temp != 0 ){
            i = temp % 2;
            arr[j]=i;
            j++;
            temp/=2;
        }System.out.print("The decimal number:"+n+"\nThe Binary Number:");
        for (i=j-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
/*
OUTPUT--
The decimal number:8
The Binary Number:1 0 0 0 
=== Code Execution Successful ===
*/