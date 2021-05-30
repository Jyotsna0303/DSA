//Initial Template for Java

/*package whatever //do not write package name here */
//Given an integer N. Find the number of digits that appear in its factorial. 
//Factorial is defined as, factorial(n) = 1*2*3*4……..*N and factorial(0) = 1.
/*Your task is to complete the function digitsInFactorial() that takes N as input parameter and returns number of digits in factorial of N.


Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1) */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int T=sc.nextInt();
		
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    
		    //taking N
		    N=sc.nextInt();
		    
		   //calling method digitsInFactorial()
		   System.out.println(obj.digitsInFactorial(N));
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    // log solution  as no of digits in a number = Math.floor (log 10(number))+1
	//time complexity= O(N)
	//Space complexity=??
    public int digitsInFactorial(int N){
        // code here
        if(N==0 || N==1){
            return 1;
        }
        else{
            double digits=0;
         for (int i=2;i<=N;i++){
             digits += Math.log10(i);
         }
         return (int) Math.floor(digits)+1;
        }
    }
}
