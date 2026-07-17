class Solution {
    public boolean isPalindrome(String s) {
	    int i=0;
        String n="";
        for(char c:s.toCharArray()) {
	    	if(Character.isLetterOrDigit(c)) {
	    		n+=c;
	    	}
	    }
        int j=n.length()-1;
	    while(i<j) {
            if (n.toLowerCase().charAt(i)!=n.toLowerCase().charAt(j)) {
                return false;
            }
            i++;
            j--;
	    }
	    return true;
    }
}
