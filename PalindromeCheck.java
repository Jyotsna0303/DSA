class PalindromeCheck{
    public static void main(String[] args) {
		String str= "ABCCBA";
		//int len=str.length();
		System.out.println(checkPalindrome(str));
	
	}
    	
	public static boolean checkPalindrome(String str){
	    int begin=0;
		int end=str.length()-1;
		while(begin<end){
		    if (str.charAt(begin)!=str.charAt(end)){
		        return false;}
		 begin++;
		 end--;
		}
		return true;
	}
	
}