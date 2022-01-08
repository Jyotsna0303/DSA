public class LeftMostNonRepeating {
    
    public static void main(String []args){
        System.out.println(leftMostNonRepeating("geeksforgeeks"));
    }

    //O(n)
    public static int leftMostNonRepeating(String str){
        final int CHAR=256;
        int [] countArray=new int[CHAR];
        for(int i=0;i<str.length();i++){
            countArray[str.charAt(i)]++;
        }

        for(int i=0;i<str.length();i++){
            if(countArray[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;

    }
}

