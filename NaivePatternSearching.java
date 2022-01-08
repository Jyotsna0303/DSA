public class NaivePatternSearching {
    public static void main(String []args){
        patterSearch("geeksforgeeks", "eks");
        improvedPatternSearch("geeksforgeeks","eks");
    }

    //O((n-m+1)*m)
    public static void patterSearch(String text, String pattern){
        int n=text.length();
        int m=pattern.length();
        for(int i=0;i<=n-m;i++){//text
            int j;
            for (j=0;j<m;j++){
                if (text.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }
            }
            if (j==m){
                System.out.println(i);
            }
            
        }

    }

    public static void improvedPatternSearch(String text, String pattern){
        int n=text.length();
        int m=pattern.length();
        for(int i=0;i<=n-m;){//text
            int j;
            for (j=0;j<m;j++){
                if (text.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }
            }
            if (j==m){
                System.out.println(i);
            }
            if (j==0){//if first character of pattern doesnt match, then slide by one
                i++;
            }
            else
                i+=j;
            
        }

    }
}
