class Solution {
    public String decodeString(String s) {
        Stack<Integer> s1 = new Stack<>();
		Stack<String> s2 = new Stack<>();
		int count =0;
		StringBuilder curr_str = new StringBuilder();
		
		for(char c:s.toCharArray()) {
			if(Character.isDigit(c)) {
				count = count * 10 + Character.getNumericValue(c);
			}else if(c=='[') {
				s1.push(count);
				s2.push(curr_str.toString());
				count=0;
				curr_str = new StringBuilder();
			}else if(Character.isLetter(c)) {
				curr_str.append(c);
			}else if(c==']') {
				 int popCount = s1.pop();
				 String prev_str = s2.pop();
				 StringBuilder decoded = new StringBuilder();
				 while(popCount>0) {
					 decoded.append(curr_str);
					 popCount--;
				 }
				 curr_str = new StringBuilder(prev_str + decoded.toString());
			}
		}
		return curr_str.toString();
    }
}