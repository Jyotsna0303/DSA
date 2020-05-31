/*Given a positive integer value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.

Input:
The first line contains integer T, denoting number of test cases. Then T test cases follow. The only line of each test case contains an integer N.

Output:
For each testcase, in a new line, print the answer of each test case.

Your Task:
This is a function problem. You only need to complete the function exactly3Divisors() that takes N as parameter and returns count of numbers less than or equal to N with exactly 3 divisors. */




//User function Template for Java
class Divisors
{
    public boolean isPrime(int n)
    {
        if(n<=1)
        return false;
        
        for(int i=2;i<=Math.sqrt(n);i++)
        if(n%i==0)
        return false;
        
        return true ;
    }
    
    // function to check if n is perfect square
    public boolean isPerfectSquare(int n)
    {
        int root=(int)Math.sqrt(n);
        return root*root==n;
    }
    
    // function to check the numbers which has exactly 3 divisors
    public int exactly3Divisors(int N)
    {
        int counter=0; //Initializing counter to zero
            
        for(int i=1;i<=N;i++) //Running a loop from 1 to N
        {
            if(isPerfectSquare(i)&&isPrime((int)Math.sqrt(i))) //A number N only has 3 divisors if it is a perfect square and its square root is a prime number
            counter++;
        }
        return counter;
    }
         
}

