class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] res = new int [k];
		Map<Integer,Integer> map=new HashMap<>();
		for(int n:nums) map.put(n, map.getOrDefault(n, 0)+1);
		
		List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

		entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
		
		for(int i=0;i<k;i++) {
			res[i]=entryList.get(i).getKey();
		}
        return res;
    }
}
