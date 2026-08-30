class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n= temperatures.length;
		Stack<Integer> s = new Stack<>();
		int [] res = new int [n];
		for(int i=0;i<n;i++) {
			while(!s.isEmpty()&& temperatures[i]>temperatures[s.peek()]) {
				int popIndex = s.peek();
				res[popIndex] = i-popIndex;
				s.pop();
			}
			s.add(i);
		}
		return res; 
    }
}
