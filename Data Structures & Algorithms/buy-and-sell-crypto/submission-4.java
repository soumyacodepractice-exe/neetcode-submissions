class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
		
		int j=0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i]<prices[j]) {
				  j = i;
				continue;
			}
			int currProfit=prices[i]-prices[j];
			maxProfit = Math.max(maxProfit, currProfit);
		}
		
		return maxProfit==Integer.MIN_VALUE?0:maxProfit; 
    }
}
