class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        int[] xCount = new int[10];
        int[] yCount = new int[10];

        for (char c : X.toCharArray()) {
            int num = c - '0';
            xCount[num]++;
        }

        for (char c : Y.toCharArray()) {
            int num = c - '0';
            yCount[num]++;
        }
        
        for (int i = 9; i >= 0; i--) {
            int count = Math.min(xCount[i], yCount[i]);
            
            for (int j = 0; j < count; j++) {
                answer.append(i);
            }
        }

        if (answer.isEmpty()) return "-1";
        if (answer.charAt(0) == '0') return "0";

        return answer.toString();
    }
}