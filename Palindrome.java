import java.io.*;
public class Palindrome{
    public static void main(String[] args){
        int n=121;
        int temp=n;
        int rev=0;
        while (temp!=0){
            rev=rev*10+(temp%10);
            temp/=10;
        }if (rev==n){
            System.out.println(rev+" is a palindrome");
        }else{
            System.out.println(n+" is not a palindrome");
        }
    }
}