//Find reverse of integer number
import java.util.Scanner;

public class ReverseaNumber {
  
    //iterative approach
    //time complexity =O(log n)
    public int reverseIterative(int n){
        int reverse=0;
        while(n>0){
            reverse= reverse*10+(n%10) ;
            n=n/10;
        }
        return reverse;
    }

   //recursive approach--complete this
   public int reverseRecursive(int n){
        int rev=0;
        if (n==0){
            return 0;
        }
        return rev;

   }

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n=input.nextInt();
        ReverseaNumber r= new ReverseaNumber();
        System.out.println("Reverse:"+r.reverseIterative(n));
    }
}
