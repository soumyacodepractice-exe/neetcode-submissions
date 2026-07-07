class Solution {
    public boolean isAnagram(String s, String t) {
        int [] abc =  new int[26];
        for(char c :s.toCharArray()){
            abc[c-'a']++;
        }
        for(char c:t.toCharArray()){
            abc[c-'a']--;
        }
        for(int n:abc){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
