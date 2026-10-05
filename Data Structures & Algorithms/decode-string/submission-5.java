class Solution {
    public String decodeString(String s) {
        int num = 0;
		Stack<Integer> pNum = new Stack<>();
		Stack<String> pStr = new Stack<>();
		String curr_str = "";
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) {
			    num = num * 10 + Character.getNumericValue(c);
			}else if (c == '[') {
				pNum.push(num);
				num = 0;
				pStr.push(curr_str);
				curr_str = "";
			} else if (c == ']') {
				int prNum = pNum.pop();
				String prStr = pStr.pop();
				String repeated = "";
				while (prNum > 0) {
					repeated += curr_str;
					prNum--;
				}
				curr_str = prStr + repeated;
			} else {
				curr_str += c;
			}
		}
		return curr_str;
    }
}