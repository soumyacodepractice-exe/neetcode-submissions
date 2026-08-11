class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			if(i>0 && nums[i]==nums[i-1]) continue;
			int left=i+1;
			int right= nums.length-1;
			
			while(left<right) {
				int sum = nums[i]+nums[left]+nums[right];
				if(sum==target) {
					List<Integer> list = Arrays.asList(nums[i],nums[left],nums[right]);
					res.add(list);
					left++;
					right--;
					while (left < right && nums[left] == nums[left - 1]) {
				        left++;
				    }

				    while (left < right && nums[right] == nums[right + 1]) {
				        right--;
				    }
				}else if(sum>target) {
					right--;
				}else {
					left++;
				}
			}
			
		}
		return res;
    }
}
