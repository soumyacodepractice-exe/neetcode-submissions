class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if(s1.length()>s2.length()) return false;
		int k = s1.length();
		int [] f1 = new int [26];
		
		for(char c:s1.toCharArray()) {
			f1[c-'a']++;
		}
		
		int [] f2 = new int [26];
		for(int i=0;i<k;i++) {
			f2[s2.charAt(i)-'a']++;
		}
		if(Arrays.equals(f1, f2)) return true;
		
		for(int i=k;i<s2.length();i++) {
			f2[s2.charAt(i-k)-'a']--;
			f2[s2.charAt(i)-'a']++;
			if(Arrays.equals(f1, f2)) return true;
		}
		return false;
    }
}
