import java.io.*;
public class ReverseTriangle{
    public static void main(String[] args){
        int i,j,n=5;
        for(i=n;i>0;i--){
            for (j=i;j>0;j--){
                System.out.print(" * ");
            }System.out.println();
        }
    }
}
/*
OUTPUT
 *  *  *  *  * 
 *  *  *  * 
 *  *  * 
 *  * 
 * 

=== Code Execution Successful ===
*/