

import java.util.ArrayList;
import java.util.Scanner;

//Find all prime factors of a number
public class AllPrimeFactors {
    public static void findAllPrimeFactors(int n ){
        ArrayList<Integer> arrayList= new ArrayList<>();
        while (n%2==0){
           arrayList.add(2);
           n=n/2;
        }
        for (int i=3;i<=Math.sqrt(n);i+=2){
            while (n%i==0){
              /*  System.out.println("n:"+n);
                System.out.println("i:"+i);*/
                arrayList.add(i);
                n=n/i;
            }
        }
        if (n>2){
            arrayList.add(n);
        }
        System.out.println("PrimeFactors are:");
        for (int i:arrayList){
            System.out.println(i+",");
        }
    }
  public static void main(String[] args){
      Scanner input= new Scanner(System.in);
      System.out.println("Enter the number:");
      int n=input.nextInt();
      findAllPrimeFactors(n);
  }
}
