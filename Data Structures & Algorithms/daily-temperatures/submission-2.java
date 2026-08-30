class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n= temperatures.length;
		//Stack<Integer> s = new Stack<>();
        Deque<Integer> s = new ArrayDeque<>();
		int [] res = new int [n];
		for(int i=0;i<n;i++) {
			while(!s.isEmpty()&& temperatures[i]>temperatures[s.peek()]) {
				int popIndex = s.pop();
				res[popIndex] = i-popIndex;
			}
			s.push(i);
		}
		return res; 
    }
}
