import java.util.*;

class FrequencyInAString{
    public static void main(String args[]){
        String str="geeksforgeeks";
        //array of length 26 
        int[] countArray= new int[26]; 
        for (int i=0;i<str.length();i++){
            //'a'== 97
            countArray[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if (countArray[i]>0){
               System.out.println((char)(i+'a')+"-"+ countArray[i]);
    
            }
        }

        /* //Map implementation but this will show the chracters in insertion order and not in sorted order
        Map<Character,Integer> charMapCount = new LinkedHashMap<>();
		
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if(c == ' ')
				continue;
			if(charMapCount.containsKey(c)) {
				charMapCount.put(c, charMapCount.get(c)+1);
			}else {
				charMapCount.put(c, 1);
			}
		}
		
		charMapCount.forEach((k,v)->System.out.println(k+":"+v));

        //sort the map by key
        sortMapByKey(charMapCount); */
     
 
    }


    public static void sortMapByKey(Map<Character,Integer> charMapCount)
    {
        ArrayList<Character> sortKeys
            = new ArrayList<Character>(charMapCount.keySet());
 
        Collections.sort(sortKeys);
 
        // Getting value for each key and displaying
        // results.
        for (Character x : sortKeys)
            System.out.println("Key = " + x
                               + ", Value = " + charMapCount.get(x));
    }
}