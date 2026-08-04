class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), i);
		}
		
		int start = 0;
		int end = 0;
		for(int j=0;j<s.length();j++) {
			int lastIndexOfCurrentCharacter = map.get(s.charAt(j));
			end = Math.max(end, lastIndexOfCurrentCharacter);
			if(end==j) {
				int partitionSize = end - start + 1;
				list.add(partitionSize);
				start = j+1;
			}
		}
		return list;
    }
}
