class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> s = new ArrayDeque<>();

		for (int n : asteroids) {
			int current = Math.abs(n);
			if (n < 0 && (!s.isEmpty() && s.peekLast() > 0)) {

				while (current > 0 && (!s.isEmpty() && s.peekLast() > 0)) {
					if (Math.abs(n) > Math.abs(s.peekLast())) {
						s.removeLast();
					} else if (Math.abs(n) == Math.abs(s.peekLast())) {
						s.removeLast();
						current = 0;
						break;
					} else {
						current = 0;
						break;
					}
				}

			}
			if (current > 0)
				s.addLast(n);
		}
		int y = s.size();
		int [] res = new int [y];
		for(int i=0;i<y;i++) {
			res[i]=s.removeFirst();
		}
		return res;
    }
}