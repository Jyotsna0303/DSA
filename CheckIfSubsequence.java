public class CheckIfSubsequence {
    public static void main(String args[]){
        String str1="ABCDE";
        String str2="AED";
        //iterative time is same as recursive, space= O(1)
       System.out.println( checkSubsequence(str1, str2));
       //recursive Time =O(len1+len2) space= O(len1+len2)
       System.out.println( checkSubsequenceRecursive(str1, str2,str1.length(), str2.length()));
       
    }
    public static boolean checkSubsequence(String str1, String str2){
        if (str1.length()<str2.length()){
            return false;
        }
        int i=0,j=0;
      
        while(i<str1.length() && j<str2.length()){
            if (str2.charAt(j)==str1.charAt(i)){
                j++;
            }
            i++;
        }
        
        if (j==str2.length()){
            return true;
        }
        return false;
    }

    public static boolean checkSubsequenceRecursive(String str1, String str2, int len1, int len2){
        if(len2==0){
            return true;
        }
        if (len1==0){
            return false;
        }

        if (str1.charAt(len1-1)==str2.charAt(len2-1)){
            return checkSubsequenceRecursive(str1, str2,len1-1,len2-1);
        }
        else {
               return checkSubsequenceRecursive(str1, str2,len1-1,len2);
        }
       

    }

}
