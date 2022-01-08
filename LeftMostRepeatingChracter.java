public class LeftMostRepeatingChracter {

    
    public static void main(String []args){
        System.out.println("index : " + repeatingCharacter("geeksforgeeks"));
    }

    //O(n) 
    public static int repeatingCharacter(String str){
        final int  CHAR= 256;
        int[] countArray= new int[CHAR];
        for(int i=0;i<str.length();i++){
            countArray[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if (countArray[str.charAt(i)]>1){
                return i;
            }
        }
        return -1;
    }

    //naive solution is to run two loops, for every character check if it exists in the remaining string. O(n^2)
}
