class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] can = {"aya", "ye", "woo", "ma"};

        for (String s : babbling) {
            if (s.contains("ayaaya") || s.contains("yeye") || s.contains("woowoo") || s.contains("mama")) {
                continue;
            }

            for (String speak : can) {
                s = s.replace(speak, " ");
            }
            
            if (s.isBlank()) {
                answer++;
            }
        }

        return answer;
    }
}