import java.io.*;
import java.util.Scanner;
public class pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER TO BE PRINTED:");
        int n = sc.nextInt();
        System.out.print("ENTER THE NUMBER OF ROWS:");
        int x = sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n);
            }System.out.println();
        }for(int k=(x-1);k>0;k--){
            for(int q=1;q<=k;q++){
                System.out.print(n);
            }System.out.println();
        }
    }
}
/*
OUTPUT-
ENTER THE NUMBER TO BE PRINTED:1
ENTER THE NUMBER OF ROWS:3
1
11
111
11
1
*/