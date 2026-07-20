class Solution {
    public boolean isPalindrome(String s) {
        String newStr="";
		for(char c:s.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				newStr+=c;
			}
		}
		StringBuilder sb = new StringBuilder(newStr);
		if(newStr.equalsIgnoreCase(sb.reverse().toString())) {
			return true;
		}
        return false;
    }
}
