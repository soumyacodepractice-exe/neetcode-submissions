class Solution {

    public String encode(List<String> strs) {
            String encoded_string ="";
            
            for(String s: strs) {
                int len = s.length();
                String curr_enc = len + "#" + s;
                encoded_string  += curr_enc; 
            }
            
            return encoded_string;
    }

    public List<String> decode(String str) {
    List<String> decoded_res = new ArrayList<>();
    int i = 0;

    while (i < str.length()) {
        int j = i;

        while (str.charAt(j) != '#') {
            j++;
        }

        int length = Integer.parseInt(str.substring(i, j));
        j++;

        decoded_res.add(str.substring(j, j + length));
        i = j + length;
    }

    return decoded_res;
}
}
