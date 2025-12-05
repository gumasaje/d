class Solution {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < my_string.length(); j++) sb.append(my_string.charAt(j));
        }
        return sb.toString();
    }
}