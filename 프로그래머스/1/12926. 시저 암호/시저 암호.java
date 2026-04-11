class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append(c);
                continue;
            }
            char base = Character.isUpperCase(c) ? 'A' : 'a';
            sb.append((char) ((c - base + n) % 26 + base));
        }
        
        return sb.toString();
    }
}