import java.io.*;
public class Armstrong{
    public static void main(String[] args){
        int n=153;
        int d=0, result=0;
        int temp=n;
        while(temp!=0){
            d++;
            temp/=10;
        }temp=n;
        while(temp!=0){
            int digit=temp%10;
            int power=1;
            for(int i=1;i<=d;i++){
                power*=digit;
            }
            result=result+power;
            temp/=10;
        }if(result==n){
            System.out.println(result+" is an armstrong number");
        }else{
            System.out.println(n+"is not an armstrong number");
        }
    }
}