class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
		int right=0;
		for(int weight :weights) {
			left=Math.max(left, weight);
			right+=weight;
		}
		while(left<right) {
			int mid = left+(right-left)/2;
			
			int reqDays=1;
			int curr_weight=0;
			
			for(int weight:weights) {
				curr_weight+=weight;
				if(curr_weight>mid) {
					curr_weight=weight;
					reqDays++;
				}
			}
			
			if(reqDays<=days) {
				right=mid;
			}else {
				left=mid+1;
			}
		}
		return left;
    }
}