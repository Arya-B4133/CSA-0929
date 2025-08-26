import java.io.*;
public class R192424133{
    public static void main(String[] args){
        int i,j,n=3,sum=0, temp=0;
        for(i=2;i<=1000;i++){
            if (n>temp){
                sum=1;
            }for (j=2;j<i;j++){
                if (i%j==0){
                    sum+=j;
                }
            }if (sum==j){
                System.out.print(j+" ");
                temp++;
            }
        }
    }
}
/*OUTPUT-
6 28 496 
=== Code Execution Successful ===*/