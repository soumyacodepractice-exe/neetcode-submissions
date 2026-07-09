class Solution {
    public String longestCommonPrefix(String[] strs) {
		String prefix=strs[0];//bag
		for(int i =0;i<strs.length-1;i++) {
			String current =strs[i+1];//bat
			int n  = Math.min(prefix.length(), current.length());
			String s  ="";
			for(int j=0;j<n;j++) {
				if(prefix.charAt(j)==current.charAt(j)) {
					s+=prefix.charAt(j);//ba
				}else {
					break;
				}
			}
			prefix=s;//ba
		}
        return prefix;
    }
}