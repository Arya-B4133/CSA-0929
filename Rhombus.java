import java.io.*;
public class Rhombus{
    public static void main(String[] args){
        int i,j,s,n=5;
        for (i=1;i<=n;i++){
            for(s=0;s<n-i;s++){
                System.out.print(" ");
            }for (j=0;j<n;j++){
                System.out.print(" * ");
            }System.out.println();
        }
    }
}
/*
OUTPUT
     *  *  *  *  * 
    *  *  *  *  * 
   *  *  *  *  * 
  *  *  *  *  * 
 *  *  *  *  * 

=== Code Execution Successful ===
*/
