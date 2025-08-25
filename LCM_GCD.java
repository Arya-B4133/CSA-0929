import java.io.*;
public class LCM_GCD{
    public static void main(String[] args){
        int gcd=1,i,j,lcm;
        int a=3,b=6;
        if (a > b){
            i=b;
        }else{
            i=a;
        }for (j=i;j>=0;j--){
            if ( a%j==0 && b%j==0 ){
                gcd=j;
                break;
            }
        }lcm=(a*b)/gcd;
        System.out.print("The Greatest Common Divisor (GCD) is:"+gcd+"\nThe Least Common Multiple is:"+lcm);
    }
}
/*

OUTPUT--
The Greatest Common Divisor (GCD) is:3
The Least Common Multiple is:6
=== Code Execution Successful ===
*/
