class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder("/");
		Deque<String> s = new ArrayDeque<String>();
		
		String[] parts = path.split("/");
		for (String part : parts) {
		   if(part.isEmpty() || part.equals(".")) continue;
		   
		   if(part.equals("..")) {
			   if(!s.isEmpty()) {
				   s.removeLast();
			   }
		   }else {
			   s.addLast(part);
		   }
		   
		}
		while(!s.isEmpty()) {
			 sb.append(s.removeFirst());
			 if (!s.isEmpty()) {
			        sb.append("/");
			    }
		}
		return sb.toString();
    }
}