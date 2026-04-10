class Solution {
    public String solution(String s) {

        int index = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                index = 0;
                sb.append(c);
            } else {
                if (index % 2 == 0) {
                    c = Character.toUpperCase(c);
                    sb.append(c);
                    index++;
                } else {
                    c = Character.toLowerCase(c);
                    sb.append(c);
                    index++;
                }
            }
        }
        
        return sb.toString();
    }
}