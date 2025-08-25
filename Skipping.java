import java.io.*;
public class Skipping{
    public static void main(String[] args){
        int n=10,s=5;
        System.out.print("Counting till :"+n+"\nSkipping:"+s+"\n");
        for(int i=1;i<=n;i++){
            if(i!=5){
                System.out.print(i+" ");
            }else{
                continue;
            }
        }
    }
}

/*
OUTPUT--
Counting till :10
Skipping:5
1 2 3 4 6 7 8 9 10 
=== Code Execution Successful ===
*/