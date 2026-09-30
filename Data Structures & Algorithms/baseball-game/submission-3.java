class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> sc = new Stack<>();

		for (String s : operations) {
			if (s.equals("C")) {
				sc.pop();
			} else if (s.equals("+")) {
				int lastInt = sc.pop();
				int secLastInt = sc.peek();
				sc.push(lastInt);
				sc.push(lastInt + secLastInt);

			} else if (s.equals("D")) {
				sc.push(sc.peek() * 2);
			} else {
				sc.push(Integer.parseInt(s));
			}
		}
		int total=0;
		while(!sc.isEmpty()) {
			total+=sc.pop();
		}
		return total;
    }
}