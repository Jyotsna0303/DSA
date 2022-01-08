public class LongestSubstringDistnictCharacters {
    public static void main(String []args){
        System.out.println(naiveLongestSubstring("abac"));
        System.out.println(betterLongestSubstring("aac"));

    }

    //time=O(n^3)
    public static int naiveLongestSubstring(String str){
        int res=0, len=str.length();
        //create all substrings
        for (int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(areDistinict(str,i,j)){
                    res=Math.max(res, (j- i) + 1);
                }
            }
        }
        return res;
    }

    //time=O(n)
    public static boolean areDistinict(String str,int i, int j){
        boolean [] visited= new boolean[256];
        for(int k=i;k<=j;k++){
            if(visited[str.charAt(k)]==true){
                return false;
            }
            visited[str.charAt(k)]=true;
        }
        return true;
    } 

    //time=O(n^2)
    //now we dont create visited array for each substring.
    public static int betterLongestSubstring(String str){
        int len=str.length(), res=0;
        for(int i=0;i<len;i++){
            boolean visited[]=new boolean[256];
            for(int j=i;j<len;j++){
                if(visited[str.charAt(j)]==true){
                    break;
                }
                else{
                    res=Math.max(res, j-i+1);
                    visited[str.charAt(j)]=true;

                }
            }
        }
        return res;
    }
}
