import java.util.Arrays;

public class CheckIfAnagram {
    public static void main(String args[]){
        String s1="listen";
        String s2="silent";
        System.out.println(checkAngram(s1,s2)); //naive solution
        System.out.println(checkAnagramCharacterCountingTechnique(s1,s2)); 
    }
    //O(nlogn)= time
    public static String checkAngram(String s1, String s2){
        if (s1.length()!=s2.length()){
            return "NO";
        
        }
        char[] array1=s1.toCharArray();
        char[] array2=s2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        s1=new String(array1);
        s2=new String(array2);
        if (s1.equals(s2)){
            return "YES";
        }
        return "NO";
    }

    //time=O(len1+CHAR) space=O(CHAR)
    public static String checkAnagramCharacterCountingTechnique(String s1, String s2){
        if (s1.length()!=s2.length()){
            return "NO";
        
        }
        final int CHAR=256;
        int[] count= new int[CHAR];
        for (int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return "NO";
            }
        }
        return "YES";
    }
}
