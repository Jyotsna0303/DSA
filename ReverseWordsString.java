public class ReverseWordsString {
    public static void main(String []args){ 
        System.out.println("Reverse:"+reverseNaive("Welcome to geeksforgeeks"));
        
    }

    public static String reverseNaive(String str){
        String [] words=str.split(" "); 
        String ans="";
        for (int i=words.length-1; i>=0;i--) {
            ans += words[i]+ " ";
        }
        return ans;
    }
}

//naive approach: make a stack of words. Then make a new string with the words from the stack. 
//we can also make an Array of string in java and then make a new string from content of array.
//this will take O(n) ->auxillary space
