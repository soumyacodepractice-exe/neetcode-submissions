class Solution {
    public String minWindow(String s, String t) {
         if (t.length() == 0 || s.length() == 0) {
            return""; 
        }

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        int[] tFreq = new int[128]; 
        for (char c : t.toCharArray()) {
            tFreq[c]++;
        }

        int[] windowFreq = new int[128];
        int required = 0;
        int formed = 0;

        Set<Character> requiredChars = new HashSet<>();
        for (char c : t.toCharArray()) {
            requiredChars.add(c);
        }
        required = requiredChars.size();

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            windowFreq[c]++;

            
            if (requiredChars.contains(c) && windowFreq[c] == tFreq[c]) {
                formed++;
            }

            while (left <= right && formed == required) {
                
                int currentLen = right - left + 1;
                if (currentLen < minLen) {
                    minLen = currentLen;
                    start = left;
                }

                char chLeft = s.charAt(left);
                windowFreq[chLeft]--;
                if (requiredChars.contains(chLeft) && windowFreq[chLeft] < tFreq[chLeft]) {
                    formed--;
                }

                left++;
            }
        }

       return (minLen == Integer.MAX_VALUE) ? "" : s.substring(start, start + minLen);  
    }
}
