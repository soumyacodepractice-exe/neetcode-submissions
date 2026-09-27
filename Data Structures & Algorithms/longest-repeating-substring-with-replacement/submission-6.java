class Solution {
    public int characterReplacement(String s, int k) {
        int maxFreq=0;
		int maxL=0;
		int [] arr = new int [26];
		int left=0;
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'A']++;
			
			maxFreq=Math.max(maxFreq, arr[s.charAt(i)-'A']);
			
			if((i-left+1)-maxFreq>k) {
				arr[s.charAt(left)-'A']--;
				left++;
			}
			maxL= Math.max(maxL, i-left+1);
		}
		return maxL; 
    }
}
