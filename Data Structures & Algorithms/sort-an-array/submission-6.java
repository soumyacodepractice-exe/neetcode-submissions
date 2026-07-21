class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);

		return nums;
    }
	private static void quickSort(int[] nums, int left, int right) {
		if(left>=right) {
			return;
		}
		
		int pivotIndex=(left+right)/2;
		int pivot=nums[pivotIndex];
		int i = left;
	    int j = right;

	    while (i <= j) {
	            while (nums[i] < pivot) i++; 
	            while (nums[j] > pivot) j--;
	            
	            if(i<=j) {
	            	int temp=nums[i];
	            	nums[i]=nums[j];
	            	nums[j]=temp;
	            	i++;
	            	j--;
	            }
	            
	    }
	    quickSort(nums, left, j);
        quickSort(nums, i, right);
	}
}