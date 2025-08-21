import java.io.*;
public class SumofDigits{
    public static void main(String[] args){
        int n=1234, sum=0;
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }System.out.println("The sum of digits is "+sum);
    }
}
/*OUTPUT
The sum of digits is 10

=== Code Execution Successful ===
*/