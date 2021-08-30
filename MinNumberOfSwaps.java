import java.io.*;
class MinNumberOfSwaps
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    // This solution will give O(n^2 complexity)
    // To solve in O(nlogn ) use Graphs
    public int minSwaps(int nums[])
    {
        // Code here
        int n=nums.length, min_index, count=0, temp;
        for (int i=0;i<n-1;i++){
            min_index=i;
            for (int j=i+1;j<n;j++){
                if (nums[j]<nums[min_index]){
                   min_index=j;
                }
            }
            if (i!=min_index){
                temp=nums[min_index];
                nums[min_index]=nums[i];
                nums[i]=nums[min_index];
                count++;
            }
        }
        return count;
    }
}