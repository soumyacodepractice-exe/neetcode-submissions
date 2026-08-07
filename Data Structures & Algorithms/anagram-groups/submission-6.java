class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
		 Map<String,List<String>> map = new HashMap<>();
		 for(String s:strs) {
			 char [] keyArr = s.toCharArray();
			 Arrays.sort(keyArr);
			 String w = new String(keyArr);
			 if(map.containsKey(w)) {
				 map.get(w).add(s);
			 }else {
				 map.put(w, new ArrayList<String>());
				 map.get(w).add(s);
			 }
		 }
         List<List<String>> res = new ArrayList<>();
		 for(List<String> list : map.values()) {
			 res.add(list);
		 }
         return res;
    }
}
