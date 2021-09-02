import java.util.*;
import java.lang.Math;

class Sorting
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 new Solution().insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}// } Driver Code Ends

// Time complexity of Insertion sort is O(n^2) in worst and avg case and O(n ) in best case 

class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       int key=arr[i], j;
       
       for( j=i-1;j>=0 && arr[j]>key;j--){
           arr[j+1]=arr[j];
       }
       arr[j+1]=key;
       
       
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      int index;
      for (int i=1;i<n;i++){
          index=i;
          insert(arr,index);
      }
      
      
  }

  // insertion sort in one function and two loops
  public void static insertionSorInOne(int arr[], int n){
      int key,j;
      for (int i=0;i<n;i++){
          key=arr[i];
          for ( j=i-1;j>=0 && arr[j>key];j--){
                arr[j+1]=arr[j];
          }
          arr[j+1]=key;
      }

  }
}