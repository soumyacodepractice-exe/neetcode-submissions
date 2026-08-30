class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
		for(String s:operations) {
			if(s.equals("C")) {
				if(!stack.isEmpty()) {
					stack.pop();
				}
			}else if(s.equals("D")) {
				if(!stack.isEmpty()) {
					stack.push(stack.peek()*2);
				}
			}else if(s.equals("+")) {
				if(!stack.isEmpty()) {
					int last = stack.pop();
					int secondLast = stack.peek();
					stack.push(last);
					stack.push(last+secondLast);
				}
			}else {
				stack.push(Integer.parseInt(s));
			}
		}
		int total=0;
		while(!stack.isEmpty()) {
			total+=stack.pop();
		}
		return total;
    }
}