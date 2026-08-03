class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0) {
			    return;
			}
		k = k % nums.length;
        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
		reverseArray(nums, k, nums.length-1);
		
    }
    private void reverseArray(int [] nums , int i,int j) {
		while(i<=j) {
			int temp = nums[i];
			nums[i] =nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
	}
}