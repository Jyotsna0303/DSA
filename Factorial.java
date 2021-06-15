// Initial Template for Java
//Given a positive integerN. The task is to find factorial of N.
// Your task is to complete the function factorial() that takes N as parameter and returns factorial of N.

/*Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Constraints:
0 <= N <= 18 */
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking testcases
        int T = sc.nextInt();
        while (T-- > 0) {
            
            //creating an object of class Factorial
            Solution obj = new Solution();
            int N;
            
            //taking N
            N = sc.nextInt();
            
            //calling factorial() method 
            //of class Factorial
            System.out.println(obj.iterativeFactorial(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    // time complexity O(N)
    //Space complexity O(N)
    public long recursiveFactorial(int N) {
        // Your code here
        if (N==0 || N==1){
          return 1;  
        }
        else {
            return N*factorial(N-1);
        }
}
    
    public static long tailRecursive(int N,int a){
        if (N==0|| N==1){
            return a;
        }
        return tailRecursive(N-1,N*a);
    }
     // time complexity O(N)
    //Space complexity O(1)
    public long iterativeFactorial(int N) {
        // Your code here
        if (N==0 || N==1){
          return 1;  
        }
        else {
            long fact=1;
            for (int i=1;i<=N;i++){
               fact = fact*i;
             }
           return fact;
        }
    
    
}
