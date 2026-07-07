class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int res = nums[i]+nums[j];
                if(res==target && i!=j){
                    return new int[]{i,j};
                }
            }
           
        }
        return new int[]{0,0};


    // int start = 0
    // int end = nums.length-1;
    // whille(start<end){
    //     int res = nums[start]+nums[end];
    //     if(res==target){
    //         return new int []{start,end}
    //     }
    // }
    // return new int[]{0,0};


    }
}
