class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();
		Set<List<Integer>> uniqtrip = new HashSet <>();
		
		for(int i=0;i<nums.length;i++) {
			int target = -nums[i];
			Set<Integer> set = new HashSet<>();
			for(int j=i+1;j<nums.length;j++) {
				int compliment = target - nums[j];
				
				if(set.contains(compliment)) {
					List<Integer> list = Arrays.asList(nums[i],nums[j],compliment);
					Collections.sort(list);
					uniqtrip.add(list);
				}
				set.add(nums[j]);
			}
			
		}
		res.addAll(uniqtrip);
        return res;  
    }
}
