//Initial Template for Java

/*package whatever //do not write package name here */
/*Given an array a[ ] of size N. The task is to find the median and mean of the array elements. Mean is average of the numbers and median is 
the element which is smaller than half of the elements and greater than remaining half. 
  If there are odd elements, the median is simply the middle element in the sorted array. 
 If there are even elements, then the median is floor of average of two middle numbers in the sorted array.
  If mean is floating point number, then we need to print floor of it.*/

import java.io.*;
import java.util.*;
class Mathematics {
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//testcase
		int T=sc.nextInt();
		
		//looping testcase
		while(T-->0)
		{
		    Solution obj=new Solution();
		    int N;
		    
		    //number of elements in array
		    N=sc.nextInt();
		    int a[]=new int [N];
		    
		    //inseting elements in the array
		    for(int i=0;i<N;i++)
		    {
		        int x=sc.nextInt();
		        a[i]=x;
		    }
		    
		    //calling mean() and median() functions
		    System.out.println(obj.mean(a,N)+" "+obj.median(a,N));
		   
		    
		}
		
	}
}



// } Driver Code Ends

//User function Template for Java

class Solution
{
  //Function to find median of the array elements.  
  public int median(int A[],int N)
    {
    
       Arrays.sort(A);
       if (N%2==0){
         return (A[(N/2)-1] + A[(N/2)])/2; // notice the n/2-1 here
       }
       else{
          return A[(N/2)]; 
       }
       //Your code here
       //If median is fraction then conver it to integer and return
       
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
       //Your code here
       int sum=0;
       for (int n: A){
           sum+=n;
       }
       return sum/N;
    }

}

