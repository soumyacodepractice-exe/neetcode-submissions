class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         Deque<Integer> s = new ArrayDeque<>();
		int [] res = new int [temperatures.length];
		for(int i =0;i<temperatures.length;i++) {
			while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]) {
				int popIndex = s.pop();
				res[popIndex] = i-popIndex;
			}
			s.push(i);
		}
		return res;  
    }
}
