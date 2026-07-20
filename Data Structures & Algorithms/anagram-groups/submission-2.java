class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);

            String sorted = new String(arr);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }
        // List<List<String>> l = new ArrayList<>();
        // for(Map.Entry<String,List<String>> entry : map.entrySet()) {
        // 	l.add(entry.getValue());
        // }
    
        return new ArrayList<>(map.values());
    }
}
