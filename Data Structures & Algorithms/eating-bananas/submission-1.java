class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
		int right = 0;

		for (int pile : piles) {
		    right = Math.max(right, pile);
		}
		while (left < right) {

		    int mid = left + (right - left) / 2;

		   
		    
		    int requiredHours = 0;

		    for (int pile : piles) {

		    	//requiredHours += (int) Math.ceil((double) pile / mid);
		    	requiredHours += (pile + mid - 1) / mid;
		    }

		    if (requiredHours <= h) {
		        right = mid;
		    } else {
		        left = mid + 1;
		    }
		}

		return left;
    }
}
