class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if(i>0 && nums[i-1]==nums[i]) continue;
			for (int j = i + 1; j < nums.length; j++) {
				if(j>i+1 && nums[j-1]==nums[j]) continue;
				int left = j + 1;
				int right = nums.length - 1;
				while (left < right) {
					long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

					if (sum == target) {
						List<Integer> list = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
						res.add(list);
						left++;
						right--;
						while(left<right && nums[left-1]==nums[left])left++;
						while(left<right && nums[right+1]==nums[right])right--;
					} else if (sum > target) {
						right--;
					} else {
						left++;
					}
				}
			}
		}
       return res;
    }
}