class Solution {
    public int trap(int[] height) {
        int trappedWater=0;
		int n=height.length;
        int left=0;
		int right=n-1;
		int lMax=0,rMax=0;
		
		while(left<right) {
			lMax=Math.max(lMax,height[left]);
			rMax= Math.max(rMax,height[right]);
			if(lMax<rMax) {
				trappedWater+= lMax-height[left];
				left++;
			}else {
				trappedWater+=rMax-height[right];
				right--;
			}
		}
		return trappedWater;
    }
}
