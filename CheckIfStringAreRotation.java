public class CheckIfStringAreRotation {
    public static void main(String []args){
        System.out.println(areRotation("ABAB","ABBA"));
    }
    
    public static boolean areRotation(String str1, String str2){
        if (str1.length()!=str2.length()){
            return false;
        }
        return ((str1+str1).indexOf(str2)>=0);
    }
}
// we need to check if str2 is a rotation of str1. Can we get str2 by rotating str1. 
// we concatenate str1 with str1. if str2 present in this it means that str2 is rotation of str1.

//linear time solution. 