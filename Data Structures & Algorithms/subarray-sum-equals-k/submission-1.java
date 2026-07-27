class Solution {
    public int subarraySum(int[] nums, int k) {
    int sum;
    int c=0;
       for(int l=0;l<nums.length;l++){ 
          sum=0;
          for(int r=l;r<nums.length;r++){
            sum+=nums[r];
            if(sum==k)
            c++;
          } 
       }
       return c;
    }
}