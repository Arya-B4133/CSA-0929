import java.io.*;
public class Binary2Octal{
    public static void main(String[] args){
        int[] n = {0, 0, 1, 1};
        int[] arr=new int[1000];
        int i,exp=0,j=0,result=1, dc=0, k=0;
        for ( i = 0 ; i < n.length ; i++ ){
            result=1;
            for ( j=0 ; j<exp ; j++ ){
                result*=2;
            }
            dc += ( result * n[i]) ;
            exp++;
        }int temp = dc;
        int oc;
        while ( temp != 0 ){
            oc = temp % 8 ;
            arr[k]=oc;
            k++;
            temp/=8;
        }System.out.print("The Binary number:");
        for(i=n.length-1;i>=0;i--){
            System.out.print(n[i]);
        }System.out.print("\nThe Octal Number:");
        for(i=k;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}

/*
OUTPUT--
The Binary number:1100
The Octal Number:014
=== Code Execution Successful ===
*/