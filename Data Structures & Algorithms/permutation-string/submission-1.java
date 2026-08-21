class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
		if (s1.length() > s2.length()) {
		    return false;
		}
		StringBuilder s3= new StringBuilder(s2.substring(0,k));

		if(isAnagram(s1, s3.toString())) return true;
		for(int i=k;i<s2.length();i++) {
			s3.deleteCharAt(0);
			s3.append(s2.charAt(i));
			if(isAnagram(s1, s3.toString())) {
				return true;
			}
		}
        return false;
    }
    private boolean isAnagram (String s1 , String s2) {
		int [] arr = new int[26];
		
		for(int i=0;i<s1.length();i++) {
			arr[s1.charAt(i)-'a']++;
		}
		for(int i=0;i<s2.length();i++) {
			arr[s2.charAt(i)-'a']--;
		}
		for(int n:arr) {
			if(n!=0) {
				return false;
			}
		}
		
		return true;
	}
}
