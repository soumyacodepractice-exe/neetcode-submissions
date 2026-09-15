class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
		int right =0;
		for(int n:piles) {
			right=Math.max(n, right);
		}
		while(left<right) {
			int mid = left +(right-left)/2;
			int reqHours=0;
			for(int pile:piles) {
				reqHours += (int) Math.ceil((double) pile / mid);
			}
			
			
			if(reqHours<=h) {
				right=mid;
			}else {
				left=mid+1;
			}
		}
		return left;
    }
}
