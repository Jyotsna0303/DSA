//check if a number is prime

import java.util.Scanner;

public class CheckPrime {
  //time complexity=O(n)
    public boolean ifPrime(int n){
        for (int i=2;i<=n/2; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
     //time complexity= O(sqrt(n))
    //n=a*b where a<=sqrt(n) and b>=sqrt(n)
    public boolean sqPrime(int n){
        for (int i=2;i*i<=n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= input.nextInt();
        CheckPrime c=new CheckPrime();
        System.out.println(c.naivePrime(n));
    }

}
