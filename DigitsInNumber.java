// Find the number of digits in a number
public class DigitsInNumber {
    //iterative solution
    //time complexity= O(n)
    public int iterativeSolution(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
  
    public long iterativeSolution(long n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }


    //recursive solution
    // time complexity O(log n)
    public int recursiveSol(int n){

        if (n==0){
            return 0;
        }
        return 1+ recursiveSol(n/10);
    }


    //logarithmetic question
    // if log n= 1.5655.. (log base 10) then n will have 1+1 digits
    //time complexity=O(1)
    public int logSolution(int n){
        if (n>0) {
            return (int) Math.floor(Math.log10(n) + 1);
        }
        return 0;
    }

    public static void main(String[] args){
        DigitsInNumber d= new DigitsInNumber();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int n=input.nextInt();
       // long l= 564890089;
        System.out.println("Solution with iterative approach:"+d.iterativeSolution(n));
       // System.out.println("Iterative sol for long:"+d.iterativeSolution(l));
        System.out.println("Solution with recursive approach:"+d.recursiveSol(n));
        System.out.println("Solution with log approach::"+d.logSolution(n));
    }

}
