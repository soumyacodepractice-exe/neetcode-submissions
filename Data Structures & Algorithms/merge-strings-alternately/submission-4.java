class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
		 
		 int minLen = Math.min(word1.length(), word2.length());
		
		 for(int i =0;i<minLen;i++) {
			 sb.append(word1.charAt(i));
			 sb.append(word2.charAt(i));
		 }
		 if(word1.length()>minLen) sb.append(word1.substring(minLen));
		 
		 if(word2.length()>minLen) sb.append(word2.substring(minLen));
         return sb.toString();
    }
}