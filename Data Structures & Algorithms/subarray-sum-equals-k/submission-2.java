class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
		int curr_sum=0;
		int count=0;
		map.put(0, 1);
		for(int i=0;i<nums.length;i++) {
			curr_sum += nums[i];
			if(map.containsKey(curr_sum-k)) {
				count+= map.get(curr_sum-k);
			}
			map.put(curr_sum, map.getOrDefault(curr_sum, 0)+1);
		}
        return count;
    }
}